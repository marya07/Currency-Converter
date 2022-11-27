package org.XChangeIt.controller;

import org.XChangeIt.model.DataStorage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Objects;

public class DataExtractor {
    /**
     * Creates a new DataExtractor object for extracting data from the given XML file conating rate data.
     * @param file File variable initialized using XML file location to extract data from.
     * @param fromCurrency currency for which data needs to extracted for conversion.
     */
    public DataExtractor(File file, String fromCurrency){
        f = file;                       //Gets the file to input from
        baseCurrency = fromCurrency;    //Gets the base currency
    }

    /**
     * Extraction method to get data for the given currency from the data file.
     * @return DataStorage object with data for the given currency.
     */
    public DataStorage extraction(){
        DataStorage d = null;
        try {
            //Creates .xml data extractor and parses for the data, which is delineated by "item"
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(f);
            NodeList list = doc.getElementsByTagName("item");

            //Loops through the source .xml file to get the description, date, base currency, target currency, exchange rate, and inverse exchange rate
            for (int i = 0; list.getLength() > i; i++) {
                Node n = list.item(i);
                Element e = (Element) n;
                if (Objects.equals(e.getElementsByTagName("targetCurrency").item(0).getTextContent(),
                        baseCurrency)) {
                    String description = e.getElementsByTagName("description").item(0).getTextContent();
                    String date = e.getElementsByTagName("pubDate").item(0).getTextContent();
                    String bCurr = e.getElementsByTagName("baseCurrency").item(0).getTextContent();
                    String tCurr = e.getElementsByTagName("targetCurrency").item(0).getTextContent();
                    double eRate = Double.parseDouble(e.getElementsByTagName("exchangeRate").item(0).getTextContent());
                    double iRate = Double.parseDouble(e.getElementsByTagName("inverseRate").item(0).getTextContent());
                    //Creates a new DataStorage object with the collected data
                    d = new DataStorage(description, date, bCurr, tCurr, eRate, iRate);
                }
            }
        }
        //Catches any problem and outputs the cause and the stack trace
        catch (Exception e) {
            e.getCause();
            e.printStackTrace(System.out);
        }
        return d;       //Returns the DataStorage Object
    }

    private final File f;       //File object
    private final String baseCurrency;  //String to hold the base currency
}