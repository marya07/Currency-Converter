package org.XChangeIt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiTest {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea currencyamt = new JTextArea(); //creates the text box for user to enter amount they wish to convert

        /** When the english button is pressed then it pops up the greeting in english */
        JButton englishB = new JButton("ENGLISH"); //creates the english button
        englishB.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel greet = new JLabel();
                JPanel label = new JPanel();
                label.add(greet);

                JButton convert = new JButton();
                JPanel converter = new JPanel();
                converter.add(convert);

                JButton helpB = new JButton("Help/FAQs");
                converter.add(helpB);

                JFrame engWindow = new JFrame();
                engWindow.setSize(500, 500);
                engWindow.setLocationRelativeTo(null);
                greet.setSize(50, 50);
                greet.setText("Welcome!");
                convert.setText("Convert");
                engWindow.add(converter, BorderLayout.SOUTH);
                engWindow.add(label, BorderLayout.CENTER);
                engWindow.setVisible(true);
                frame.dispose();

                convert.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame receipt = new JFrame();
                        receipt.setSize(250, 450);
                        receipt.setLocationRelativeTo(null);
                        receipt.setVisible(true);
                        engWindow.dispose();
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
                        helpWindow.setLocationRelativeTo(null);
                        helpWindow.setVisible(true);
                        engWindow.dispose();
                    }
                });
            }
        });

        /** When the spanish button is pressed then it pops up the greeting in spanish */
        JButton spanishB = new JButton("ESPAÑOL"); //creates the spanish button
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

        /** When the japanese button is pressed then it pops up the greeting in japanese */
        JButton japaneseB = new JButton("日本"); //creates the japanese button
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

        /** When the chinese button is pressed then it pops up the greeting in chinese */
        JButton chineseB = new JButton("中国人");  //creates the chinese button
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

        JPanel buttons = new JPanel(); //creates a panel to put buttons onto the frame
        buttons.add(englishB);
        buttons.add(spanishB);
        buttons.add(japaneseB);
        buttons.add(chineseB);

        JPanel helpButton = new JPanel();

        JPanel input = new JPanel();
        input.add(currencyamt);

        frame.add(helpButton, BorderLayout.SOUTH);
        frame.add(input, BorderLayout.CENTER);
        frame.add(buttons, BorderLayout.NORTH);
        frame.setSize(750, 500); //creates the main window for the program
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); //the window is visible
    }
}