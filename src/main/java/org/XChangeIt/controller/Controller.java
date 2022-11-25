package org.XChangeIt.controller;
import org.XChangeIt.model.MainModel;
import org.XChangeIt.model.Money;
import org.XChangeIt.model.Translator;
import org.XChangeIt.view.AppView;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Controller {
    private final AppView appView;
    private final MainModel testModel;

    public Controller(AppView appView, MainModel testModel) {
        this.appView = appView;
        this.testModel = testModel;

        initController();
    }
    public void initController() {
        for(JButton button : appView.getLanguageButtons()) {
            button.addActionListener(new languageListener());
        }
        appView.getHelpButton().addActionListener(new helpListener());
        appView.getConvertButton().addActionListener(new converterListener());
    }


    public class languageListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Translator translator = Translator.getTranslatorByValue(e.getActionCommand());
            testModel.setTranslator(translator);
            appView.generateConverterView(testModel.getTranslator());
        }
    }

    public class converterListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(appView.getTermsCheckBox().isSelected()) {
                Money startingAmount = new Money((String) appView.getCurrencyComboBox().getSelectedItem(),
                        Double.parseDouble(String.valueOf(appView.getAmountSpinner().getValue())));
                Converter converter = new Converter(startingAmount);

                testModel.setTransaction(new Date(), startingAmount, converter.getConvertedAmount(), converter.getFees());
                if(appView.generateSummaryView(testModel.getTranslator(), testModel.getReceipt().getReceiptData()) == 0){
                    appView.enableConverterPanel();
                } else {
                    appView.generateReceiptView(testModel.getReceipt().getReceiptData());
                }
            } else {
                appView.generateErrorMessage("Error", "Please agree to terms inorder to proceed.");
            }
        }
    }

    public class helpListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            appView.generateHelpView(testModel.getTranslator().getHelpButtonText(),
                    testModel.getTranslator().getHelpMessage());
        }
    }
}
