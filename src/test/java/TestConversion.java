import org.XChangeIt.Converter;
import org.XChangeIt.models.Money;

import java.util.Scanner;

public class TestConversion {
    public static void main(String[] args) {
        try {
            String fromCurrency;
            int amount;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Currency Type: ");
            fromCurrency = scanner.nextLine();
            System.out.println("Enter Currency Amount: ");
            amount = scanner.nextInt();

            Converter c = new Converter(fromCurrency, amount);
            Money m = c.doConvert();
            System.out.println("Your Amount: " + m.getCurrencyType() + " " + m.getAmount());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
