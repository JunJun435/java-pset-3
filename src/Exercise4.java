import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Height:\t");
        double height = input.nextDouble();

        System.out.print("Width:\t");
        double width = input.nextDouble();

        double perimeter = (height * 2.54 * 2 ) + (width * 2.54 * 2);
        DecimalFormat df2 = new DecimalFormat("0.00");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);
        df2.setRoundingMode(RoundingMode.UP);
        System.out.println("\n" + df2.format(perimeter)+ " centimeters.");

    }
}
