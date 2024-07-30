import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the base currency: ");
        String baseCurrency = scanner.nextLine();
        System.out.println("Choose the target currency: ");
        String targetCurrency = scanner.nextLine();
        System.out.println("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        double exchangeRate = 1.0; 
        double convertedAmount = amount * exchangeRate;
        System.out.println("Converted Amount: " + convertedAmount + " " + targetCurrency);
    }
}