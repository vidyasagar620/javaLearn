import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial Calculator\n_____________________ ");
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        int Mul = FactorialNum(num);
        System.out.println("Your Factorial is: " + Mul);

    }
    public static int FactorialNum(int num){
        Scanner input = new Scanner(System.in);
        if ( num < 0){
            System.out.println("negative Number is Not allowed");
            System.out.print("Enter positive  Number: ");
            int num2 = input.nextInt();
            int Mul = 1;
            int i = 1;
            while (i <= num2){
                Mul *= i;
                i++;
            }
            return Mul;
        }else {
            int Mul = 1;
            int i = 1;
            while (i <= num){
                Mul *= i;
                i++;
            }
            return Mul;
        }

    }
}
