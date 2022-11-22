package org.XChangeIt.view;
import org.XChangeIt.model.Translator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterView {

    public ConverterView (Translator translator) {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel label = new JPanel();
        JLabel greet = new JLabel(translator.getGreeting());
        label.add(greet);

        JPanel input = new JPanel();
        JComboBox<String> currencySelect = new JComboBox<>(currencyList);
        input.add(currencySelect);

        JTextField amountInput = new JTextField("0000.00"); //creates the text box for user to enter amount they wish to convert
        amountInput.setColumns(10);
        input.add(amountInput);

        JCheckBox agree = new JCheckBox(translator.getFee());
        input.add(agree);

        JPanel lowerPanel = new JPanel();
        JButton convert = new JButton(translator.getConvert());
        convert.addActionListener(new convertButtonActionListener(translator));
        lowerPanel.add(convert);

        JButton helpB = new JButton(translator.getHelp());
        helpB.addActionListener(new helpButtonActionListener(translator));
        lowerPanel.add(helpB);

        frame.add(label);
        frame.add(input);
        frame.add(lowerPanel);

        frame.setLayout(new GridLayout(3, 1));
        frame.setSize(500, 650);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); //the window is visible
        frame.setVisible(true);
    }

    static class convertButtonActionListener implements ActionListener {
        public convertButtonActionListener(Translator translator) {
            this.translator = translator;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (translator != null) {
                ReceiptView receiptView = new ReceiptView(translator);
            }
            frame.setVisible(false);
        }
        private final Translator translator;
    }

    static class helpButtonActionListener implements ActionListener {
        public helpButtonActionListener(Translator translator){
            this.translator = translator;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (translator != null) {
                JOptionPane.showMessageDialog(frame, translator.helpMessage());
            }
        }
        private final Translator translator;
    }

    private final String[] currencyList = {"AUD","BRL","CAD","CNY","EUR","GBP","INR","JPY","MXN","NZD","RUB"};
    private static JFrame frame;
}
