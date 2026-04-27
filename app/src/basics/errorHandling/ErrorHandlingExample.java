package basics.errorHandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Error Handling - Example
 * Demonstrates try-catch, finally, throwing exceptions, custom exceptions
 */
public class ErrorHandlingExample {
    private static final Logger log = LoggerFactory.getLogger(ErrorHandlingExample.class);
    
    // Method that throws exception
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
    
    // Method with multiple catch blocks
    public static void parseAndPrint(String str) {
        try {
            int num = Integer.parseInt(str);     // Can throw NumberFormatException
            log.info("Number: {}", num);
        } catch (NumberFormatException e) {
            log.info("Error: {} is not a valid number", str);
            log.info("Message: {}", e.getMessage());
        }
    }
    
    // Method with finally block
    public static void readFile() {
        try {
            log.info("Opening file...");
            // Simulating file operation
            throw new Exception("File not found");
        } catch (Exception e) {
            log.info("Caught exception: {}", e.getMessage());
        } finally {
            log.info("Closing file..."); // Always executes
        }
    }
    
    // Custom Exception
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    
    // Method using custom exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120");
        }
        log.info("Age {} is valid", age);
    }
    
    public static void main(String[] args) {
        log.info("=== Try-Catch Example ===");
        try {
            int result = divide(10, 2);
            log.info("10 / 2 = {}", result);
            
            int resultZero = divide(10, 0);  // Will throw exception
        } catch (ArithmeticException e) {
            log.info("Caught ArithmeticException: {}", e.getMessage());
        }
        
        log.info("\n=== Multiple Catch Blocks ===");
        parseAndPrint("123");       // Success
        parseAndPrint("ABC");       // NumberFormatException
        
        log.info("\n=== Finally Block ===");
        readFile();
        
        log.info("\n=== Custom Exception ===");
        try {
            validateAge(25);        // Valid
            validateAge(150);       // Invalid
        } catch (InvalidAgeException e) {
            log.info("Caught InvalidAgeException: {}", e.getMessage());
        }
        
        log.info("\n=== Array Index Exception ===");
        try {
            int[] arr = {1, 2, 3};
            log.info("{}", arr[10]);  // IndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            log.info("Caught: {}", e.getClass().getSimpleName());
        }
    }
}

