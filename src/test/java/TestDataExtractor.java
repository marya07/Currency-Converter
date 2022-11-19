import org.XChangeIt.DataExtractor;
import org.XChangeIt.models.DataStorage;

import java.io.File;

public class TestDataExtractor {
    public static void main(String[] args) {
        File file = new File("src/main/resources/ExchangeRates.xml");
        DataExtractor extractor = new DataExtractor(file, "EUR");
        DataStorage foo = extractor.();
        System.out.println(foo.getRateDescription());
    }
}
