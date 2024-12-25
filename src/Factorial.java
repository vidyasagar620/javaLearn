import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial Calculator\n_____________________ ");
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        long Mul = FactorialNum(num);
        System.out.println("Your Factorial is: " + Mul);

    }

    public static long FactorialNum(int num) {
        Scanner input = new Scanner(System.in);
        if (num < 0) {
            System.out.println("negative Number is Not allowed");
            return 0;
        }
        long Mul = 1;
        int i = 1;
        while (i <= num) {
            Mul *= i;
            i++;
        }
        return Mul;
    }

}
