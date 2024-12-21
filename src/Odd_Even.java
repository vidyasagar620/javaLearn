import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        System.out.println("Welcome To Odd Even Calculator\n________________");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int Num = input.nextInt();
        if (Num % 2 ==0){
            System.out.println("Number Is Even");
        }
        else {
            System.out.println("Number IS Odd");
        }
    }
}
