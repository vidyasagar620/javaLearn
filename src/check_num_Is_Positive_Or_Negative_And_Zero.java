import java.util.Scanner;

public class check_num_Is_Positive_Or_Negative_And_Zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int Num = input.nextInt();
        if (Num > 0 ){
            System.out.println("Number is Positive");
        }else  if (Num < 0){
            System.out.println("Number is Negative");
        }
        else {
            System.out.println("Number is Zero");
        }
    }

}
