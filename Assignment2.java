import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double subtotal = sc.nextDouble();

        System.out.print("Enter tip percentage: ");
        double tipPercentage = sc.nextDouble();

        double tip = subtotal * tipPercentage / 100;
        double total = subtotal;
        total += tip;

        System.out.printf("Subtotal: $%.0f%n", subtotal);
        System.out.printf("Tip Percentage: %.0f%%%n", tipPercentage);
        System.out.printf("Calculated Tip: $%.0f%n", tip);
        System.out.printf("Total Amount to Pay: $%.0f%n", total);

        sc.close();
    }
}