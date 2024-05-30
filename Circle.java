import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        final double PI = 3.142;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.println("The radius = " + radius);
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("Area of circle = " + area);
        System.out.println("Circumference of circle = " + circumference);
    }
}
