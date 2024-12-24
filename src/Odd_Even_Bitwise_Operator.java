import java.util.Scanner;

public class Odd_Even_Bitwise_Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int Num = input.nextInt();

        if ((Num & 1) == 1){
            System.out.println("Your number is Odd");

        }else {
            System.out.println("Your number is even");
        }
    }
}
