public class ThrowExample {
    public static void main(String[] args){
        try {
            validateNumber(5);
            validateNumber(-3);
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static void validateNumber(int number) throws IllegalArgumentException{
        if (number < 0){
            throw new IllegalArgumentException("Number must be non-negative");
        }
        System.out.println("Number is valid: " +number);
    }
}
