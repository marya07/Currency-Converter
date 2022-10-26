import org.XChangeIt.Money;

public class TestConversion {
    public static void main(String[] args) throws Exception {
        Money m = new Money("AED", 3800);
        String converted = m.doConvert();
        System.out.println("Your Amount: " + converted);
    }
}
