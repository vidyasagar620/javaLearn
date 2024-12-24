import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to Multiplication world ");
        System.out.print(" Enter Your number: ");
        int Num = input.nextInt();
        printMultiplicationTable(Num);


    }
    public static void printMultiplicationTable(int Num){
        int i = 1;
        while (i <= 10){
            System.out.println(Num + " X " + i + " = " + (Num * i));
            i++;
        }

    }
}
