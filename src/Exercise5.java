import java.text.DecimalFormat;
import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Homework 1 : ");
        double hw1 = input.nextDouble();

        System.out.print("Homework 2 : ");
        double hw2 = input.nextDouble();

        System.out.print("Homework 3 : ");
        double hw3 = input.nextDouble();

        System.out.print("Quiz 1     : ");
        double q1 = input.nextDouble();

        System.out.print("Quiz 2     : ");
        double q2 = input.nextDouble();

        System.out.print("Test 1     : ");
        double t1 = input.nextDouble();

        double hwAverage = (hw1 + hw2 + hw3) / 3 * .15 ;

        double qAverage = (q1 +q2) / 2  * .35;

        double tAverage = t1 * .50;

        double grade = hwAverage + qAverage + tAverage;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\n" + df.format(grade)+ "%.");
    }
}
