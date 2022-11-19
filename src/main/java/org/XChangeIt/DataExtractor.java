package org.XChangeIt;
import org.XChangeIt.models.DataStorage;

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
        f = file;
        baseCurrency = fromCurrency;
    }

    /**
     * Extraction method to get data for the given currency from the data file.
     * @return DataStorage object with data for the given currency.
     */
    public DataStorage extraction(){
        DataStorage d = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(f);
            NodeList list = doc.getElementsByTagName("item");

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
                    d = new DataStorage(description, date, bCurr, tCurr, eRate, iRate);
                }
            }
        } catch (Exception e) {
            e.getCause();
            e.printStackTrace(System.out);
        }
        return d;
    }

    private final File f;
    private final String baseCurrency;
}