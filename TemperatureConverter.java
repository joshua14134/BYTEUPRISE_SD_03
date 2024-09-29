import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("Select conversion:");
        System.out.println("1. Celsius to Fahrenheit and Kelvin");
        System.out.println("2. Fahrenheit to Celsius and Kelvin");
        System.out.println("3. Kelvin to Celsius and Fahrenheit");

        System.out.print("Enter your choice (1/2/3): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheitFromCelsius = celsiusToFahrenheit(celsius);
                double kelvinFromCelsius = celsiusToKelvin(celsius);
                System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit and %.2f Kelvin.%n", celsius, fahrenheitFromCelsius, kelvinFromCelsius);
                break;
            case "2":
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsiusFromFahrenheit = fahrenheitToCelsius(fahrenheit);
                double kelvinFromFahrenheit = fahrenheitToKelvin(fahrenheit);
                System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius and %.2f Kelvin.%n", fahrenheit, celsiusFromFahrenheit, kelvinFromFahrenheit);
                break;
            case "3":
                System.out.print("Enter temperature in Kelvin: ");
                double kelvin = scanner.nextDouble();
                double celsiusFromKelvin = kelvinToCelsius(kelvin);
                double fahrenheitFromKelvin = kelvinToFahrenheit(kelvin);
                System.out.printf("%.2f Kelvin is equal to %.2f Celsius and %.2f Fahrenheit.%n", kelvin, celsiusFromKelvin, fahrenheitFromKelvin);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
