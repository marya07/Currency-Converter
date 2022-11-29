package org.XChangeIt.view;

import org.XChangeIt.translation.Translator;

import javax.swing.*;
import java.awt.*;

/**
 *  Class for handling the gui for the program, displaying various initializing and displaying various gui components
 */
public class AppView {
    //holds an array of strings that contains which languages are supported
    private final String[] languageSupport = {"ENGLISH", "中国人", "FRANÇAIS", "DEUTSCH", "日本", "PORTUGUÊS",
                                                                                                "РУССКИЙ", "ESPAÑOL"};
    //holds an array of strings that contains which currencies are supported
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
    private final JTextArea termsText = new JTextArea();
    private final SpinnerModel amountValue = new SpinnerNumberModel(1000, 100, 25000, 1);
    private final JSpinner amountSpinner = new JSpinner(amountValue);

    /**
     * Class constructor responsible for initializing language buttons for the main view and generating the main view or
     * language selection view.
     */
    public AppView() {
        for (int i = 0; i < languageButtons.length; i++) {
            languageButtons[i] = new JButton(languageSupport[i]);
        }
        generateMainView();
    }

    /**
     * Method for setting and populating the main view/language selection view with language selection buttons.
     */
    public void generateMainView() {
        frame.setTitle("XChangeIt Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        languagePanel.setBackground(Color.lightGray);
        languagePanel.setLayout(new GridLayout(8, 1));
        languagePanel.setBorder(BorderFactory.createEmptyBorder(50, 75, 50, 75));

        for (JButton button : languageButtons) {
            languagePanel.add(button);
        }
        frame.add(languagePanel);
    }

    /**
     * Method for disabling/hiding the language panel to disable the main view.
     */
    public void disableMainView() {
        languagePanel.setVisible(false);
    }

    /**
     * Method for setting and populating the converter view with converter components for currency selection,
     * amount input, displaying terms checkbox, button for handling conversion and button for help window.
     * @param translator translator instance for a given language selected by the user to populate text in
     *                   the preferred language.
     */
    public void generateConverterView(Translator translator) {
        disableMainView();
        converterPanel.setLayout(new BoxLayout(converterPanel, BoxLayout.Y_AXIS));
        converterPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        converterPanel.setPreferredSize(new Dimension(400, 400));
        converterPanel.setMaximumSize(new Dimension(400, 400));
        converterPanel.setMinimumSize(new Dimension(400, 400));
        converterPanel.setBorder(BorderFactory.createTitledBorder("CONVERTER"));
        converterPanel.setBackground(Color.lightGray);

        JPanel greetingPanel = new JPanel();
        greetingLabel.setFont(new Font("Sans", Font.BOLD, 35));
        greetingLabel.setText(translator.getGreetingLabelText());
        greetingPanel.add(greetingLabel);
        converterPanel.add(greetingPanel);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBorder(BorderFactory.createEmptyBorder(75, 75, 75,25));

        JPanel comboBoxPanel = new JPanel();
        currencyComboBox.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel currencyLabel = new JLabel("Currency: ");
        currencyLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        currencyLabel.setLabelFor(currencyComboBox);
        comboBoxPanel.add(currencyLabel);
        comboBoxPanel.add(currencyComboBox);
        topPanel.add(comboBoxPanel);

        JPanel amountPanel = new JPanel();
        amountSpinner.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel amountLabel = new JLabel("Amount: ");
        amountLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        amountLabel.setLabelFor(amountSpinner);
        amountPanel.add(amountLabel);
        amountPanel.add(amountSpinner);
        topPanel.add(amountPanel);

        converterPanel.add(topPanel);

        JPanel termsPanel = new JPanel();
        termsText.setEditable(false);
        termsText.setText(translator.getTermsBoxText());
        termsText.setLineWrap(true);
        termsText.setSize(350, 30);
        termsText.setFont(new Font("Sans", Font.PLAIN, 15));
        termsText.setForeground(Color.red);
        termsText.setBackground(Color.orange);
        termsPanel.add(termsCheckBox);
        termsPanel.add(termsText);
        converterPanel.add(termsPanel);


        JPanel lowerPanel = new JPanel();
        convertButton.setFont(new Font("Sans", Font.BOLD, 25));
        convertButton.setForeground(new Color(0, 153,0));
        convertButton.setText(translator.getConvertButtonText());
        lowerPanel.add(convertButton);

        converterPanel.add(lowerPanel);

        JPanel helpPanel = new JPanel();
        helpButton.setFont(new Font("Sans", Font.PLAIN, 20));
        helpButton.setForeground(Color.blue);
        helpButton.setText(translator.getHelpButtonText());
        helpPanel.add(helpButton);
        converterPanel.add(helpPanel);

        converterPanel.setBackground(Color.lightGray);
        frame.add(converterPanel);
    }

    /**
     * Method for enabling the converter panel to enable the converter view.
     */
    public void enableConverterView() {
        converterPanel.setVisible(true);
    }

    /**
     * Method for disabling/hiding the converter panel to disable the converter view.
     */
    public void disableConverterView(){
        converterPanel.setVisible(false);
    }

    /**
     * Method for generating a Dialog window with help message in the preferred language.
     * @param helpText "Help" text in the preferred language for setting tile.
     * @param helpMessage Help message in the preferred language for displaying as a message in the window.
     */
    public void generateHelpView(String helpText, String helpMessage){
        Image icon = new ImageIcon("src/main/resources/Icons/QuestionMarkIcon.png").getImage().
                getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        JOptionPane.showMessageDialog(frame, helpMessage, helpText, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
    }

    /**
     * Method for generating an error dialog window if user tried to convert without agreeing to the terms.
     * @param translator translator instance for a given language selected by the user to populate text in
     *                   the preferred language.
     */
    public void generateErrorMessage(Translator translator){
        Image icon = new ImageIcon("src/main/resources/Icons/exclamationIcon.png").getImage().
                getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        JOptionPane.showMessageDialog(frame, translator.getErrorMessage(), translator.getErrorText(),
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
    }

    /**
     * Method for generating an option dialog window with the details of transaction and asking user if they want to do
     * more conversion.
     * @param translator translator instance for a given language selected by the user to populate text in
     *                   the preferred language
     * @param summary String with data for the current processed transaction.
     * @return returns an int 0 or 1 to be used as logical check inside the controller.
     */
    public int generateSummaryView(Translator translator, String summary){
        disableConverterView();
        Image icon = new ImageIcon("src/main/resources/Icons/checkMarkIcon.png").getImage().
                getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        return JOptionPane.showConfirmDialog(frame, translator.getSuccessMessage() +
                        "\n\n" + summary + "\n\n" + translator.getRepeatText(), translator.getSummaryTitle(),
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(icon));
    }


    /**
     * Method for generating a receipt for all the transactions the user performed.
     * @param receiptText String with details of the transaction in the preferred language.
     */
    public void generateReceiptView(String receiptText){
        frame.setVisible(false);
        Image icon = new ImageIcon("src/main/resources/Icons/handShakeIcon.png").getImage().
                getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        JOptionPane.showMessageDialog(frame, receiptText, "Receipt", JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(icon));
        frame.setVisible(false);
        System.exit(0);
    }

    /**
     * Function to get the language button
     * @return languageButtons
     */
    public JButton[] getLanguageButtons() {
        return languageButtons;
    }

    /**
     * Function to get the convert button
     * @return convertButton
     */
    public JButton getConvertButton() {
        return convertButton;
    }

    /**
     * Function to get the help button
     * @return helpButton
     */
    public JButton getHelpButton() {
        return helpButton;
    }

    /**
     * Function to get the currency combo box
     * @return currencyComboBox
     */
    public JComboBox<String> getCurrencyComboBox() {
        return currencyComboBox;
    }

    /**
     * Function to get the terms check box
     * @return termsCheckBox
     */
    public JCheckBox getTermsCheckBox() {
        return termsCheckBox;
    }

    /**
     * Function to get the amount spinner
     * @return amountSpinner
     */
    public JSpinner getAmountSpinner() {
        return amountSpinner;
    }

}
