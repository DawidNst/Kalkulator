package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        System.out.print("SimpleUser testing: ");

        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("TEST OK");
        } else {
            System.out.println("ERROR!");
        }

        System.out.print("Calculator \"add\" testing: ");
        int addResult = Calculator.add(5, 3);

        if (addResult == 8) {
            System.out.println("TEST OK");
        } else {
            System.out.println("ERROR!");
        }

        System.out.print("Calculator \"subtract\" testing: ");
        int subtractResult = Calculator.subtract(5, 3);

        if (subtractResult == 2) {
            System.out.println("TEST OK");
        } else {
            System.out.println("ERROR!");
        }

    }
}