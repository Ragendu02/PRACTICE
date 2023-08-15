package temperatureConversion;
import java.util.Scanner;

public class TempetureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the Temperature Conversion Tool!");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
          
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                    break;

                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double f = scanner.nextDouble();
                    double c = fahrenheitToCelsius(f);
                    System.out.println("Temperature in Celsius: " + c);
                    break;

              
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 2);

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}