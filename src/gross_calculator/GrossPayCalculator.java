package gross_calculator;
import java.util.Scanner;
public class GrossPayCalculator {

    public static void main(String[] args) {
        //1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
        //2. Get the hourly pay rate
        System.out.println("What's the hourly rate?");
        double payRate = 0;
        payRate = scanner.nextDouble();
        //3. Multiply hours an pay rate
        double grossPay = hours * payRate;
        //4. Display the result
        System.out.println("Gross pay: " + grossPay);
    }
}
