package org.XChangeIt;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.Arrays;

public class Main
{
    //Private variable for the class
    private DataCollector fetcher;
    private DataStorage data;
    private PreviousTransactions history;
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //final SceneComponent scene = new SceneComponent();
        JButton englishB = new JButton("ENGLISH");
        JButton spanishB = new JButton("ESPAÑOL");
        JButton japaneseB = new JButton("日本");
        JButton chineseB = new JButton("中国人");

        JPanel buttons = new JPanel();
        buttons.add(englishB);
        buttons.add(spanishB);
        buttons.add(japaneseB);
        buttons.add(chineseB);
        frame.add(buttons, BorderLayout.NORTH);
        frame.setSize(500,500);
        frame.setVisible(true);
        //JOptionPane.showMessageDialog(null, "Hello, World!");



        //Sets up the private variables
        DataCollector fetcher = new DataCollector();      //Creates the object to collect the data
        ArrayList<DataStorage> data = new ArrayList<DataStorage>();     //Creates an arraylist to hold the currency conversion data
        ArrayList<PreviousTransactions> history = new ArrayList<PreviousTransactions>();    //Creates an arraylist to hold a record of previous transactions

        //Gets the data from the input files
        try
        {
            fetcher.getData(data);
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //Parts of the program:
        //Load data
        //store data
        //process data
        //conclude data
        //repeat
    }
}