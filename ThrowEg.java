public class ThrowEg {
    public static void main(String[] args){
        try{
            validateAge(15);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static void validateAge(int age){
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Age is valid");
    }
}
