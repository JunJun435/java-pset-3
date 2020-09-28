import java.text.DecimalFormat;
import java.util.Scanner;

public class Excercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fahrenheit : ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * ((double)5 / 9);

        double kelvin =  (fahrenheit - 32) * ((double)5 / 9) + 273.15;
        DecimalFormat df2 = new DecimalFormat("0.00");

        System.out.println("\nCelsius : " + df2.format(celsius));
        System.out.println("Kelvin  : " + df2.format(kelvin));
    }
}
