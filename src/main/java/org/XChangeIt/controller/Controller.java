package org.XChangeIt.controller;
import org.XChangeIt.model.AppModel;
import org.XChangeIt.model.Money;
import org.XChangeIt.translation.Translator;
import org.XChangeIt.view.AppView;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Controller {
    private final AppView appView;
    private final AppModel appModel;

    public Controller(AppView appView, AppModel appModel) {
        this.appView = appView;
        this.appModel = appModel;

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
            appModel.setTranslator(translator);
            appView.generateConverterView(appModel.getTranslator());
        }
    }

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
                    appView.generateReceiptView(appModel.getReceipt().getReceiptData());
                }
            } else {
                appView.generateErrorMessage(appModel.getTranslator());
            }
        }
    }

    public class helpListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            appView.generateHelpView(appModel.getTranslator().getHelpButtonText(),
                    appModel.getTranslator().getHelpMessage());
        }
    }
}
