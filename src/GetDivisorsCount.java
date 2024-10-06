public class GetDivisorsCount {
    public static void main (String[] args) {
        System.out.println(getDivisorsCount(1));
    }

    public static int getDivisorsCount (int number) {
        int count = 0;
        int divisor = 1;
        while (divisor <= Math.sqrt(number)) {
            if (number % divisor == 0) {
                if (number / divisor == divisor) {
                    count++;
                } else {
                    count += 2;
                }
            }
            divisor++;
        }
        return count;
    }
}
