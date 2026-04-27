package basics.methods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Methods/Functions - Example
 * Demonstrates method declaration, parameters, return types, and overloading
 */
public class MethodsExample {
    private static final Logger log = LoggerFactory.getLogger(MethodsExample.class);
    
    // Method with no parameters and no return
    public static void greet() {
        log.info("Hello, Java!");
    }
    
    // Method with parameters and return type
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method with String return type
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    
    // Method with array parameter
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    // Method Overloading: Same name, different parameters
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    // Overloaded method: 3 parameters
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    // Overloaded method: double parameters
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    // Method with variable-length arguments (varargs)
    public static double average(double... numbers) {
        if (numbers.length == 0) return 0;
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
    
    // Recursive method: Factorial
    public static int factorial(int n) {
        if (n <= 1) return 1;           // Base case
        return n * factorial(n - 1);    // Recursive case
    }
    
    public static void main(String[] args) {
        log.info("=== Method Examples ===\n");
        
        // Call method with no parameters
        greet();
        
        // Call method with parameters and return
        log.info("add(5, 10) = {}", add(5, 10));
        log.info("Full name: {}", getFullName("John", "Doe"));
        
        // Method with array
        int[] nums = {1, 2, 3, 4, 5};
        log.info("Sum of array: {}", sumArray(nums));
        
        // Method Overloading
        log.info("\n=== Method Overloading ===");
        log.info("multiply(4, 5) = {}", multiply(4, 5));
        log.info("multiply(2, 3, 4) = {}", multiply(2, 3, 4));
        log.info("multiply(2.5, 4.0) = {}", multiply(2.5, 4.0));
        
        // Varargs
        log.info("\n=== Varargs ===");
        log.info("average(10, 20, 30) = {}", average(10, 20, 30));
        log.info("average(5, 15, 25, 35) = {}", average(5, 15, 25, 35));
        
        // Recursion
        log.info("\n=== Recursion ===");
        log.info("factorial(5) = {}", factorial(5));
        log.info("factorial(6) = {}", factorial(6));
    }
}

