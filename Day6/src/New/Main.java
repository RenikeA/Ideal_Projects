package New;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.print("enter a number ");
//        int number1 = number.nextInt();
//
//        System.out.print("enter an operator ");
//        String operator = number.next();
//
//        System.out.print("enter a number ");
//        int number2 = number.nextInt();
//
//        if (operator.equals("+")) {
//            System.out.print(number1 + number2);
//
//        } else if (operator.equals("-")) {
//            System.out.print(number1 - number2);
//
//        } else if (operator.equals("*")) {
//            System.out.print(number1 * number2);
//
//        } else if (operator.equals("/")) {
//            System.out.print((double)number1 / number2);
//        } else {
//            System.out.println("invalid input!!");
//        }
//    }
//
        //    SWITCH PRACTICE
//    public static String getMonthName(int monthNum) {
//        String monthName = "";
//
//
//        switch (monthNum) {
//            case 0:
//                monthName = "January";
//                break;
//
//            case 1:
//                monthName = "February";
//                break;
//
//            case 2:
//                monthName = "March";
//                break;
//
//            case 3:
//                monthName = "April";
//                break;
//
//            case 4:
//                monthName = "May";
//                break;
//
//            case 5:
//                monthName = "June";
//                break;
//
//            case 6:
//                monthName = "July";
//                break;
//
//            case 7:
//                monthName = "August";
//                break;
//
//            case 8:
//                monthName = "September";
//                break;
//
//            case 9:
//                monthName = "October";
//                break;
//
//            case 10:
//                monthName = "November";
//                break;
//
//            case 11:
//                monthName = "December";
//                break;
//
//            default:
//                monthName = "Invalid input";
//        }
//        return monthName;

        printprimeBetween(1, 50);

        String reverse = "some text"; // show mr daro
        //  String reverse = "abcd";
        // for (int i = 0; i <= str.length()-1; i++ )
        // System.out.print(str.charAt(i) + " ");

        for (int i = reverse.length() - 1; i >= 0; i--)
            System.out.println(reverse.charAt(i));

        // for (int i = reverse.length()-1; i>=0; i--)
        //    System.out.println(reverse.charAt(i));


        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;
        System.out.println("x=" + p1.x + ",y=" + p1.y);
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    public static void printprimeBetween(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}





