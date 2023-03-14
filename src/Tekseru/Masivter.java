package Tekseru;

import java.util.Scanner;

public class Masivter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.println("Enter the currency to convert from (USD, EUR, GBP, JPY): ");
        String from = scanner.next();

        System.out.println("Enter the currency to convert to (USD, EUR, GBP, JPY): ");
        String to = scanner.next();

        double rate = getExchangeRate(from, to);

        if (rate == -1) {
            System.out.println("Invalid input.");
        } else {
            double result = amount * rate;
            System.out.printf("%.2f %s = %.2f %s", amount, from, result, to);
        }
        scanner.close();
    }

    private static double getExchangeRate(String from, String to) {
        double rate = -1;
        if ( from.equals("USD") && to.equals("EUR")) {
            rate = 0.83;
        } else if (from.equals("USD") && to.equals("GBP")) {
            rate = 0.72;
        } else if (from.equals("USD") && to.equals("JPY")) {
            rate = 105.66;
        } else if (from.equals("EUR") && to.equals("USD")) {
            rate = 1.21;
        } else if (from.equals("EUR") && to.equals("JPY")) {
            rate =  0.87;
        } else if (from.equals("EUR") && to.equals("GBP")) {
            rate = 129.27;
        } else if (from.equals("GBP") && to.equals("USD")) {
            rate = 1.39;
        } else if (from.equals("GBP") && to.equals("EUR")) {
            rate = 1.15;
        } else if (from.equals("GBP") && to.equals("JPY")) {
            rate =  148.09;
        } else if (from.equals("JPY") && to.equals("USD")) {
            rate = 0.0095;
        } else if (from.equals("JPY") && to.equals("EUR")) {
            rate = 0.0077;
        } else if (from.equals("JPY") && to.equals("GBP")) {
            rate = 0.0068;
        }
        return rate;
    }
}
