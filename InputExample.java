import java.util.Scanner;
public class InputExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        sc.close();
    }
}
