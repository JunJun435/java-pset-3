import java.text.DecimalFormat;
import java.util.Scanner;

public class Excercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Salary  : ");
        double salary = input.nextDouble();

        System.out.print("401(k)  : ");
        double k = input.nextDouble();

        System.out.print("Federal : ");
        double federal = input.nextDouble();

        System.out.print("State   : ");
        double state = input.nextDouble();

        double  check = salary / 24;

        double contribution = check * (1 - (k * .01)) ;

        double federal2 = contribution * (federal * .01);

        double state2 =  contribution * (state *.01);

        double receive = contribution - (federal2 + state2 );

        DecimalFormat df2 = new DecimalFormat("0.00");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);
        System.out.println("\n$" + df2.format(receive) + ".");
    }
}
