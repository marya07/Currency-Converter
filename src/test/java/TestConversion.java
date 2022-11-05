import org.XChangeIt.Convert;

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

        Convert c = new Convert(fromCurrency, amount);
        System.out.println("Your Amount: " + c.doConvert());
    }
}
