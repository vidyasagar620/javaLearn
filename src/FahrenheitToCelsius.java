import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("Welcome to Temperature\n___________________");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Temperature in °F: ");
        float fah = input.nextFloat();
        float cal = (fah - 32) * 5/9;
        System.out.println("Your Temperature is " + cal +"°C");
    }
}
