package chineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;

        System.out.print("Enter your year of birth: ");
        year = scanner.nextInt();

        if (year % 12 == 0) {
            System.out.println("Monkey");
        } else if (year % 12 == 1) {
            System.out.println("Rooster");
        } else if (year % 12 == 2) {
            System.out.println("Dog");
        } else if (year % 12 == 3) {
            System.out.println("Pig");
        } else if (year % 12 == 4) {
            System.out.println("Rat");
        } else if (year % 12 == 5) {
            System.out.println("Ox");
        } else if (year % 12 == 6) {
            System.out.println("Tiger");
        } else if (year % 12 == 7) {
            System.out.println("Rabit");
        } else if (year % 12 == 8) {
            System.out.println("Dragon");
        } else if (year % 12 == 9) {
            System.out.println("Snake");
        } else if (year % 12 == 10) {
            System.out.println("Horse");
        } else {
            System.out.println("Goat");
        }
        scanner.close();

    }
}
