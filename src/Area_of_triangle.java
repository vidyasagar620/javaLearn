import java.util.Scanner;

public class Area_of_triangle {
    public static void main(String[] args) {
        System.out.println("We Are Find Area of Triangle\n________________");
        Scanner input = new Scanner(System.in);
        System.out.print("Bash Of Triangle: ");
        double B = input.nextDouble();
        System.out.print("Height Of Triangle: ");
        double H = input.nextDouble();
        double area = (B*H)/2   ;
        System.out.println("Area of Triangle is Done..........");
        System.out.println(area);
    }
}
