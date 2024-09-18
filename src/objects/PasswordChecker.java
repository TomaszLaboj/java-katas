//package objects;
//
//import java.util.Scanner;
//
//public class PasswordChecker {
//    String username = "johndoe";
//    String password = "ABC_1234";
//    static Scanner scanner = new Scanner(System.in);
//    static String newPassword;
//    public static void main(String[] args) {
//        System.out.println("Please enter new password:");
//        newPassword = scanner.nextLine();
//    }
//    public boolean isPasswordValid(String password) {
//        boolean isEightCharLong  = false;
//        boolean isUpperCasePresent = false;
//
//        if(password.length() >= 8) {
//            isEightCharLong = true;
//        }
//
//        for (int i = 0; i <= password.length(); i++) {
//            char ch = password.charAt(i);
//            if(Character.isUpperCase(ch)) {
//                isUpperCasePresent = true;
//            }
//        }
//
//    }
//}
