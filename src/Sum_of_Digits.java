import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Sum of Number Calculator\n__________________________");
        System.out.print("Enter Your number: ");
        int num = input.nextInt();
        int sum = SumOf(num);
        System.out.println("Your Answer is " + sum);

    }
    public static int SumOf(int num ){
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
