import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD Finder\n____________________");
        System.out.print("Enter your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your Second Number: ");
        int num2 = input.nextInt();
        int gcd = Greatest(num1 , num2);
        System.out.println("Your GCD is: " + gcd);



    }
    public static int Greatest(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int Least = Least( num1, num2);

        while (i <= Least){
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int Least(int num1 , int num2){
        if (num1 < num2){
            return num1;
        }else {
            return num2;
        }
    }
}
