# Operators

## Categories

### Arithmetic Operators
| Operator | Name | Example |
|----------|------|---------|
| + | Addition | `a + b` |
| - | Subtraction | `a - b` |
| * | Multiplication | `a * b` |
| / | Division | `a / b` |
| % | Modulus (Remainder) | `a % b` |

### Increment/Decrement
- `x++` - Post-increment (use value, then increment)
- `++x` - Pre-increment (increment, then use value)
- `x--` - Post-decrement
- `--x` - Pre-decrement

### Relational Operators (return boolean)
| Operator | Meaning |
|----------|---------|
| == | Equal to |
| != | Not equal |
| < | Less than |
| > | Greater than |
| <= | Less than or equal |
| >= | Greater than or equal |

### Logical Operators
| Operator | Name | Example |
|----------|------|---------|
| && | AND | true if both are true |
| \|\| | OR | true if at least one is true |
| ! | NOT | opposite value |

### Assignment Operators
| Operator | Shorthand |
|----------|-----------|
| = | `x = 5` |
| += | `x += 3` → `x = x + 3` |
| -= | `x -= 3` → `x = x - 3` |
| *= | `x *= 3` → `x = x * 3` |
| /= | `x /= 3` → `x = x / 3` |

### Ternary Operator
```java
condition ? valueIfTrue : valueIfFalse
// Example: age >= 18 ? "Adult" : "Minor"
```

## Operator Precedence (highest to lowest)
1. `++`, `--` (Increment/Decrement)
2. `*`, `/`, `%` (Multiplication, Division, Modulus)
3. `+`, `-` (Addition, Subtraction)
4. `<`, `>`, `<=`, `>=` (Relational)
5. `==`, `!=` (Equality)
6. `&&` (AND)
7. `||` (OR)
8. `?:` (Ternary)

## Files
- `OperatorsExample.java` - Study all operator types
- `OperatorsExercise.java` - Practice with exercises

