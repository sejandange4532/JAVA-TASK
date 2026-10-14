public class Assignment4 {
    public static void main(String[] args) {

        System.out.println("-- Multiplication Table of 5 --");

        for (int i = 1; i <= 5; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        System.out.println("\n-- First number > 10 divisible by 6 --");

        int num = 11;

        while (true) {
            if (num > 10 && num % 6 == 0) {
                System.out.println("Found: " + num);
                break;
            }
            num++;
        }

        System.out.println("\n-- Do While with Continue --");

        int i = 0;

        do {
            i++;

            if (i == 3) {
                continue;
            }

            System.out.println(i);

        } while (i < 5);
    }
}