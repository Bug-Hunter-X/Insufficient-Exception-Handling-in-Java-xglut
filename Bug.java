public class UncommonBug {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int z = x / y; // Potential ArithmeticException
            System.out.println(z); 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
            // But what if we don't handle other exceptions? 
        } catch (Exception e) {
            System.out.println("Generic exception caught!");
        }
        // Consider adding a finally block to release resources
    }
}