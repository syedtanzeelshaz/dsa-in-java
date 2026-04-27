# Methods

## Method Syntax
```java
accessModifier returnType methodName(parameterType parameterName, ...) {
    // method body
    return value;  // if returnType is not void
}
```

## Components

| Part | Description | Example |
|------|-------------|---------|
| Access Modifier | who can call (public, private) | `public` |
| Return Type | what it returns (int, String, void) | `int` |
| Method Name | identifies method | `add` |
| Parameters | inputs to method | `(int a, int b)` |
| Body | code to execute | `{ return a + b; }` |

## Parameter Passing

### Pass by Value (Primitives)
- Copies the value
- Changes in method don't affect original
```java
void increment(int x) { x++; }  // Original unchanged
```

### Pass by Reference (Objects)
- Passes reference to object
- Changes in method affect original
```java
void modify(int[] arr) { arr[0] = 99; }  // Original modified
```

## Method Overloading
- Same method name, different parameters
- Resolved at compile time
- Different by: parameter count, type, or order
```java
int add(int a, int b) { }
double add(double a, double b) { }
int add(int a, int b, int c) { }
```

## Varargs (Variable Arguments)
```java
void method(int... numbers) {
    // numbers is an array
}
```
- Must be last parameter
- Only one varargs per method

## Recursion
- Method calls itself
- Must have base case (termination condition)
- Useful for: factorial, fibonacci, tree traversal

```java
int factorial(int n) {
    if (n <= 1) return 1;        // Base case
    return n * factorial(n - 1); // Recursive case
}
```

## Files
- `MethodsExample.java` - Study all method concepts
- `MethodsExercise.java` - Practice creating methods

