import java.util.Scanner;

public class Lab1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;
       
        System.out.println("\n JAVA LAB 1 PROGRAM \n");
       
        while (continueProgram) {
            displayMenu();
            System.out.print("Enter your choice (1-6): ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    demonstrateArithmeticOperations(scanner);
                    break;
                case 2:
                    demonstrateUserInputOutput(scanner);
                    break;
                case 3:
                    demonstrateTypeConversion();
                    break;
                case 4:
                    demonstrateTypeCasting(scanner);
                    break;
                case 5:
                    simpleCalculator(scanner);
                    break;
                case 6:
                    System.out.println("\n Exit !");
                    continueProgram = false;
                    break;
                default:
                    System.out.println("\nInvalid choice! Please select 1-6.");
            }
            
            if (continueProgram) {
                System.out.println("\n" + "-".repeat(50) + "\n");
            }
        }
        
        scanner.close();
    }
    
    // Display main menu
    public static void displayMenu() {
        System.out.println("MAIN MENU:");
        System.out.println("1. Arithmetic Operations");
        System.out.println("2. User Input & Output");
        System.out.println("3. Type Conversion (Implicit)");
        System.out.println("4. Type Casting (Explicit)");
        System.out.println("5. Simple Calculator");
        System.out.println("6. Exit");
    }
    
    // Exercise 1: Arithmetic operations
    public static void demonstrateArithmeticOperations(Scanner scanner) {
        System.out.println("\n ARITHMETIC OPERATIONS ");
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("\nResults:");
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println("Modulus: " + num1 + " % " + num2 + " = " + (num1 % num2));
        } else {
            System.out.println("Division: Cannot divide by zero!");
            System.out.println("Modulus: Cannot divide by zero!");
        }
        
        // Increment and decrement
        int intNum = (int) num1;
        System.out.println("\nIncrement/Decrement Operations:");
        System.out.println("Original value: " + (int)num1);
        System.out.println("Pre-increment (++n): " + ++intNum);
        intNum = (int) num1;
        System.out.println("Post-increment (n++): " + intNum++ + " (becomes " + intNum + ")");
        intNum = (int) num1;
        System.out.println("Pre-decrement (--n): " + --intNum);
        intNum = (int) num1;
        System.out.println("Post-decrement (n--): " + intNum-- + " (becomes " + intNum + ")");
    }
    
    // Exercise 2: Demonstrate user input and output
    public static void demonstrateUserInputOutput(Scanner scanner) {
        System.out.println("\n USER INPUT & OUTPUT");
        
        scanner.nextLine(); // Clear buffer
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();
        
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        System.out.print("Enter your grade: ");
        char grade = scanner.next().charAt(0);
        
    
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + height + " meters");
        System.out.println("Student: " + (isStudent ? "Yes" : "No"));
        System.out.println("Grade: " + grade);
        
    }
    
    // Exercise 3: Demonstrate implicit type conversion
    public static void demonstrateTypeConversion() {
        System.out.println("\n TYPE CONVERSION (IMPLICIT) ");
       
        byte byteValue = 42;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;
        
        System.out.println("\nAutomatic Type Conversion:");
        System.out.println("Original byte: " + byteValue);
        System.out.println("To short: " + shortValue);
        System.out.println("To int: " + intValue);
        System.out.println("To long: " + longValue);
        System.out.println("To float: " + floatValue);
        System.out.println("To double: " + doubleValue);
        
    }
    
    // Exercise 4: Demonstrate explicit type casting
    public static void demonstrateTypeCasting(Scanner scanner) {
        System.out.println("\n TYPE CONVERSION (EXPLICIT) ");
        
        System.out.print("\nEnter a decimal number: ");
        double originalDouble = scanner.nextDouble();
        
        float castedFloat = (float) originalDouble;
        long castedLong = (long) originalDouble;
        int castedInt = (int) originalDouble;
        short castedShort = (short) originalDouble;
        byte castedByte = (byte) originalDouble;
        
        System.out.println("\nType Casting Results:");
        System.out.println("Original double: " + originalDouble);
        System.out.println("Casted to float: " + castedFloat);
        System.out.println("Casted to long: " + castedLong);
        System.out.println("Casted to int: " + castedInt);
        System.out.println("Casted to short: " + castedShort);
        System.out.println("Casted to byte: " + castedByte);
        
        // Data loss example
        int largeInt = 130;
        byte smallByte = (byte) largeInt;
        System.out.println("\nData Loss Example:");
        System.out.println("Int value: " + largeInt);
        System.out.println("Casted to byte: " + smallByte + " (Data loss! byte range: -128 to 127)");
        
        // Int to char
        System.out.print("\nEnter ASCII value (65-90 for A-Z): ");
        int asciiInput = scanner.nextInt();
        char convertedChar = (char) asciiInput;
        System.out.println("ASCII " + asciiInput + " = Character '" + convertedChar + "'");
    }
    
    // Exercise 5: Simple calculator
    public static void simpleCalculator(Scanner scanner) {
        System.out.println("\n CALCULATOR ");
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("\nOperations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. All Operations");
        
        System.out.print("\nSelect operation (1-6): ");
        int operation = scanner.nextInt();
        
        double result = 0;
        
        
        System.out.println("\nResult:");
        
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
                
            case 2:
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
                
            case 3:
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
                
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    
                }
                break;
                
            case 5:
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Cannot perform modulus with zero!");
                    
                }
                break;
                
            case 6:
                System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
                System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
                if (num2 != 0) {
                    System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    System.out.println("Modulus: " + num1 + " % " + num2 + " = " + (num1 % num2));
                } else {
                    System.out.println("Division: Cannot divide by zero!");
                    System.out.println("Modulus: Cannot divide by zero!");
                }
                break;
                
            default:
                System.out.println("Invalid operation!");

        }
    }
}