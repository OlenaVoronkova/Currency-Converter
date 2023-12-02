import java.util.Scanner;


public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount to convert:");
        double amount = scanner.nextDouble();

        System.out.println("Enter the currency to convert from (USD, EUR, GBP, UAH): ");
        scanner.nextLine();
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Enter the currency to convert to (USD, EUR, GBP, UAH): ");
        String toCurrency = scanner.nextLine().toUpperCase();

        double usdToEur = 0.85;
        double usdToGbp = 0.75;
        double usdToUah = 27.0;

        double eurToUsd = 1.16;
        double eurToGbp = 1.07;
        double eurToUah = 31.53;

        double gbpToUsd = 1.09;
        double gbpToEur = 0.93;
        double gbpToUAH = 29.48;

        double uahToUsd = 0.037;
        double uahToEur = 0.032;
        double uahToGbp = 0.034;

        double convertedAmount = 0;

        if (fromCurrency.equals("USD")) {
            if (toCurrency.equals("EUR")) {
                convertedAmount = amount * usdToEur;

            } else if (toCurrency.equals("GBP")) {
                convertedAmount = amount * usdToGbp;
            } else if (toCurrency.equals("UAH")) {
                convertedAmount = amount * usdToUah;
            } else {
                System.out.println("Invalid currency to convert to.");
                return;

            }
        }
        else if (fromCurrency.equals("EUR")) {

            if (toCurrency.equals("USD")) {
                convertedAmount = amount * eurToUsd;

            } else if (toCurrency.equals("GBP")) {
                convertedAmount = amount * eurToGbp;

            } else if (toCurrency.equals("UAH")) {
                convertedAmount = amount * eurToUah;
            } else {
                System.out.println("Invalid currency to convert to.");
                return;
            }
        }
        else if (fromCurrency.equals("GBP")) {

            if (toCurrency.equals("USD")) {
                convertedAmount = amount * gbpToUsd;

            } else if (toCurrency.equals("EUR")) {
                convertedAmount = amount * gbpToEur;

            } else if (toCurrency.equals("UAH")) {
                convertedAmount = amount * gbpToUAH;
            } else {
                System.out.println("Invalid currency to convert to.");
                return;
            }
        }
        System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " " + toCurrency);
        scanner.close();

    }
}
