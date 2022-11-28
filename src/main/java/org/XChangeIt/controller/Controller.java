package org.XChangeIt.controller;

import org.XChangeIt.model.AppModel;
import org.XChangeIt.model.Money;
import org.XChangeIt.translation.Translator;
import org.XChangeIt.view.AppView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Controller class to facilitate the overall control of the program, common connection for View and Model classes.
 */
public class Controller {
    private final AppView appView;      //Variable to hold the app view
    private final AppModel appModel;    //Variable to hold the appModel

    /**
     * Initializes the private variables of the Controller class
     * @param appView loads into the class's the appView
     * @param appModel loads into the class's the appModel
     */
    public Controller(AppView appView, AppModel appModel) {
        this.appView = appView;
        this.appModel = appModel;

        initController();
    }

    /**
     * Function to initialize the controller
     */
    public void initController() {
        for(JButton button : appView.getLanguageButtons()) {
            button.addActionListener(new languageListener());
        }
        appView.getHelpButton().addActionListener(new helpListener());
        appView.getConvertButton().addActionListener(new converterListener());
    }

    /**
     * Function to listen for the language
     */
    public class languageListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Translator translator = Translator.getTranslatorByValue(e.getActionCommand());
            appModel.setTranslator(translator);
            appView.generateConverterView(appModel.getTranslator());
        }
    }

    /**
     * Function to listen for when to convert the currency. Depending on the action selected after
     * converting, the program may do another transaction, or print the receipt.
     */
    public class converterListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(appView.getTermsCheckBox().isSelected()) {
                Money startingAmount = new Money((String) appView.getCurrencyComboBox().getSelectedItem(),
                        Double.parseDouble(String.valueOf(appView.getAmountSpinner().getValue())));
                Converter converter = new Converter(startingAmount);

                appModel.setTransaction(new Date(), startingAmount, converter.getConvertedAmount(), converter.getFees());
                if(appView.generateSummaryView(appModel.getTranslator(), appModel.getReceipt().getReceiptData()) == 0){
                    appView.enableConverterView();
                } else {
                    StringBuilder receiptText = new StringBuilder();
                    for(int i = 0; i < appModel.getTransactionList().getTransactionArrayList().size(); i++){
                        receiptText.append("\n\n").append(appModel.getReceiptList().getReceiptByIndex(i).getReceiptData());
                    }
                    appView.generateReceiptView(receiptText + "\n\n" +
                            appModel.getTranslator().getThanksMessage());
                }
            } else {
                appView.generateErrorMessage(appModel.getTranslator());
            }
        }
    }

    /**
     * Function to listen for the help button to be pressed, at which point a help message will appear
     */
    public class helpListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            appView.generateHelpView(appModel.getTranslator().getHelpButtonText(),
                    appModel.getTranslator().getHelpMessage());
        }
    }
}
