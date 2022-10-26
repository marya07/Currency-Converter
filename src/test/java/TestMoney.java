import org.XChangeIt.Money;

public class TestMoney {
    public static void main(String[] args) {
        Money M = new Money("GBP", 1000);
        System.out.println("Converted Amount: " + M.doConvert());
    }
}
