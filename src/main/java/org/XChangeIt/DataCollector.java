package org.XChangeIt;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.Scanner;                   //Imports the Scanner class to read files
import java.io.File;                        //Imports class to handle the new file
import java.io.FileNotFoundException;       //Imports class to handle the case where the file does not exist
import static java.lang.System.exit;

//Class to bring the data in from another file
public class DataCollector
{
    //Default constructor for the DataCollector Class
    public void DataCollector()
    {

    }
    //Function to read the data from the file
    public void getData(ArrayList<DataStorage> data) throws FileNotFoundException
    {
        try
        {
            Scanner collector = new Scanner(new File("ExchangeRate.xml"));
        }
        catch (FileNotFoundException JSON_Error)
        {
            System.out.println("The JSON datafile was not located. Trying XML datafile.");
            try
            {
                Scanner collector = new Scanner(new File("ExchangeRate.xml"));
            }
            catch (FileNotFoundException XML_Error)
            {
                System.out.println("The XML datafile was not located. Aborting the program.");
                exit(-1);       //Quits the Java program because the file is not located.
            }
        }
    }
}
