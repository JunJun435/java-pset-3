import java.util.Scanner;

public class Excercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Amount : ");
        double amount = input.nextDouble();

        int quarters =(int) (amount /.25);
        amount %= .25;

        int dimes =  (int) (amount / .10);
        amount %= .10;

        int nickels = (int) (amount / .05);
        amount %= .05;
        System.out.println(amount);
        int pennies =  (int) (amount / 0.01);

        System.out.println("\nQuarters : " + quarters);
        System.out.println("Dimes    : " + dimes);
        System.out.println("Nickels  : " + nickels);
        System.out.println("Pennies  : " + pennies);
    }
}
