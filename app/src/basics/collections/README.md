# Collections Framework

## Collection Hierarchy
```
Iterable
└── Collection
    ├── List
    │   ├── ArrayList (resizable, ordered)
    │   ├── LinkedList (doubly-linked)
    │   └── Vector (synchronized, legacy)
    ├── Set (no duplicates)
    │   ├── HashSet (unordered)
    │   ├── TreeSet (sorted)
    │   └── LinkedHashSet (insertion order)
    └── Queue (FIFO)

Map (key-value)
├── HashMap (unordered)
├── TreeMap (sorted by key)
└── LinkedHashMap (insertion order)
```

## Arrays
- Fixed size, homogeneous type
- Accessed by index (0-based)
- Static, allocated at creation

```java
int[] arr = {1, 2, 3};
arr[0] = 10;
int length = arr.length;
```

## ArrayList
- Dynamic size (grows as needed)
- Ordered, allows duplicates
- Implements List interface

```java
ArrayList<String> list = new ArrayList<>();
list.add("A");              // Add element
list.remove(0);             // Remove by index
list.remove("A");           // Remove by value
list.get(0);                // Access element
list.size();                // Get size
list.contains("A");         // Check existence
```

## HashMap
- Key-Value pairs
- No duplicate keys
- Unordered

```java
HashMap<String, Integer> map = new HashMap<>();
map.put("A", 1);            // Add/update
map.get("A");               // Get value by key
map.remove("A");            // Remove
map.containsKey("A");       // Check key existence
map.keySet();               // Get all keys
map.values();               // Get all values
map.entrySet();             // Get key-value pairs
```

## HashSet
- Unique elements
- No duplicates
- Unordered

```java
HashSet<Integer> set = new HashSet<>();
set.add(1);                 // Add
set.add(1);                 // Won't add (duplicate)
set.remove(1);              // Remove
set.contains(1);            // Check existence
```

## Common Operations

### Sorting
```java
ArrayList<Integer> list = new ArrayList<>();
Collections.sort(list);            // Ascending
Collections.reverse(list);         // Reverse order
Collections.max(list);             // Maximum
Collections.min(list);             // Minimum
```

### Iteration
```java
// For-each loop
for (String item : list) { }

// Iterator
Iterator<String> it = list.iterator();
while (it.hasNext()) { 
    String item = it.next(); 
}
```

## Time Complexity

| Operation | ArrayList | HashMap | HashSet |
|-----------|-----------|---------|---------|
| Add | O(1) | O(1) | O(1) |
| Remove | O(n) | O(1) | O(1) |
| Search | O(n) | O(1) | O(1) |
| Access | O(1) | O(1) | N/A |

## Files
- `CollectionsExample.java` - Study all collection types
- `CollectionsExercise.java` - Practice with collections

