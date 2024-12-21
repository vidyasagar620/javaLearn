import java.util.Scanner;

public class Licence_eligibility_check {
    public static void main(String[] args) {
        System.out.println("Welcome to Licence Eligibility Check\n_____________________");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Age: ");
        int Age = input.nextInt();
        if (Age >= 18) {
            System.out.println("Congratulation You Are Eligible  ");
        }
        else {
                System.out.println("You Are not Eligible");
        }




    }
}
