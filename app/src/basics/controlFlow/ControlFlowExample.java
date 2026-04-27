package basics.controlFlow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Control Flow - Example
 * Demonstrates if-else, switch, loops (for, while, do-while)
 */
public class ControlFlowExample {
    private static final Logger log = LoggerFactory.getLogger(ControlFlowExample.class);
    
    public static void main(String[] args) {
        // If-Else Statement
        log.info("=== If-Else ===");
        int score = 85;
        if (score >= 90) {
            log.info("Grade: A");
        } else if (score >= 80) {
            log.info("Grade: B");
        } else if (score >= 70) {
            log.info("Grade: C");
        } else {
            log.info("Grade: F");
        }
        
        // Switch Statement
        log.info("\n=== Switch ===");
        int day = 3;
        switch (day) {
            case 1:
                log.info("Monday");
                break;
            case 2:
                log.info("Tuesday");
                break;
            case 3:
                log.info("Wednesday");
                break;
            case 4:
                log.info("Thursday");
                break;
            case 5:
                log.info("Friday");
                break;
            default:
                log.info("Weekend");
        }
        
        // For Loop
        log.info("\n=== For Loop ===");
        StringBuilder forLoopResult = new StringBuilder("Numbers 1-5: ");
        for (int i = 1; i <= 5; i++) {
            forLoopResult.append(i).append(" ");
        }
        log.info("{}", forLoopResult.toString());
        
        // For-Each Loop
        log.info("\n=== For-Each Loop ===");
        int[] numbers = {10, 20, 30, 40};
        StringBuilder forEachResult = new StringBuilder("Array elements: ");
        for (int num : numbers) {
            forEachResult.append(num).append(" ");
        }
        log.info("{}", forEachResult.toString());
        
        // While Loop
        log.info("\n=== While Loop ===");
        int count = 1;
        StringBuilder whileResult = new StringBuilder("While (1-5): ");
        while (count <= 5) {
            whileResult.append(count).append(" ");
            count++;
        }
        log.info("{}", whileResult.toString());
        
        // Do-While Loop
        log.info("\n=== Do-While Loop ===");
        int x = 1;
        StringBuilder doWhileResult = new StringBuilder("Do-While (1-5): ");
        do {
            doWhileResult.append(x).append(" ");
            x++;
        } while (x <= 5);
        log.info("{}", doWhileResult.toString());
        
        // Break and Continue
        log.info("\n=== Break and Continue ===");
        StringBuilder continueResult = new StringBuilder("With continue (skip 3): ");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;           // Skip 3
            continueResult.append(i).append(" ");
        }
        log.info("{}", continueResult); // Output: 1 2 4 5
        
        StringBuilder breakResult = new StringBuilder("With break (stop at 3): ");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;              // Exit loop at 3
            breakResult.append(i).append(" ");
        }
        log.info("{}", breakResult); // Output: 1 2
    }
}

