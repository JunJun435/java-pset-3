import java.util.Scanner;

public class Excercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Students : ");
        int students = input.nextInt();

        System.out.print("Teachers : ");
        int teachers = input.nextInt();

        System.out.print("Capacity : ");
        int capacity = input.nextInt();

        int passengers = students + teachers;

        int lastBus = passengers % capacity;

        int busNumber = (int)((double)passengers / capacity + .9999);

        System.out.println("\nBuses required      : " + busNumber);
        System.out.println("Overflow passengers : " + lastBus);
    }

}
