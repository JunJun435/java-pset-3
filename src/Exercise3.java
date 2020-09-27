import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Excercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Height:\t");
        double height = input.nextDouble();

        System.out.print("Width:\t");
        double width = input.nextDouble();

        double area = (height * 25.4 ) * (width * 25.4);
        DecimalFormat df2 = new DecimalFormat("0.00");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);
        df2.setRoundingMode(RoundingMode.UP);
        System.out.println("\n" + df2.format(area)+ " square millimeters.");

    }
}
