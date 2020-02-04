package org.example;

public class ArmstrongChecker {
    public static boolean armstrongChecker(int number) {
        int result = 0;
        int remainder;
        int originalNumber = number;


        while (number != 0) {
            remainder = number % 10;
            result = result + (remainder * remainder * remainder);
            number = number / 10;
        }
        if (result == originalNumber) {
            System.out.println(number + " is an Armstrong number.");
            return true;
        } else {
            System.out.println(number + " is not an Armstrong number.");
            return false;
        }
    }
}
