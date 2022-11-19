package org.XChangeIt.gui;

import org.XChangeIt.Converter;
import org.XChangeIt.Main;
import org.XChangeIt.models.Money;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import java.awt.*;
import java.awt.event.*;

import java.awt.event.ActionListener;

public class MainContainer extends JFrame {
    private JFrame frame;
    private JButton englishB;
    private JButton spanishB;
    private JButton japaneseB;
    private JButton chineseB;
    private JComboBox<String> currencySelector;
    private JButton convertB;
    private JPanel langButtons;
    private JPanel selector;
    private JPanel helpButton;
    private JPanel convertPanel;
    private Money money;
    String[] currenciesSupported = {"Euro", "U.K. Pound Sterling", "Australian Dollar"};

    public MainContainer(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        englishB = new JButton("ENGLISH");
        englishB.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame engWindow = new JFrame();
                engWindow.setLayout(new GridLayout(5, 2));
                engWindow.setSize(500, 500);
                engWindow.setLocationRelativeTo(null);

                JLabel greet = new JLabel("Welcome To XChangeIt");
                greet.setSize(50, 50);

                JPanel label = new JPanel();
                label.add(greet);

                JLabel currencyL = new JLabel("Currency: ");
                currencyL.setFont(new Font("Arial", Font.BOLD, 15));
                currencyL.setSize(30, 30);

                JPanel comboBoxPanel = new JPanel();
                comboBoxPanel.setLayout(new GridLayout(2, 1));
                comboBoxPanel.add(currencyL);

                JComboBox<String> currencyBox = new JComboBox<>(currenciesSupported);
                currencyBox.setSize(30, 30);
                comboBoxPanel.add(currencyBox);

                JLabel amountL = new JLabel("Amount");
                amountL.setFont(new Font("Arial", Font.BOLD, 15));
                amountL.setSize(30, 30);

                comboBoxPanel.add(amountL);

                JTextField textField = new JTextField(10);
                textField.setBackground(Color.lightGray);
                textField.setSize(100, 30);
                comboBoxPanel.add(textField);

                JButton convert = new JButton("Convert");
                convert.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Double amt = Double.valueOf((String)textField.getText());
                        String amtreceipt = String.valueOf((amt));
                        System.out.println(amt);

                        JFrame receipt = new JFrame();
                        JPanel receiptOut = new JPanel();
                        JLabel amountEntered = new JLabel();
                        JLabel amtinput = new JLabel();
                        JLabel fee = new JLabel();
                        JLabel feeamt = new JLabel();
                        JLabel total = new JLabel();
                        JLabel totalout = new JLabel();
                        amountEntered.setText("Amount to Convert:");
                        amtinput.setText(amtreceipt);
                        fee.setText("Fee:");
                        feeamt.setText("0.022");
                        total.setText("Total:");
                        totalout.setText(" ");

                        receiptOut.add(amountEntered);
                        receiptOut.add(amtinput);
                        receiptOut.add(fee);
                        receiptOut.add(feeamt);
                        receiptOut.add(total);
                        receiptOut.add(totalout);
                        receipt.setLayout(new GridLayout(5, 1));
                        receiptOut.setLayout(new GridLayout(3, 1));
                        receipt.add(receiptOut, BorderLayout.CENTER);
                        receipt.setSize(250, 450);
                        receipt.setLocationRelativeTo(null);
                        receipt.setVisible(true);
                        engWindow.dispose();
                    }
                });
                JPanel buttons = new JPanel();
                buttons.add(convert);

                JButton helpB = new JButton("Help/FAQs");
                helpB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame helpWindow = new JFrame();
                        JLabel help = new JLabel();
                        JPanel helpLabel = new JPanel();
                        helpLabel.add(help);
                        help.setSize(50, 50);
                        help.setText("This is used to convert currencies. Select which currencies you would like to convert from and then input the amount you would like to convert.");
                        helpWindow.add(helpLabel, BorderLayout.CENTER);
                        helpWindow.setSize(500, 500);
                        helpWindow.setLocationRelativeTo(null);
                        helpWindow.setVisible(true);
                        engWindow.dispose();
                    }
                });
                buttons.add(helpB);

                engWindow.add(label, BorderLayout.NORTH);
                engWindow.add(comboBoxPanel, BorderLayout.CENTER);
                engWindow.add(buttons, BorderLayout.SOUTH);
                engWindow.setVisible(true);

                frame.dispose();
            }
        });



        spanishB = new JButton("ESPAÑOL");
        spanishB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JTextField spanGreet = new JTextField();
                JLabel greet = new JLabel();
                JPanel label = new JPanel();
                label.add(greet);
                JButton convert = new JButton();
                JPanel converter = new JPanel();
                JButton helpB = new JButton("Ayuda");
                converter.add(convert);
                converter.add(helpB);
                JFrame spanWindow = new JFrame();
                spanWindow.setSize(500, 500);
                greet.setSize(50, 50);
                greet.setText("¡Bienvenidos!");
                spanWindow.add(label, BorderLayout.CENTER);
                spanWindow.setVisible(true);

                convert.setText("Convertir");
                spanWindow.add(converter, BorderLayout.SOUTH);
                spanWindow.add(label, BorderLayout.CENTER);
                spanWindow.setVisible(true);

                convert.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame receipt = new JFrame();
                        receipt.setSize(500, 500);
                        receipt.setVisible(true);
                    }
                });
                /** When the help button is pressed then it pops up another window that instructs the user
                 *  how to work the program. It also has some frequently asked questions in hopes of helping
                 *  the user with any problems that may have occurred for them.
                 * */
                helpB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame helpWindow = new JFrame();
                        JLabel help = new JLabel();
                        JPanel helpLabel = new JPanel();
                        helpLabel.add(help);
                        help.setSize(50, 50);
                        help.setText("This is used to convert currencies. Select which currencies you would like to convert from and then input the amount you would like to convert.");
                        helpWindow.add(helpLabel, BorderLayout.CENTER);
                        helpWindow.setSize(500, 500);
                        helpWindow.setVisible(true);
                    }
                });
            }
        });

        japaneseB = new JButton("日本");
        japaneseB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JTextField japGreet = new JTextField();
                JLabel greet = new JLabel();
                JPanel label = new JPanel();
                label.add(greet);
                JButton convert = new JButton();
                JPanel converter = new JPanel();
                JButton helpB = new JButton("ヘルプ");
                converter.add(convert);
                converter.add(helpB);
                JFrame japWindow = new JFrame();
                japWindow.setSize(500, 500);
                greet.setSize(50, 50);
                greet.setText("いらっしゃいませ!");
                japWindow.add(label, BorderLayout.CENTER);
                japWindow.setVisible(true);

                convert.setText("変換");
                japWindow.add(converter, BorderLayout.SOUTH);
                japWindow.add(label, BorderLayout.CENTER);
                japWindow.setVisible(true);

                convert.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame receipt = new JFrame();
                        receipt.setSize(500, 500);
                        receipt.setVisible(true);
                    }
                });
                helpB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame helpWindow = new JFrame();
                        JLabel help = new JLabel();
                        JPanel helpLabel = new JPanel();
                        helpLabel.add(help);
                        help.setSize(50, 50);
                        help.setText("This is used to convert currencies. Select which currencies you would like to convert from and then input the amount you would like to convert.");
                        helpWindow.add(helpLabel, BorderLayout.CENTER);
                        helpWindow.setSize(500, 500);
                        helpWindow.setVisible(true);
                    }
                });
            }
        });

        chineseB = new JButton("中国人");
        chineseB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JTextField chinGreet = new JTextField();
                JLabel greet = new JLabel();
                JPanel label = new JPanel();
                label.add(greet);
                JButton convert = new JButton();
                JPanel converter = new JPanel();
                JButton helpB = new JButton("幫助");
                converter.add(convert);
                converter.add(helpB);
                JFrame chinWindow = new JFrame();
                chinWindow.setSize(500, 500);
                chinWindow.setLocationRelativeTo(null);
                greet.setSize(50, 50);
                greet.setText("欢迎!");
                chinWindow.add(label, BorderLayout.CENTER);
                chinWindow.setVisible(true);

                convert.setText("兌換");
                chinWindow.add(converter, BorderLayout.SOUTH);
                chinWindow.add(label, BorderLayout.CENTER);
                chinWindow.setVisible(true);
                frame.dispose();

                convert.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame receipt = new JFrame();
                        JPanel receiptOut = new JPanel();
                        JLabel amountEntered = new JLabel();
                        JLabel amtinput = new JLabel();
                        JLabel fee = new JLabel();
                        JLabel feeamt = new JLabel();
                        JLabel total = new JLabel();
                        JLabel totalout = new JLabel();
                        amountEntered.setText("Amount to Convert:");
                        amtinput.setText(" ");
                        fee.setText("Fee:");
                        feeamt.setText("0.022");
                        total.setText("Total:");
                        totalout.setText(" ");

                        receiptOut.add(amountEntered);
                        receiptOut.add(amtinput);
                        receiptOut.add(fee);
                        receiptOut.add(feeamt);
                        receiptOut.add(total);
                        receiptOut.add(totalout);

                        receipt.setSize(150, 500);
                        receipt.setLocationRelativeTo(null);
                        receipt.setVisible(true);
                        chinWindow.dispose();
                    }
                });
                helpB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame helpWindow = new JFrame();
                        JLabel help = new JLabel();
                        JPanel helpLabel = new JPanel();
                        helpLabel.add(help);
                        help.setSize(50, 50);
                        help.setText("This is used to convert currencies. Select which currencies you would like to convert from and then input the amount you would like to convert.");
                        helpWindow.add(helpLabel, BorderLayout.CENTER);
                        helpWindow.setSize(750, 500);
                        helpWindow.setLocationRelativeTo(null);
                        helpWindow.setVisible(true);
                        frame.dispose();
                    }
                });
            }
        });

        currencySelector = new JComboBox<>(currenciesSupported);

        convertB = new JButton("Convert");
        convertB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                money = new Money((String)currencySelector.getSelectedItem(), 5000 );
                Converter converter = new Converter(money);
                System.out.println(converter.doConvert().getAmount());
            }
        });
        convertPanel = new JPanel();
        convertPanel.add(convertB);


        langButtons = new JPanel(); //creates a panel to put buttons onto the frame
        langButtons.add(englishB);
        langButtons.add(spanishB);
        langButtons.add(japaneseB);
        langButtons.add(chineseB);

        selector = new JPanel();
        selector.add(currencySelector);

       // helpButton = new JPanel();


       // frame.add(helpButton, BorderLayout.SOUTH);
        //frame.add(convertPanel, BorderLayout.SOUTH);
        //frame.add(selector, BorderLayout.CENTER);
        frame.add(langButtons, BorderLayout.NORTH);
        frame.setSize(750, 500); //creates the main window for the program
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); //the window is visible
    }

}
