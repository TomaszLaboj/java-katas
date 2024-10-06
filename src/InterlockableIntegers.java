import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterlockableIntegers {

    public static void main (String[] args) {

    }

    public static int[] convertToBinary (int number) {
        List<Integer> digits = new ArrayList<>();

        int quotient = number;
        while (quotient > 1)
        {
            quotient = quotient / 2;
            digits.add(quotient % 2);
        }
        return digits.stream().mapToInt(Integer::intValue).toArray();
    }

    public static String[] stringToArray (String text) {
        return text.split("");
    }

    public static boolean compareArrays (int[] arr1, int[] arr2) {
        for (int i = 0; i <= arr1.length; i++) {
            if(arr1[i] == arr2[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean IsIntegerInterlocking (int number1, int number2) {
        int[] number1Binary = convertToBinary(number1);
        int[] number2Binary = convertToBinary(number2);
        if(number1Binary.length == number2Binary.length) {
            return compareArrays(number1Binary, number2Binary);
        }
        int[] longerArray = number1Binary.length > number2Binary.length ? number1Binary : number2Binary;
        int[] shorterArray = number1Binary.length < number2Binary.length ? number1Binary : number2Binary;
        int difference = longerArray.length - shorterArray.length;
        int[] newArray = new int[longerArray.length];
        System.out.println(shorterArray.length);

        for(int i = 0; i < newArray.length - difference; i++) {
            newArray[i + difference] = shorterArray[i];
            System.out.println("new array" + newArray[i + difference]);
            System.out.println("shorter array" + shorterArray[i]);
        }
        if(!compareArrays(longerArray, newArray)) {
            return false;
        }

        return true;
    }
}
