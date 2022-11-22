import org.XChangeIt.controller.Converter;
import org.XChangeIt.model.Money;

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

            Money money = new Money("Euro", 5000);

            Converter c = new Converter(money);
            Money m = c.doConvert();
            System.out.println("Your Amount: " + m.getCurrencyType() + " " + m.getAmount());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
