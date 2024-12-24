import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Odd Calculator\n_______________________");
        System.out.print("Enter Number: ");
        int Num = input.nextInt();
        int sum = SumOfOdd_Number(Num);
        System.out.println("Odd sum " + sum + " is: " + Num);
    }

    public static int SumOfOdd_Number(int Num){
        int sum = 0;
        int i = 1;
        while (i <= Num ){
            sum += i;
            i += 2;
        }
        return sum;
    }
}

