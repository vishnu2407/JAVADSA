package DSA_JAVA_Concepts.Recursion;

public class FactorialNumber {
    // Recursive function to find factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is " + result);

    }
}
