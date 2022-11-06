package org.XChangeIt;

//Imports file access
import java.io.File;
import java.io.FileNotFoundException;

//Imports classes to load data
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//Import classes to write to xml files
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Profits {
    double ProfitsCollected;        //Private variable to contain the profit from this project.

    /**
     * Retrieval method to get the current profit total from this project
     * If -1 is returned then profits needs to be set to 0.0 of type double
     * @return double variable with exact value of money made.
     */
    public double loadProfit()
    {
        double ProfitsCollected = -1.0;    //Variable to hold the profits collected. -1 to show not set. If it remains -1, there is a problem
        //Creates a new File variable to hold the Profits.xml file
        File info = new File("src/main/resources/Profits.xml");    //Opens the file
        try
        {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(info);
            //Gets the project profits
            NodeList list = doc.getElementsByTagName("ProjectProfits");
            //Gets the first item in the data file
            Node n = list.item(0);
            Element e = (Element) n;
            //Get the actual double for the profits
            ProfitsCollected = Double.parseDouble(e.getElementsByTagName("ProfitSoFar").item(0).getTextContent());
        }
        // Catches exception where the input file is not found.
        catch (FileNotFoundException fnfe)
        {
            //Sets the total profits to 0.0, so an error does not disrupt the program
            ProfitsCollected = 0.0;
        }
        //Catch any other exception
        catch (Exception e)
        {
            e.getCause();
            e.printStackTrace(System.out);
        }
        //Returns the collected profits
        return ProfitsCollected;
    }

    /**
     * Function to save the Profits into the file "Profits.xml", which
     * is located in the resources folder.
     * @throws FileNotFoundException
     */
    public void saveProfits()
    {
        //Tries to write to the XML file from the profits collected
        try
        {
            //Creates a new instance to write to the XML file
            DocumentBuilderFactory XMLMaker = DocumentBuilderFactory.newInstance();
            DocumentBuilder XMLWriter = XMLMaker.newDocumentBuilder();
            //Prepares a new document of variable name xmlFile
            Document xmlFile = XMLWriter.newDocument();
            //Creates the root element in the profits.
            Element root = xmlFile.createElement("ProjectProfits");
            xmlFile.appendChild(root);      //Adds the root to the xml file
            //Creates an element that holds the current profit
            Element ProfitSoFar = xmlFile.createElement("ProfitSoFar");
            //Adds the profits collected into the file
            ProfitSoFar.appendChild(xmlFile.createTextNode(String.valueOf(ProfitsCollected)));
            //Adds the profit to the xml object
            root.appendChild(ProfitSoFar);
            //Creates the xml file from the data, i.e. the profit, provided.
            //Transforms the DOM Object variable into an XML file
            TransformerFactory newXMLFile = TransformerFactory.newInstance();
            Transformer converter = newXMLFile.newTransformer();
            //Sets Output parameters so that lines are indented
            converter.setOutputProperty(OutputKeys.INDENT, "yes");
            converter.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            //Links the xml object to the DOMSource
            DOMSource domSource = new DOMSource(xmlFile);
            //Links the destination file to the stream
            StreamResult outputFile = new StreamResult(new File("src/main/resources/Profits.xml"));

            //Converts/transforms the xml object into a .xml file.
            converter.transform(domSource, outputFile);
        }
        //Catches an error with the xml parser
        catch (ParserConfigurationException ErrorParserConfig)
        {
            ErrorParserConfig.printStackTrace();
        }
        //Catches an error with the transformer
        catch (TransformerException ErrorTransformer)
        {
            ErrorTransformer.printStackTrace();
        }
    }

    /**
     * Returns a double which is the money made from exchange charges
     * @return ProfitsCollected a double that contains the profits from this project
     */
    public double getProfit()
    {
        return ProfitsCollected;
    }

    /**
     * Adds the parameter profit to the current profit to update the profit amount
     * @param MoreProfit new profit double to be added to the current profit number
     */
    public void addProfit(double MoreProfit)
    {
        //Adds the new profit to the previous total of profits collected
        ProfitsCollected =  ProfitsCollected + MoreProfit;
    }

}
