package org.XChangeIt.view;

import org.XChangeIt.model.Translator;

import javax.swing.*;
import java.awt.*;

public class AppView {
    private final String[] languageSupport = {"ENGLISH", "中国人", "FRANÇAIS", "DEUTSCH", "日本", "PORTUGUÊS", "РУССКИЙ", "ESPAÑOL"};
    private final String[] currencySupport = {"AUD", "BRL", "CAD", "CNY", "EUR", "GBP", "INR", "JPY", "MXN", "NZD", "RUB"};
    private final JFrame frame = new JFrame();
    private final JPanel languagePanel = new JPanel();
    private final JPanel converterPanel = new JPanel();
    private final JButton[] languageButtons = new JButton[languageSupport.length];
    private final JLabel greetingLabel = new JLabel();
    private final JButton convertButton = new JButton();
    private final JButton helpButton = new JButton();
    private final JComboBox<String> currencyComboBox = new JComboBox<>(currencySupport);
    private final JCheckBox termsCheckBox = new JCheckBox();
    private final SpinnerModel amountValue = new SpinnerNumberModel(100, 100, 1000000, 1);
    private final JSpinner amountSpinner = new JSpinner(amountValue);

    public AppView() {
        for (int i = 0; i < languageButtons.length; i++) {
            languageButtons[i] = new JButton(languageSupport[i]);
        }
        generateMainView();
    }

    public void generateMainView() {
        frame.setTitle("XChangeIt Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        languagePanel.setLayout(new GridLayout(8, 1));
        languagePanel.setBorder(BorderFactory.createEmptyBorder(50, 75, 50, 75));

        for (JButton button : languageButtons) {
            languagePanel.add(button);
        }
        frame.add(languagePanel);
    }

    public void disableMainView() {
        languagePanel.setVisible(false);
    }

    public void generateConverterView(Translator translator) {
        disableMainView();
        converterPanel.setLayout(new BoxLayout(converterPanel, BoxLayout.Y_AXIS));
        converterPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        converterPanel.setPreferredSize(new Dimension(400, 400));
        converterPanel.setMaximumSize(new Dimension(400, 400));
        converterPanel.setMinimumSize(new Dimension(400, 400));
        converterPanel.setBorder(BorderFactory.createTitledBorder("CONVERTER"));

        JPanel greetingPanel = new JPanel();
        greetingLabel.setFont(new Font("Sans", Font.ITALIC, 35));
        greetingLabel.setText(translator.getGreetingLabelText());
        greetingPanel.add(greetingLabel);
        converterPanel.add(greetingPanel);

        JPanel comboBoxPanel = new JPanel();
        currencyComboBox.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel currencyLabel = new JLabel("Currency: ");
        currencyLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        currencyLabel.setLabelFor(currencyComboBox);
        comboBoxPanel.add(currencyLabel);
        comboBoxPanel.add(currencyComboBox);
        converterPanel.add(comboBoxPanel);

        JPanel amountPanel = new JPanel();
        amountSpinner.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel amountLabel = new JLabel("Amount: ");
        amountLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        amountLabel.setLabelFor(amountSpinner);
        amountPanel.add(amountLabel);
        amountPanel.add(amountSpinner);
        converterPanel.add(amountPanel);


        JPanel lowerPanel = new JPanel();
        termsCheckBox.setFont(new Font("Arial", Font.PLAIN, 15));
        termsCheckBox.setForeground(Color.red);
        termsCheckBox.setText(translator.getTermsBoxText());
        lowerPanel.add(termsCheckBox);

        convertButton.setFont(new Font("Arial", Font.PLAIN, 25));
        convertButton.setForeground(new Color(0, 153,0));
        convertButton.setText(translator.getConvertButtonText());
        lowerPanel.add(convertButton);

        converterPanel.add(lowerPanel);

        JPanel helpPanel = new JPanel();
        helpButton.setFont(new Font("Arial", Font.PLAIN, 20));
        helpButton.setForeground(Color.blue);
        helpButton.setText(translator.getHelpButtonText());
        helpPanel.add(helpButton);
        converterPanel.add(helpPanel);

        converterPanel.setBackground(Color.lightGray);
        frame.add(converterPanel);
    }


    public void disableConverterView(){
        converterPanel.setVisible(false);
    }

    public void generateHelpView(String helpText, String helpMessage){
        Image icon = new ImageIcon("src/main/resources/Icons/QuestionMarkIcon.png").getImage().
                getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        JOptionPane.showMessageDialog(frame, helpMessage, helpText, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
    }

    public void generateErrorMessage(String errorText, String errorMessage){
        Image icon = new ImageIcon("src/main/resources/Icons/exclamationIcon.png").getImage().
                getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        JOptionPane.showMessageDialog(frame, errorMessage, errorText, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
    }
    public int generateSummaryView(Translator translator, String summary){
        disableConverterView();
        Image icon = new ImageIcon("src/main/resources/Icons/checkMarkIcon.png").getImage().
                getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        return JOptionPane.showConfirmDialog(frame, "Transaction Successful!\n\n"+ summary + "\n\n" +
                        translator.getRepeatText(), "Transaction Summary",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(icon));
    }

    public void generateReceiptView(String receiptText){
        frame.setVisible(false);
        Image icon = new ImageIcon("src/main/resources/Icons/handShakeIcon.png").getImage().
                getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        JOptionPane.showMessageDialog(frame, receiptText, "Receipt", JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(icon));
        frame.setVisible(false);
        System.exit(0);
    }

    public JButton[] getLanguageButtons() {
        return languageButtons;
    }

    public JButton getConvertButton() {
        return convertButton;
    }

    public JButton getHelpButton() {
        return helpButton;
    }

    public JComboBox<String> getCurrencyComboBox() {
        return currencyComboBox;
    }

    public JCheckBox getTermsCheckBox() {
        return termsCheckBox;
    }

    public void enableConverterPanel() {
        converterPanel.setVisible(true);
    }

    public JSpinner getAmountSpinner() {
        return amountSpinner;
    }

}
