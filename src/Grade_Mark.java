import java.util.Scanner;

public class Grade_Mark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Mark In % :  ");
        float Mark = input.nextFloat();

        if (Mark >= 90){

            System.out.println(" Congratulation You are Passed A Grade");

        } else if (Mark > 74 && Mark < 90) {

            System.out.println(" Congratulation You are Passed B Grade");
            
        } else if (Mark >59 && Mark < 75) {

            System.out.println(" Congratulation You are Passed C Grade");

        } else if (Mark > 29 && Mark < 60) {

            System.out.println(" Congratulation You are Passed D Grade");

        }else {
            System.out.println(" Congratulation You are Successful Failed  ");
        }
    }
}
