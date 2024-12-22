import java.util.Scanner;

public class Greatest_Of_three_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int Num1 = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int Num2 = input.nextInt();
        System.out.print("Enter the Third Number: ");
        int Num3 = input.nextInt();

        if (Num1 >= Num2 && Num2 >= Num3) {
            System.out.println(Num1 + " is Greater Number " );
        } else if (Num2 >= Num3) {
            System.out.println(Num2 + " is Greater Number");
        }else {
            System.out.println(Num3 + " is Greater Number");
        }

    }
}