## DSA in JAVA

A comprehensive Java learning repository covering fundamentals and Data Structures & Algorithms.

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher

### Project Structure
```
dsa-in-java/
├── app/src/
│   ├── Main.java
│   └── basics/
│       ├── README.md (START HERE!)
│       ├── variables/
│       ├── operators/
│       ├── controlFlow/
│       ├── methods/
│       ├── oop/
│       ├── errorHandling/
│       └── collections/
│
└── pom.xml
```

### Learning Path

**START WITH BASICS:** Go to `app/src/basics/README.md` for structured learning

1. **Basics** (7 topics)
   - Variables & Data Types
   - Operators
   - Control Flow
   - Methods
   - OOP (Object-Oriented Programming)
   - Error Handling
   - Collections

2. **DSA Topics** (coming soon)
   - Arrays & ArrayList
   - Linked Lists
   - Stacks & Queues
   - Trees
   - Graphs
   - Sorting Algorithms
   - Searching Algorithms

### How to Run Examples

```bash
# Navigate to project root
cd dsa-in-java

# Build the project
mvn clean install

# Run any Example class (e.g., VariablesExample)
mvn exec:java -Dexec.mainClass="basics.variables.VariablesExample"

# Or compile and run manually
javac -d target/classes app/src/basics/variables/VariablesExample.java
java -cp target/classes basics.variables.VariablesExample
```

### Study Tips
✅ Each topic has 3 components:
- `*Example.java` - Study code with detailed comments
- `*Exercise.java` - Practice problems with TODOs
- `README.md` - Quick reference guide

✅ Recommended approach:
1. Read README.md for overview
2. Study and run Example.java
3. Complete Exercise.java TODOs
4. Test your code

### Dependencies
- **SLF4J API 2.0.9** - Logging facade
- **SLF4J Simple 2.0.9** - Simple logging implementation

### Building the Project

```bash
# Build with Maven
mvn clean install

# Run the main program
mvn exec:java -Dexec.mainClass="Main"
```

