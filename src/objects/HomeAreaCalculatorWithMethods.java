package objects;

import java.util.Scanner;

public class HomeAreaCalculatorWithMethods {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        Rectangle kitchen = getRoom("kitchen");
        Rectangle bathroom = getRoom("bathroom");
        double totalArea = calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + totalArea);
    }
    public static double calculateTotalArea(Rectangle room1, Rectangle room2) {
        return room1.calculateArea() + room2.calculateArea();
    }

    public static Rectangle getRoom(String roomName){
        System.out.println("Enter the length of the " + roomName + ":");
        double length = scanner.nextDouble();
        System.out.println("Enter the length of the " + roomName + ":");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }
}
