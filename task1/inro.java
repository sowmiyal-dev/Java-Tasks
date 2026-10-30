//1. What are primitive and non-primitive data types in Java?
//
//=> Primitive data types store simple values directly. Java has 8 primitive types: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, and `boolean`.
//=> Non-primitive data types refer to objects or are used to represent more complex data. Examples include `String`, arrays, classes, and interfaces.
//
//Example:
//int age = 22;                
//char grade = 'A';             
//String name = "Sowmiya";      
//int[] numbers = {10, 20, 30}; 
//
//
//2. Explain the internal workflow of a Java program.
//
//The Java program execution process involves writing source code, compiling it into bytecode, and executing it using the JVM.
//
//Workflow:
//(i) Source Code -> Program.java
//(ii) Java Compiler (`javac`) -> Compiles source code
//(iii) Bytecode -> Program.class
//(iv) JVM -> Loads, verifies and executes bytecode
//(v) Output -> Program result
//
//Example:
//class Program {
//    public static void main(String[] args) {
//        System.out.println("Hello Java");
//    }
//}
//
//Output:
//Hello Java
//
//
//3. What are JDK, JRE, and JVM in Java?
//
//JDK, JRE, and JVM are related components of the Java platform, but each has a different role.
//
//=> JDK — Java Development Kit
//The JDK provides tools required to develop Java programs, including the compiler (`javac`) and tools for debugging and packaging applications. It also includes the runtime components needed to run Java applications.
//
//=> JRE — Java Runtime Environment
//The JRE traditionally refers to the runtime components and libraries needed to run Java applications. It does not include development tools such as the Java compiler. In modern Java distributions, a separate JRE is not always provided.
//
//=> JVM — Java Virtual Machine
//The JVM loads and executes Java bytecode. It manages memory, supports garbage collection, and enables Java bytecode to run on different operating systems when compatible JVM implementations are available.
//
//
//4. What is JIT (Just-In-Time) Compiler? How does it improve performance?
//
//=> The JIT (Just-In-Time) Compiler is a component of the JVM that improves Java program performance by compiling frequently executed bytecode into native machine code while the program is running.
//
//How it works:
//1.The JVM starts executing bytecode using its interpreter.
//2.It monitors code that runs frequently, such as loops and repeatedly called methods.
//3.The JIT compiler compiles selected code into native machine code.
//4.The processor executes that machine code directly, reducing repeated interpretation overhead.
//
//Example:
//for (int i = 0; i < 100000; i++) {
//    System.out.println(i);
//}
//
//Benefits of JIT:
//- Improves performance for frequently executed code.
//- Can optimize code using runtime information.
//- Reduces interpretation overhead.
//- Supports techniques such as method inlining and loop optimizations.
//
//
//5. Explain the relationship between JDK, JRE, JVM, and JIT.
//
//The JDK, JRE, JVM, and JIT work together during Java development and execution.
//
//=> JDK
//i. Development tools + runtime components
//ii. Java Compiler (`javac`)
//iii. Source code → Bytecode
//
//=> JVM
//i. Loads, verifies and executes bytecode
//ii. Interpreter + JIT compiler
//iii. Interprets bytecode and compiles hot code to machine code
//iv. Program Output
//
//The JIT is part of the JVM implementation, not a separate component alongside the JDK, JRE, and JVM. The traditional relationship is JDK → JRE → JVM, with JIT operating inside the JVM. Modern Java distributions may package runtime components differently.
//
