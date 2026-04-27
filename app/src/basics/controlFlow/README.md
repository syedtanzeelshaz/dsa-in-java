# Control Flow

## Conditional Statements

### If-Else
```java
if (condition) {
    // execute if true
} else if (condition) {
    // execute if first is false and this is true
} else {
    // execute if all are false
}
```

### Switch
```java
switch (variable) {
    case value1:
        // code if variable == value1
        break;
    case value2:
        // code if variable == value2
        break;
    default:
        // code if no case matches
}
```
**Note:** `break` exits switch; without it, execution continues (fall-through)

## Loops

### For Loop
```java
for (init; condition; update) {
    // code
}
// Example: for (int i = 0; i < 5; i++)
```

### For-Each Loop (Enhanced For)
```java
for (type variable : array/collection) {
    // code
}
// Example: for (int num : numbers)
```
Used for iterating through arrays/collections without index

### While Loop
```java
while (condition) {
    // code
    // update condition
}
```
Executes while condition is true; may not execute at all if false initially

### Do-While Loop
```java
do {
    // code
    // update condition
} while (condition);
```
Executes at least once before checking condition

## Loop Control

### Break
- Exits the loop immediately
- Useful for early termination

### Continue
- Skips current iteration
- Jumps to next iteration

## Quick Comparison
| Loop | Best For | Guaranteed Iterations |
|------|----------|----------------------|
| for | Known count | 0 or more |
| for-each | Collections/Arrays | 0 or more |
| while | Unknown count | 0 or more |
| do-while | Unknown count | At least 1 |

## Files
- `ControlFlowExample.java` - Study all flow control techniques
- `ControlFlowExercise.java` - Practice with exercises

