package org.XChangeIt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel greet = new JLabel();
        JPanel label = new JPanel();
        label.add(greet);
        JLabel help = new JLabel();
        JPanel helpLabel = new JPanel();
        helpLabel.add(help);
        JTextArea currencyamt = new JTextArea(); //creates the text box for user to enter amount they wish to convert


        /** When the english button is pressed then it pops up the greeting in english */
        JButton englishB = new JButton("ENGLISH"); //creates the english button
        englishB.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JTextField engGreet = new JTextField();
                greet.setText("Welcome!");
                frame.add(label, BorderLayout.CENTER);
                frame.setVisible(true);
            }

        });

        /** When the spanish button is pressed then it pops up the greeting in spanish */
        JButton spanishB = new JButton("ESPAÑOL"); //creates the spanish button
        spanishB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JTextField spanGreet = new JTextField();
                greet.setText("¡Bienvenidos!");
                frame.add(label, BorderLayout.CENTER);
                frame.setVisible(true);
            }
        });

        /** When the japanese button is pressed then it pops up the greeting in japanese */
        JButton japaneseB = new JButton("日本"); //creates the japanese button
        japaneseB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JTextField japGreet = new JTextField();
                greet.setText("いらっしゃいませ!");
                frame.add(label, BorderLayout.CENTER);
                frame.setVisible(true);
            }
        });

        /** When the chinese button is pressed then it pops up the greeting in chinese */
        JButton chineseB = new JButton("中国人");  //creates the chinese button
        chineseB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JTextField chinGreet = new JTextField();
                greet.setText("欢迎!");
                frame.add(label, BorderLayout.CENTER);
                frame.setVisible(true);
            }
        });

        /** When the help button is pressed then it pops up another window that instructs the user
         *  how to work the program. It also has some frequently asked questions in hopes of helping
         *  the user with any problems that may have occurred for them.
         * */
        JButton helpB = new JButton("Help/FAQs");
        helpB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame helpWindow = new JFrame();
                help.setSize(50, 50);
                help.setText("This is used to convert currencies. Select which currencies you would like to convert from and then input the amount you would like to convert.");
                helpWindow.add(helpLabel, BorderLayout.CENTER);
                helpWindow.setSize(500, 500);
                helpWindow.setVisible(true);
            }
        });

        JPanel buttons = new JPanel(); //creates a panel to put buttons onto the frame
        buttons.add(englishB);
        buttons.add(spanishB);
        buttons.add(japaneseB);
        buttons.add(chineseB);

        JPanel helpButton = new JPanel();
        helpButton.add(helpB);

        JPanel input = new JPanel();
        input.add(currencyamt);

        //frame.add(input, BorderLayout.);
        frame.add(helpButton, BorderLayout.SOUTH);
        frame.add(buttons, BorderLayout.NORTH);
        frame.setSize(1000, 750); //creates the main window for the program
        frame.setVisible(true); //the window is visible
    }
}