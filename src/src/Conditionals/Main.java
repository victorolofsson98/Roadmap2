package Conditionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String name = "Victor";
        String lastName = "Olofsson";
        if (name.equals(lastName)) {
            System.out.println("Name: " + name + " and " + "Lastname: " + lastName + " is the same");
        } else {
            System.out.println("The names are not the same");
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Input your name: ");
        String newName = input.nextLine();

        System.out.println("Your input: " + newName);

        if (name.equals(newName)) {
            System.out.println("Your new name was the same as " + name);
        } else {
            System.out.println("Your new name was actually a new name");
        }

        int a = 5;
        int b = 10;

        float c = 10.5f;
        double d = 5.0123d;
        long e = 1234L;
        int dayCounter = 0;
        for (int i = 1; i < 9; i++) {
            if (dayCounter == 3) {
                break;
            }
            // enhanced switch system
            switch (i) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> {
                    System.out.println("Now one week has passed! Resetting...");
                    i = 0;
                    dayCounter++;
                }
            }

            // Old switch system
            /*
            switch (i) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Now one week has passed! Resetting...");
                    i = 0;
            *
            *
            * */

            Thread.sleep(1000);
        }

    }
}
