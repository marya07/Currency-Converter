package org.XChangeIt.models;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.xml.sax.*;
import org.w3c.dom.*;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Objects;




public class Profits {
    double ProfitsCollected;

    /**
     * Extraction method to get the current profit total from this project
     * If -1 is returned then profits needs to be set to 0.0 of type double
     * @return double variable with exact value of money made.
     */
    public double getProfits() throws FileNotFoundException
    {
        double ProfitsCollected = -1;    //Variable to hold the profits collected. -1 to show not set. If it remains -1, there is a problem
        //Creates a new File variable to hold the Profits.xml file
        File info = new File("src/main/resources/Profits.xml");    //Opens the file
        try
        {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(info);
            NodeList list = doc.getElementsByTagName("ProjectProfits");

            Node n = list.item(0);
            Element e = (Element) n;
            ProfitsCollected = Double.parseDouble(e.getElementsByTagName("ProfitSoFar").item(0).getTextContent());
        }
        catch (Exception e)
        {
            e.getCause();
            e.printStackTrace(System.out);
        }
        //Returns the collected profits
        return ProfitsCollected;
    }




/*

    //Function to load the profits from a .txt file
    public void saveProfits() throws FileNotFoundException
    {
        Document dom;
        Element e = null;

        // instance of a DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            // use factory to get an instance of document builder
            DocumentBuilder db = dbf.newDocumentBuilder();
            // create instance of DOM
            dom = db.newDocument();

            // create the root element
            Element rootEle = dom.createElement("ProjectProfits");

            // create data elements and place them under root
            e = dom.createElement("ProfitSoFar");
            //Writes the profits collected to the file
            e.appendChild(dom.createTextNode(String.valueOf(ProfitsCollected)));
            //Adds the data to the file
            rootEle.appendChild(e);

            dom.appendChild(rootEle);

            try
            {
                Transformer output = TransformerFactory.newInstance().newTransformer();
                output.setOutputProperty(OutputKeys.INDENT, "yes");
                output.setOutputProperty(OutputKeys.METHOD, "xml");
                output.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                output.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "Profits.dtd");
                output.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

                // send DOM to file
                output.transform(new DOMSource(dom),
                        new StreamResult(new FileOutputStream("src/main/resources/Profits.xml")));

            }
            catch (TransformerException te)
            {
                System.out.println(te.getMessage());
            }
            catch (IOException ioe)
            {
                System.out.println(ioe.getMessage());
            }
        } catch (ParserConfigurationException pce) {
            System.out.println("UsersXML: Error trying to instantiate DocumentBuilder " + pce);
        }
    }
*/
    //Function to get the profits
    public double getProfit()
    {
        return ProfitsCollected;
    }

    //Function to add to the profits
    public void addProfit(double MoreProfit)
    {
        //Adds the new profit to the previous total of profits collected
        ProfitsCollected =  ProfitsCollected + MoreProfit;
    }

}
