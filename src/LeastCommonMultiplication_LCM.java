import java.util.Scanner;

public class LeastCommonMultiplication_LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM  Calculator\n_______________");
        System.out.print("Enter Number First: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int lcm = LCM( num1 , num2);
        System.out.println(" Your LCM is : " + lcm);


    }
    public static int LCM(int num1 , int num2){
        int i = 1;
        while (true) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }

    }
}
