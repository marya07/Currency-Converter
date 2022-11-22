import org.XChangeIt.controller.DataExtractor;
import org.XChangeIt.model.DataStorage;

import java.io.File;

public class TestDataExtractor {
    public static void main(String[] args) {
        File file = new File("src/main/resources/ExchangeRates.xml");
        DataExtractor extractor = new DataExtractor(file, "EUR");
        DataStorage foo = extractor.extraction();
        System.out.println(foo.getRateDescription());
    }
}
