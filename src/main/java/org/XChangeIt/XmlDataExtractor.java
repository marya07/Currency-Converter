package org.XChangeIt;

import java.util.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.*;

/**
 * Class to extract data from the given XML file
 */
public class XmlDataExtractor {

    /**
     * Construct XmlDataExtractor with the passed in string
     * @param curr currency code for currency to convert to
     */
    public XmlDataExtractor(String curr) {
        toCurrency = curr;                  // Set toCurrency to passed in currency code curr.
    }

    /**
     * Method to
     * @param document
     * @param xpathExpression
     * @return
     * @throws Exception
     */
    private static List<String> evaluateXPath(Document document, String xpathExpression) throws Exception {
        // Create XPathFactory object
        XPathFactory xpathFactory = XPathFactory.newInstance();

        // Create XPath object
        XPath xpath = xpathFactory.newXPath();

        List<String> values = new ArrayList<>();
            // Create XPathExpression object
            XPathExpression expr = xpath.compile(xpathExpression);

            // Evaluate expression result on XML document
            NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);

            for (int i = 0; i < nodes.getLength(); i++) {
                values.add(nodes.item(i).getNodeValue());
            }
        return values;
    }

    /**
     *
     * @param fileName
     * @return
     * @throws Exception
     */
    private static Document getDocument(String fileName) throws Exception
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(fileName);
        return doc;
    }

    /**
     *
     * @return
     */
    public double extractExchangeRate() {
        double excRate;
        String xPathArg = ("/channel/item[targetCurrency='" + this.toCurrency + "']/exchangeRate/text()");

        //Get DOM Node for XML
        String fileName = "src/main/resources/ExchangeRates.xml";
        Document document = null;
        try {
            document = getDocument(fileName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String xpathExpression = "";

        xpathExpression = xPathArg;
        List<String> rateList = null;
        try {
            rateList = evaluateXPath(document, xpathExpression);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        excRate = Double.parseDouble(rateList.get(0));

        return excRate;
    }

    private final String toCurrency;                    // Object to store currency code for currency to convert to
}