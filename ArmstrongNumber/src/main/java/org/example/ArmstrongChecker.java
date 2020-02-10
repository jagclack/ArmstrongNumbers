package org.example;

public class ArmstrongChecker {
    public static boolean armstrongChecker(int number) {
        int result = 0;
        int remainder;
        int originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result = result + (remainder * remainder * remainder);
            originalNumber = originalNumber / 10;
        }
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
            return true;
        } else {
            System.out.println(number + " is not an Armstrong number.");
            return false;
        }
    }
}
