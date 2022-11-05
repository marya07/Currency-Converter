import org.XChangeIt.Converter;

import java.util.Scanner;

public class TestConversion {
    public static void main(String[] args) {
        String fromCurrency;
        int amount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Currency Type: ");
        fromCurrency = scanner.nextLine();
        System.out.println("Enter Currency Amount: ");
        amount = scanner.nextInt();

        Converter c = new Converter(fromCurrency, amount);
        System.out.println("Your Amount: " + c.doConvert());
    }
}
