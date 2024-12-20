import java.util.Scanner;

public class perimeter_Of_a_Rectangle {
    public static void main(String[] args) {
        System.out.println("Welcome Of Perimeter of Rectangle\n_____________________ ");
        Scanner input = new Scanner(System.in);
        System.out.print("First Angel Of Perimeter: ");
        double A = input.nextDouble();
        System.out.print("Second Angel Of Perimeter: ");
        double B = input.nextDouble();
        System.out.print("Third Angel Of Perimeter: ");
        double C = input.nextDouble();
        System.out.print("Fourth Angel Of Perimeter: ");
        double D = input.nextDouble();
        double Result = A+B+C+D;
        System.out.println("Please Wait Perimeter of Rectangle is Loading");
        System.out.println("Perimeter of Rectangle is Done..........");
        System.out.println(Result);

    }

}
