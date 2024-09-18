import java.util.Arrays;

public class Sequence {
    public static void main(String[] args){
    int[] reversed = reverse(5);
    int[] reversed2 = improvedReverse(5);
        System.out.println(Arrays.toString(reversed));
        System.out.println(Arrays.toString(improvedReverse(5)));
    }
    public static int[] reverse(int n) {
        int[] sequence = new int[n];
        for (int i = n, j = 0; i > 0; i--, j++) {
          sequence[j] = i;
        }
        return sequence;
    }

    public static int[] improvedReverse(int n) {
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = n - i;
        }
        return sequence;
    }

}

