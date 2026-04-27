package basics.collections;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Collections - Example
 * Demonstrates Arrays, ArrayList, HashMap, HashSet, and basic operations
 */
public class CollectionsExample {
    private static final Logger log = LoggerFactory.getLogger(CollectionsExample.class);
    
    public static void main(String[] args) {
        // Array: Fixed size, same type
        log.info("=== Arrays ===");
        int[] numbers = {10, 20, 30, 40, 50};
        log.info("Array length: {}", numbers.length);
        StringBuilder arrayElements = new StringBuilder("Array elements: ");
        for (int num : numbers) {
            arrayElements.append(num).append(" ");
        }
        log.info("{}", arrayElements.toString());
        
        // ArrayList: Dynamic size, can add/remove
        log.info("\n=== ArrayList ===");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        log.info("ArrayList: {}", fruits);
        log.info("Size: {}", fruits.size());
        log.info("First element: {}", fruits.get(0));
        log.info("Contains 'Banana': {}", fruits.contains("Banana"));
        
        fruits.remove("Banana");
        log.info("After removing Banana: {}", fruits);
        
        fruits.set(0, "Mango");
        log.info("After replacing Apple with Mango: {}", fruits);
        
        // HashMap: Key-Value pairs
        log.info("\n=== HashMap ===");
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 28);
        log.info("HashMap: {}", ages);
        log.info("Age of Alice: {}", ages.get("Alice"));
        log.info("Contains 'Bob': {}", ages.containsKey("Bob"));
        
        ages.put("Alice", 26);  // Update value
        log.info("After updating Alice age: {}", ages);
        
        ages.remove("Charlie");
        log.info("After removing Charlie: {}", ages);
        
        // Iterate HashMap
        log.info("All entries:");
        for (String key : ages.keySet()) {
            log.info("  {} -> {}", key, ages.get(key));
        }
        
        // HashSet: Unique elements, no duplicates
        log.info("\n=== HashSet ===");
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(5);
        uniqueNumbers.add(10);
        uniqueNumbers.add(5);  // Duplicate, won't be added
        uniqueNumbers.add(15);
        log.info("HashSet: {}", uniqueNumbers);
        log.info("Size: {}", uniqueNumbers.size());
        log.info("Contains 10: {}", uniqueNumbers.contains(10));
        
        // ArrayList of Objects
        log.info("\n=== ArrayList of Objects ===");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 85));
        students.add(new Student("Jane", 92));
        students.add(new Student("Mike", 78));
        
        log.info("Students: ");
        for (Student s : students) {
            log.info("  {}", s);
        }
        
        // List operations
        log.info("\n=== Collections Methods ===");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(30, 10, 40, 20, 50));
        log.info("Original: {}", nums);
        
        Collections.sort(nums);
        log.info("After sort: {}", nums);
        
        Collections.reverse(nums);
        log.info("After reverse: {}", nums);
        
        log.info("Max: {}", Collections.max(nums));
        log.info("Min: {}", Collections.min(nums));
    }
    
    // Helper class for ArrayList example
    static class Student {
        String name;
        int score;
        
        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
        
        @Override
        public String toString() {
            return name + " (" + score + ")";
        }
    }
}

