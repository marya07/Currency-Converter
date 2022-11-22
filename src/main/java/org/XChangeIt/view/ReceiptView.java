package org.XChangeIt.view;
import org.XChangeIt.model.Receipt;
import org.XChangeIt.model.Translator;
import javax.swing.*;
import java.awt.*;

public class ReceiptView {
    public ReceiptView(Translator translator){
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel receiptText = new JLabel();

        frame.add(receiptText, BorderLayout.CENTER);
        frame.setSize(300, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); //the window is visible
    }
    private static JFrame frame;
}
