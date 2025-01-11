public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int z = x / y; 
            System.out.println(z); 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Another exception caught: " + e.getMessage());
        } finally {
            System.out.println("This always executes");
        }
    }
}