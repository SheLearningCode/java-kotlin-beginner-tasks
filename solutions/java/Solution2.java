package solutions.java;

import java.util.Random;
import java.util.Scanner;

class Solution2 {

    public static void main(String[] args) {
        // Task 2.1 a)
        int num1 = 2;
        int num2 = 3;
        if (num1 == num2) {
            System.out.println("The number " + num1 + " was entered twice");
        } else System.out.println("The numbers " + num1 + " and " + num2 + " are not equal");

        // Task 2.1 b)
        num1 = 2;
        num2 = 3;
        if (num1 == num2) {
            System.out.println("The number " + num1 + " was entered 2 times");
        } else System.out.println("The numbers " + num1 + " and " + num2 + " are not equal");
        if (num1 > num2) {
            System.out.println("The number " + num1 + " is greater than the number " + num2);
        } else System.out.println("The number " + num1 + " is less than the number " + num2);
        if (num1 > num2 || num1 == num2) {
            System.out.println("The number " + num1 + " is either greater than or equal to the number " + num2);
        }
        if (num1 < num2 || num1 == num2) {
            System.out.println("The number " + num1 + " is either less than or equal to the number " + num2);
        }

        // Task 2.2
        int age = 18;
        if (age >= 18) {
            System.out.println("You are of legal age");
        } else System.out.println("You are not of legal age");

        // Task 2.3
        age = 17;
        if (age < 15) {
            System.out.println("You are only allowed to ride a bike");
        }
        if (age >= 15) {
            System.out.println("You may ride a moped");
        }
        if (age >= 16) {
            System.out.println("You may ride a scooter");
        }
        if (age >= 18) {
            System.out.println("You may drive a car");
        }

        // Task 2.4
        int month = 4;
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("It's spring");
        }
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("It's summer");
        }
        if (month == 9 || month == 10 || month == 11) {
            System.out.println("It's autumn");
        }
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("It's winter");
        }

        // Task 2.5
        System.out.println("I'm going to think of a number between 1 and 100. \n" +
                "Whichever of you guesses closer wins. \n" +
                "\tPlayer 1, please enter your number now: ");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        System.out.println("Player 2, please enter your number now: ");
        Scanner scanner2 = new Scanner(System.in);
        double number2 = scanner2.nextDouble();
        System.out.println("Thank you very much! I will now compare your numbers with mine.");

        double randomNumber = new Random().nextInt();
        double distance1 = randomNumber - number1;
        double distance2 = randomNumber - number2;
        if (distance1 < 0) {
            distance1 = distance1 * (-1);
        }
        if (distance2 < 0) {
            distance2 = distance2 * (-1);
        }
        if (distance1 < distance2) {
            System.out.println("Since my number is " + randomNumber + " player 1 has won");
        }
        if (distance1 > distance2) {
            System.out.println("Since my number is " + randomNumber + ", player 2 has won");
        }
        if (distance1 == distance2) {
        }

    }
}





