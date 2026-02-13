import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    }

    public double celsiusToFahreheit (double celsius) {
        return (celsius * 9/5) +32;
    }
    public double fahreheitToCelsius (double fahreheit ) {
        return (fahreheit -32) * 9/5;
    }

}
