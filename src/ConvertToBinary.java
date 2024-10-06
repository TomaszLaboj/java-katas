import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertToBinary {
    public static void main (String[] args) {
        System.out.println(Arrays.toString(convertToBinary(42)));
        System.out.println(convertToBinarySimpler(42));
    }

    public static int[] convertToBinary (int number) {
        List<Integer> digits = new ArrayList<>();

        int quotient = number;
        while (quotient >= 1)
        {
            quotient = quotient / 2;
            digits.add(quotient % 2);
        }
        return digits.stream().mapToInt(Integer::intValue).toArray();
    }

    public static String convertToBinarySimpler (int number) {
        return Integer.toBinaryString(number);
    }
}
