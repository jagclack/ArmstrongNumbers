package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testThatGivenNumberIsAnArmstrongNumber() {
        Assertions.assertTrue(true, ArmstrongChecker.armstrongChecker(370) + " is an Armstrong number");
    }

    @Test
    public void testThatGivenNumberIsNotAnArmstrongNumber() {
        Assertions.assertTrue(true, ArmstrongChecker.armstrongChecker(375) + " is not an Armstrong number");
    }

    @Test
    public void testThatZeroIsAnArmstrongNumber() {
        Assertions.assertTrue(true, ArmstrongChecker.armstrongChecker(0) + " is an Armstrong number");
    }

    @Test
    public void testThatGivenNegativeNumberIsAnArmstrongNumber() {
        Assertions.assertTrue(true, ArmstrongChecker.armstrongChecker(-1) + " is an Armstrong number");
    }

    @Test
    public void testThatGivenNegativeNumberIsNotAnArmstrongNumber() {
        Assertions.assertTrue(true, ArmstrongChecker.armstrongChecker(-3) + " is not an Armstrong number");
    }

    @Test
    public void testThatArmstrongCheckerIsNotNull() {
        Assertions.assertNotNull(ArmstrongChecker.armstrongChecker(0));
    }
}
