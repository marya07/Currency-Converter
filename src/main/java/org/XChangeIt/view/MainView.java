package org.XChangeIt.view;
import org.XChangeIt.model.Translator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static java.awt.Component.CENTER_ALIGNMENT;
public class MainView {

    public MainView (){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon flagIcon = new ImageIcon("/Users/megharya/Desktop/Fall 2022/CS 321/XChangeIt/src/main/resources/Icons/1x1/us.svg");

        final JButton[] languageButtons = new JButton[languageSupport.length];

        for (int i = 0; i < languageButtons.length; i++) {
            languageButtons[i] = new JButton(languageSupport[i]);
            languageButtons[i].setAlignmentX(CENTER_ALIGNMENT);
            languageButtons[i].addActionListener(new languageButtonActionListener(languageSupport[i]));
        }

        JPanel buttonsPanel = new JPanel(); //creates a panel to put buttons onto the frame
        buttonsPanel.setLayout(new GridLayout(8, 1));

        for (JButton languageButton : languageButtons) {
            buttonsPanel.add(Box.createVerticalStrut(10));
            buttonsPanel.add(languageButton);
        }
        frame.add(buttonsPanel);

        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); //the window is visible
    }

    static class languageButtonActionListener implements ActionListener {
        public languageButtonActionListener(String language) {
            this.language = language;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Translator translator = Translator.getTranslatorByValue(language);
            if (translator != null) {
                ConverterView converterView = new ConverterView(translator);
            }
            frame.setVisible(false);
        }
        private final String language;
    }
    private final String[] languageSupport = {"ENGLISH", "中国人", "FRANÇAIS", "DEUTSCH", "日本", "PORTUGUÊS", "РУССКИЙ", "ESPAÑOL"};
    private static JFrame frame;
}