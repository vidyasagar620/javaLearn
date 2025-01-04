import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series\n________________________");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int fib = Fib_Num(num);
        System.out.println("Fibonacci Series up to " + num + " terms:");

    }
    public static int Fib_Num (int num){
        int first = 0 , second = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        return num;
    }
}
