import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();

        int result1 = multiplier.multiply(5, 3);
        System.out.println("Wynik mnożenia 5 i 3: " + result1);

        int result2 = multiplier.multiply(2, 3, 4, 5);
        System.out.println("Wynik mnożenia 2, 3, 4 i 5: " + result2);

        double result3 = multiplier.multiply(2.5, 1.5);
        System.out.println("Wynik mnożenia 2.5 i 1.5: " + result3);

        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("3.2");
        BigDecimal result4 = multiplier.multiply(num1, num2);
        System.out.println("Wynik mnożenia " + num1 + " i " + num2 + ": " + result4);

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
        int result5 = multiplier.multiply(numbers);
        System.out.println("Wynik mnożenia liczb: " + numbers + ": " + result5);
    }
}
