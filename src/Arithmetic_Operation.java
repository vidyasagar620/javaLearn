import java.util.Scanner;

public class Arithmetic_Operation {
    public static void main(String[] args) {
        System.out.println("Welcome to Arithmetic operation\n______________________ ");
        Scanner input = new Scanner(System.in);
        System.out.print("Give me First Number: ");
        int Num1 = input.nextInt();
        System.out.print("Give me Second Number: ");
        int Num2 = input.nextInt();
        System.out.println("Arithmetic Operation is Done.....\n ");
        System.out.println("Add: "+ (Num1+Num2));
        System.out.println("Sub: "+( Num1-Num2));
        System.out.println("Multi: "+ (Num1*Num2));
        System.out.println("Div: "+ (Num1/Num2));
        System.out.println("Module: "+ (Num1%Num2));
    }
}
