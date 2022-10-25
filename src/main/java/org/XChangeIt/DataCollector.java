package org.XChangeIt;
import javax.swing.*;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.Scanner;                   //Imports the Scanner class to read files
import java.io.File;                        //Imports class to handle the new file
import java.io.FileNotFoundException;       //Imports class to handle the case where the file does not exist
import java.io.IOException;                 //Imports class to deal with

import static java.lang.System.exit;

//Class to bring the data in from another file
public class DataCollector
{
    //Default constructor for the DataCollector Class
    public void DataCollector(){};

    //Function to read the data from the file
    public void getData(ArrayList<DataStorage> data) throws FileNotFoundException
    {
        //Variables to hold the retreived data.
        //nextNum for the doubles, name for the name of the file and
        int firstIndex;
        int secondIndex;
        double nextNum;
        String name;
        String ReadData;
        String potentialName;   //Variable to hold the data from the scanner to process
        String tempString;      //Variable to hold data for finding the name of the string
        DataStorage item = new DataStorage();
        //Tries to get the data. If the file does not exist, catch the error
        try
        {
            //Gets data from the file and separates it into strings based on the : character
            Scanner collector = new Scanner(new File("src/main/resources/ExchnageRates.json")).useDelimiter(":");


            //Get data while there is data  left in fhe file
            while (collector.hasNext() == true)     //While data left in file
            {
                //Reads data to find "name". The currency name is in the data after that.
                //This same method will be used to find the exchange and inverse rates
                potentialName = collector.next();        //Gets the next string of data
                firstIndex = potentialName.indexOf("name");     //Finds the first position of the string
                while (firstIndex != -1)//Loop until name found
                {
                    potentialName = collector.next();        //Gets the next string of data
                    firstIndex = potentialName.indexOf("name");     //Finds the first position of the string
                }
                potentialName = collector.next();        //Gets the next string of data which should hold the name of the currency
                //Note, potentialName has the name of the currency
                potentialName.indexOf('"'); //Gets first index of the quotation marks
                //Gets the substring of the data, the currency name, between the question marks
                firstIndex++;       //Increment first index to get the index of the currency name
                tempString = potentialName.substring(firstIndex);       //Gets the substring of the rest of the data, minus the quotation marks
                secondIndex = tempString.indexOf('"');                  //Gets the location of the second quotation mark
                //Finds the name of the currency by using the positions of the two quotation marks
                ReadData = potentialName.substring(firstIndex, secondIndex);
                item.setName(ReadData);     //Stores the name of the currency into memory

                //Loads the exchange rate from the file
                potentialName = collector.next();               //Gets the next string of data
                firstIndex = potentialName.indexOf("rate");     //Finds the first position of the string
                while (firstIndex != -1)//Loop until rate found
                {
                    potentialName = collector.next();               //Gets the next string of data
                    firstIndex = potentialName.indexOf("rate");     //Finds the first position of the string
                }
                nextNum = collector.nextDouble();   //Gets the next string of data which should hold the rate of the currency
                item.setExchangeRate(nextNum);      //Stores the currency rate into memory

                //Gets the inverse exchange rate
                potentialName = collector.next();                       //Gets the next string of data
                firstIndex = potentialName.indexOf("inverseRate");      //Finds the first position of the string
                while (firstIndex != -1)//Loop until rate found
                {
                    potentialName = collector.next();                       //Gets the next string of data
                    firstIndex = potentialName.indexOf("inverseRate");      //Finds the first position of the string
                }
                nextNum = collector.nextDouble();   //Gets the next string of data which should hold the rate of the currency
                item.setInverseRate(nextNum);   //Stores the inverse rate
                data.add(item);     //Adds the item to the ArrayList
            }
            collector.close();      //Closes the scanner
        }
        catch (FileNotFoundException JSON_Error)
        {
            JFrame frame;// = new JFrame();
            System.out.println("The JSON datafile was not located. Trying XML datafile.");
            JOptionPane.showMessageDialog(null, "The JSON datafile was not located. Trying XML datafile.");
            try
            {
                Scanner collector = new Scanner(new File("ExchangeRates.xml"));
                collector.nextLine();
            }
            catch (FileNotFoundException XML_Error)
            {
                JFrame frame2;
                JOptionPane.showMessageDialog(null, "The XML datafile was not located. Aborting the program.");
                System.out.println("The XML datafile was not located. Aborting the program.");
                exit(-1);       //Quits the Java program because the file is not located.
            }
        }
    }
}
