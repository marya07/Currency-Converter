import org.XChangeIt.XmlDataExtractor;

public class TestXmlDataExtractor {
    // Private variable to store exchange rate for given currency.
    private static double exchangeRate;

    /**
     * Main method for testing the functionality of XmlDataExtractor
     * @param args
     */
    public static void main(String[] args){

        // Initialize new XmlDataExtractor object with currency code.
        XmlDataExtractor rateData = new XmlDataExtractor("EUR");
        try {
            exchangeRate = rateData.extractExchangeRate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Print extracted exchange rate
        System.out.println(exchangeRate);
    }
}
