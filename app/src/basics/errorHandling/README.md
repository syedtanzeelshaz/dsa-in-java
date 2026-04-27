# Error Handling

## Try-Catch Block
```java
try {
    // Code that might throw exception
} catch (ExceptionType e) {
    // Handle exception
} finally {
    // Always executes (optional)
}
```

### Flow
1. `try`: Execute code
2. If exception occurs → jump to matching `catch`
3. `catch`: Handle exception
4. `finally`: Always execute (cleanup)

## Exception Types

### Checked Exceptions
- Must be caught or declared
- Extends `Exception`
- Examples: IOException, SQLException
```java
public void readFile() throws IOException {
    // May throw IOException
}
```

### Unchecked Exceptions
- Don't need to be caught
- Extends `RuntimeException`
- Examples: NullPointerException, ArrayIndexOutOfBoundsException

```
Exception Hierarchy:
Throwable
├── Error (serious problems, don't catch)
└── Exception
    ├── Checked (IOException, SQLException)
    └── Unchecked/RuntimeException
        ├── NullPointerException
        ├── ArithmeticException
        ├── ArrayIndexOutOfBoundsException
        ├── NumberFormatException
        └── ...
```

## Multiple Catch Blocks
```java
try {
    // code
} catch (ArithmeticException e) {
    // Handle ArithmeticException
} catch (NumberFormatException e) {
    // Handle NumberFormatException
} catch (Exception e) {
    // Handle any other exception (most general last)
}
```

## Throwing Exceptions
```java
public void validateAge(int age) throws InvalidAgeException {
    if (age < 0) {
        throw new InvalidAgeException("Age cannot be negative");
    }
}
```

## Custom Exception
```java
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
```

## Finally Block
- Executes regardless of exception
- Use for: resource cleanup, file closing, etc.
- Executes even if catch has `return` or `throw`

## Common Exceptions

| Exception | Cause |
|-----------|-------|
| NullPointerException | Using null reference |
| ArrayIndexOutOfBoundsException | Invalid array index |
| ArithmeticException | Division by zero |
| NumberFormatException | Invalid number format |
| ClassCastException | Invalid type cast |

## Files
- `ErrorHandlingExample.java` - Study error handling
- `ErrorHandlingExercise.java` - Practice handling errors

