public class FormattingDecimalPlaces {
    public static void main (String[] args) {
        System.out.println(formatDecimalPlaces(5.5589));
        System.out.println(formatDecimalPlaces2(5.5589));
    }

    public static double formatDecimalPlaces (double number) {
        return Double.parseDouble(String.format("%.2f", number));
    }

    public static double formatDecimalPlaces2 (double number) {
        return Math.round(number * 100) / 100;
    }
}
