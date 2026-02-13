import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("celsius");
        double celsius = sc.nextDouble();
        System.out.println("fahrenheit");
        double fahrenheit = sc.nextDouble();
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println("Temperature in Fahrenheit: " + tc.celsiusToFahreheit(celsius));
        System.out.println("Temperature in celsius: " + tc.fahreheitToCelsius(fahrenheit));
    }
}
