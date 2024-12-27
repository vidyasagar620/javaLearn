import java.util.Scanner;

public class Reverse_Of_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse ");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int sum = Reverse(num);
        System.out.println("Your Reverse Number Is: " + sum);
    }

    public static int Reverse(int num ){
        int sum = 0;
        int i = num;
        while (num != 0){
            int reminder = num % 10;
            sum = sum * 10 + reminder;
            num = num / 10;

        }

        return sum;
    }
}
