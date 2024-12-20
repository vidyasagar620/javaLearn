import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Swapping Station \n___________________________\n ");
        System.out.print("Please Give Me First Number: ");
        int Num1 = input.nextInt();
        System.out.print("Please Give Me Second Number:");
        int Num2 = input.nextInt();
        int Num3 = Num1;
        Num1 = Num2;
        Num2 = Num3;
        System.out.println("Swapping Done....\n");
        System.out.println("Your  First Swap Number Is: " + Num1);
        System.out.println("Your Second Swap Number Is: "  + Num2);

    }
}
