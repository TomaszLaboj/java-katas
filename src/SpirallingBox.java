import java.util.ArrayList;
import java.util.List;

public class SpirallingBox {
    public static void main (String [] args) {
        System.out.println(spirallingBox(3,3));
    };

    public static int[][] spirallingBox (int m, int n) {
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = Math.min(Math.min(j + 1, i + 1),Math.min(m - j, n - i));
            }
        }
        return array;
    }
}
