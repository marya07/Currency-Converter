package org.XChangeIt;

import org.XChangeIt.translation.Translator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Component.CENTER_ALIGNMENT;


public class GUI {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea currencyamt = new JTextArea(); //creates the text box for user to enter amount they wish to convert


        /** When the english button is pressed then it pops up the greeting in english */
        JButton englishB = new JButton("ENGLISH"); //creates the english button
        englishB.setAlignmentX(CENTER_ALIGNMENT);
        englishB.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                Translator language = Translator.ENGLISH;
                openConversionWindow(language);
            }

        });

        /** When the chinese button is pressed then it pops up the greeting in chinese */
        JButton chineseB = new JButton("中国人"); //creates the chinese button
        chineseB.setAlignmentX(CENTER_ALIGNMENT);
        chineseB.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                Translator language = Translator.CHINESE;
                openConversionWindow(language);
            }

        });

        /** When the french button is pressed then it pops up the greeting in french */
        JButton frenchB = new JButton("FRANÇAIS"); //creates the french button
        frenchB.setAlignmentX(CENTER_ALIGNMENT);
        frenchB.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                Translator language = Translator.FRENCH;
                openConversionWindow(language);
            }

        });

        /** When the german button is pressed then it pops up the greeting in german */
        JButton germanB = new JButton("DEUTSCH"); //creates the german button
        germanB.setAlignmentX(CENTER_ALIGNMENT);
        germanB.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                Translator language = Translator.GERMAN;
                openConversionWindow(language);
            }

        });

        /** When the japanese button is pressed then it pops up the greeting in japanese */
        JButton japaneseB = new JButton("日本"); //creates the japanese button
        japaneseB.setAlignmentX(CENTER_ALIGNMENT);
        japaneseB.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                Translator language = Translator.JAPANESE;
                openConversionWindow(language);
            }

        });

        /** When the portuguese button is pressed then it pops up the greeting in portuguese */
        JButton portugueseB = new JButton("PORTUGUÊS"); //creates the portuguese button
        portugueseB.setAlignmentX(CENTER_ALIGNMENT);
        portugueseB.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                Translator language = Translator.PORTUGUESE;
                openConversionWindow(language);
            }

        });

        /** When the russian button is pressed then it pops up the greeting in russian */
        JButton russianB = new JButton("РУССКИЙ"); //creates the russian button
        russianB.setAlignmentX(CENTER_ALIGNMENT);
        russianB.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                Translator language = Translator.RUSSIAN;
                openConversionWindow(language);
            }

        });

        /** When the spanish button is pressed then it pops up the greeting in spanish */
        JButton spanishB = new JButton("ESPAÑOL"); //creates the spanish button
        spanishB.setAlignmentX(CENTER_ALIGNMENT);
        spanishB.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                Translator language = Translator.SPANISH;
                openConversionWindow(language);
            }

        });

        JPanel buttons = new JPanel(); //creates a panel to put buttons onto the frame
        buttons.setLayout(new BoxLayout (buttons, BoxLayout.Y_AXIS));
        buttons.add(Box.createVerticalStrut(10));
        buttons.add(englishB);
        buttons.add(Box.createVerticalStrut(10));
        buttons.add(chineseB);
        buttons.add(Box.createVerticalStrut(10));
        buttons.add(frenchB);
        buttons.add(Box.createVerticalStrut(10));
        buttons.add(germanB);
        buttons.add(Box.createVerticalStrut(10));
        buttons.add(japaneseB);
        buttons.add(Box.createVerticalStrut(10));
        buttons.add(portugueseB);
        buttons.add(Box.createVerticalStrut(10));
        buttons.add(russianB);
        buttons.add(Box.createVerticalStrut(10));
        buttons.add(spanishB);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(buttons, BorderLayout.CENTER);
        frame.setVisible(true); //the window is visible
    }

    public static void openConversionWindow(Translator language) {
        JLabel greet = new JLabel();
        JPanel label = new JPanel();
        label.add(greet);
        JButton convert = new JButton();
        JButton helpB = new JButton();
        switch (language) {
            case ENGLISH -> {
                helpB.setText("Help");
                greet.setText("Welcome!");
                convert.setText("Convert");
            }
            case CHINESE -> {
                helpB.setText("帮助");
                greet.setText("欢迎！");
                convert.setText("兑换");
            }
            case FRENCH -> {
                helpB.setText("Aider");
                greet.setText("Bienvenu!");
                convert.setText("Convertir");
            }
            case GERMAN -> {
                helpB.setText("Hilfe");
                greet.setText("Willkommen!");
                convert.setText("Konvertieren");
            }
            case JAPANESE -> {
                helpB.setText("ヘルプ");
                greet.setText("いらっしゃいませ！");
                convert.setText("変換");
            }
            case PORTUGUESE -> {
                helpB.setText("Ajuda");
                greet.setText("Bem-vindo!");
                convert.setText("Converter");
            }
            case RUSSIAN -> {
                helpB.setText("Помощь");
                greet.setText("Добро пожаловать!");
                convert.setText("Конвертировать");
            }
            case SPANISH -> {
                helpB.setText("Ayuda");
                greet.setText("¡Bienvenidos!");
                convert.setText("Convertir");
            }
        }
        JPanel converter = new JPanel();
        converter.add(convert);
        converter.add(helpB);
        JFrame convWindow = new JFrame();
        convWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
        greet.setSize(50, 50);
        convWindow.add(converter, BorderLayout.SOUTH);
        convWindow.add(label, BorderLayout.CENTER);
        convWindow.setVisible(true);

        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openReceiptWindow(language);
            }
        });
        helpB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openHelpWindow(language);
            }
        });
    }

    public static void openHelpWindow(Translator language) {
        JFrame helpWindow = new JFrame();
        JLabel help = new JLabel();
        JPanel helpLabel = new JPanel();
        helpLabel.add(help);
        help.setSize(50, 50);
        switch (language) {
            case ENGLISH ->
                    help.setText("This is used to convert currencies. Select which currencies you would like to convert from and then input the amount you would like to convert.");
            case CHINESE -> help.setText("这用于转换货币。 选择您要转换的货币，然后输入您要转换的金额。");
            case FRENCH ->
                    help.setText("Ceci est utilisé pour convertir les devises. Sélectionnez les devises à partir desquelles vous souhaitez convertir, puis saisissez le montant que vous souhaitez convertir.");
            case GERMAN ->
                    help.setText("Dies wird verwendet, um Währungen umzurechnen. Wählen Sie die Währungen aus, die Sie umrechnen möchten, und geben Sie dann den Betrag ein, den Sie umrechnen möchten.");
            case JAPANESE -> help.setText("これは、通貨を変換するために使用されます。 変換元の通貨を選択し、変換したい金額を入力します。");
            case PORTUGUESE ->
                    help.setText("Isso é usado para converter moedas. Selecione de quais moedas você gostaria de converter e insira o valor que gostaria de converter.");
            case RUSSIAN ->
                    help.setText("Это используется для конвертации валют. Выберите, из какой валюты вы хотите конвертировать, а затем введите сумму, которую хотите конвертировать.");
            case SPANISH ->
                    help.setText("Esto se utiliza para convertir monedas. Seleccione de qué monedas le gustaría convertir y luego ingrese la cantidad que le gustaría convertir.");
        }
        helpWindow.add(helpLabel, BorderLayout.CENTER);
        helpWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
        helpWindow.setVisible(true);
    }

    public static void openReceiptWindow(Translator language) {
        JFrame receipt = new JFrame();
        receipt.setSize(500, 500);
        receipt.setVisible(true);
    }
}
