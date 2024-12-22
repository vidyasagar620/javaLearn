import java.time.Year;
import java.util.Scanner;

public class leap_Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Leap year Calculator\n___________________________");
        System.out.print("Enter Year: ");
        int year = input.nextInt();
        if (year % 4  == 0 && year % 400 == 0){
            System.out.println("This Is Leap Year");

        }else if (year % 100 != 0){
            System.out.println("This is not Leap Year");
        }

    }
}

