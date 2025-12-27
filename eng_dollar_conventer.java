import java.util.Scanner;

public class eng_dollar_conventer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount of double: ");
        double amount = input.nextDouble(); 

        int dollars = (int) amount;
        int cents = (int) ((amount - dollars) * 100);

        int hundred = dollars / 100;
        dollars %= 100;

        int fifty = dollars / 50;
        dollars %= 50;

        int twenty = dollars / 20;
        dollars %= 20;

        int ten = dollars / 10;
        dollars %= 10;

        int five = dollars / 5;
        dollars %= 5;

        int one = dollars / 1;

        int half = cents / 50;      // 50 cents
        cents %= 50;

        int quarter = cents / 25;   // 25 cents
        cents %= 25;

        int dime = cents / 10;      // 10 cents
        cents %= 10;

        int nickel = cents / 5;     // 5 cents
        cents %= 5;

        int penny = cents / 1;      // 1 cent

        System.out.println("Your amount consists of:");
        System.out.println(
            hundred + " x $100\n" +
            fifty + " x $50\n" +
            twenty + " x $20\n" +
            ten + " x $10\n" +
            five + " x $5\n" +
            one + " x $1\n" +
            half + " x 50c\n" +
            quarter + " x 25c\n" +
            dime + " x 10c\n" +
            nickel + " x 5c\n" +
            penny + " x 1c"
        );
    }
}
