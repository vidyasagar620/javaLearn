import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime number Calculator\n_____________________ ");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        boolean primeNumber = isPrime(num);
        if (primeNumber) {
            System.out.println("THiS IS A PRIME NUMBER ");
        }else {
            System.out.println("THis is not Prime Number  ");
        }
    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

}
