import java.util.Scanner;

public class leap_Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Leap year Calculator\n___________________________");
        System.out.print("Enter Year: ");
        int year = input.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("this is  a leap year");
        }
        else {
            System.out.println("this is not a leap year");
        }

    }
}

