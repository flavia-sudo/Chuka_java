public class ExceptionHandling {
    public static void main(String[] args){
        int numerator = 10;
        int denominator = 0;
        try {
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    private static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}
