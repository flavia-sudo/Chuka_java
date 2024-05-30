import java.util.Scanner;
public class Calculation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Num1 = " +num1);
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("Num2 = " +num2);
    int add = num1 + num2;
    System.out.println("Addition = " +add);
    int sub = num1 - num2;
    System.out.println("Subtraction = " +sub);
    int product = num1 * num2;
    System.out.println("Product = " +product);
    }
}
