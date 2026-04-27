package basics.variables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Variables and Data Types - Example
 * Demonstrates Java variable declaration, initialization, and basic data types
 */
public class VariablesExample {
    private static final Logger log = LoggerFactory.getLogger(VariablesExample.class);
    
    public static void main(String[] args) {
        // Primitive Data Types
        
        // Integer types
        byte byteVar = 127;              // -128 to 127
        short shortVar = 32767;          // -32,768 to 32,767
        int intVar = 2147483647;         // -2^31 to 2^31-1
        long longVar = 9223372036854775807L;  // -2^63 to 2^63-1 (suffix L required)
        
        // Floating-point types
        float floatVar = 3.14f;          // 32-bit (suffix f required)
        double doubleVar = 3.14159;      // 64-bit (default for decimals)
        
        // Character and Boolean
        char charVar = 'A';              // Single 16-bit Unicode character
        boolean boolVar = true;          // true or false
        
        // Output
        log.info("=== Primitive Data Types ===");
        log.info("byte: {}", byteVar);
        log.info("short: {}", shortVar);
        log.info("int: {}", intVar);
        log.info("long: {}", longVar);
        log.info("float: {}", floatVar);
        log.info("double: {}", doubleVar);
        log.info("char: {}", charVar);
        log.info("boolean: {}", boolVar);
        
        // Reference Data Types
        log.info("\n=== Reference Data Types ===");
        String name = "Java Learner";   // String (immutable sequence of characters)
        log.info("String: {}", name);
        
        // Variable Scope
        log.info("\n=== Variable Scope Demo ===");
        int globalInt = 10;
        {
            int localInt = 20;
            log.info("globalInt (accessible): {}", globalInt);
            log.info("localInt (local scope): {}", localInt);
        }
        // log.info("localInt (not accessible): {}", localInt);  // ERROR
    }
}

