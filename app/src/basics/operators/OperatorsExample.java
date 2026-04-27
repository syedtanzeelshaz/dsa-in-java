package basics.operators;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Operators - Example
 * Demonstrates arithmetic, logical, relational, and assignment operators
 */
public class OperatorsExample {
    private static final Logger log = LoggerFactory.getLogger(OperatorsExample.class);
    
    public static void main(String[] args) {
        // Arithmetic Operators
        log.info("=== Arithmetic Operators ===");
        int a = 10, b = 3;
        log.info("a + b = {}", (a + b));    // Addition: 13
        log.info("a - b = {}", (a - b));    // Subtraction: 7
        log.info("a * b = {}", (a * b));    // Multiplication: 30
        log.info("a / b = {}", (a / b));    // Division (integer): 3
        log.info("a % b = {}", (a % b));    // Modulus (remainder): 1
        
        // Increment/Decrement
        log.info("\n=== Increment/Decrement ===");
        int x = 5;
        log.info("x++ = {}", (x++));        // Post-increment: 5 (increment after print)
        log.info("x = {}", x);              // x is now 6
        log.info("++x = {}", (++x));        // Pre-increment: 7 (increment before print)
        
        // Relational Operators (return boolean)
        log.info("\n=== Relational Operators ===");
        int num1 = 15, num2 = 20;
        log.info("num1 == num2: {}", (num1 == num2));  // false
        log.info("num1 != num2: {}", (num1 != num2));  // true
        log.info("num1 < num2: {}", (num1 < num2));    // true
        log.info("num1 > num2: {}", (num1 > num2));    // false
        log.info("num1 <= num2: {}", (num1 <= num2));  // true
        
        // Logical Operators
        log.info("\n=== Logical Operators ===");
        boolean p = true, q = false;
        log.info("p && q (AND): {}", (p && q));        // false (both must be true)
        log.info("p || q (OR): {}", (p || q));         // true (at least one true)
        log.info("!p (NOT): {}", (!p));                // false (opposite)
        
        // Assignment Operators
        log.info("\n=== Assignment Operators ===");
        int val = 10;
        val += 5;           // val = val + 5
        log.info("After += 5: {}", val);   // 15
        val -= 3;           // val = val - 3
        log.info("After -= 3: {}", val);   // 12
        val *= 2;           // val = val * 2
        log.info("After *= 2: {}", val);   // 24
        
        // Ternary Operator (Conditional)
        log.info("\n=== Ternary Operator ===");
        int age = 18;
        String status = age >= 18 ? "Adult" : "Minor";
        log.info("Age {} is: {}", age, status);
    }
}

