import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Interest Calculate\n____________________");
        Scanner input = new Scanner(System.in);
        System.out.print("First Give ME Principal Amount: ");
        double principal = input.nextDouble();
        System.out.print("Then, Give ME Time In Month: ");
        double Time = input.nextDouble();
        System.out.print("last  Give ME Rate: ");
        double Rate = input.nextDouble();
        double Simple_interest = (principal*Rate*Time)/100;
        System.out.println("Simple Interest Is Done.......");
        System.out.println(Simple_interest);
    }
}
