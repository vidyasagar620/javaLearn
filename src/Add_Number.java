import java.util.Scanner;

public class Add_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int Num1 = input.nextInt();
        System.out.print("Enter Secound Number: ");
        int Num2 = input.nextInt();
        int Result = Num1 + Num2;
        System.out.println(Result);
    }
}
