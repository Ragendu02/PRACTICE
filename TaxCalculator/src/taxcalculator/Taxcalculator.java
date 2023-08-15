package taxcalculator;
import java.util.Scanner;
public class Taxcalculator {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scan.nextDouble();

        System.out.print("Enter the tax rate (in decimal form): ");
        double taxRate = scan.nextDouble();

        double totalCost = calculateTotalWithTax(purchaseAmount, taxRate);

        System.out.printf("Total cost including tax: "+totalCost);

       
    }

    public static double calculateTotalWithTax(double purchaseAmount, double taxRate) {
        double taxAmount = purchaseAmount * taxRate;
        double totalCost = purchaseAmount + taxAmount;
        return totalCost;
    }
}
