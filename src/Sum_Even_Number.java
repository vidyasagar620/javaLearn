import java.util.Scanner;

public class Sum_Even_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Even Sum: ");
        System.out.print(" Enter Number: ");
        int num = input.nextInt();
        int sum = EvenSum(num);
        System.out.println("Your Even Number Add  " + num + " is " + sum);

    }
    public static int EvenSum(int num){
        int sum = 0;
        int i = 2;
        while (i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
