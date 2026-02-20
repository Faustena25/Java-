import java.util.Scanner;

public class P1d {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" 1: Read Name and Age ");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("\nOutput:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Welcome, " + name + "! You are " + age + " years old.");
        
        
    
        System.out.println("\n 2: Read Two Numbers and Print Sum ");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        
        System.out.println("\nOutput:");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Sum: " + num1 + " + " + num2 + " = " + sum);
        
        
       
        System.out.println("\n 3: Read Float and Print Square ");
        System.out.print("Enter a decimal number: ");
        float number = scanner.nextFloat();
        
        float square = number * number;
        
        System.out.println("\nOutput:");
        System.out.println("Number: " + number);
        System.out.println("Square: " + number + " × " + number + " = " + square);
        System.out.printf("Square (formatted): %.2f%n", square);
        
        
    
        System.out.println("\n 4: Read a Character ");
        System.out.print("Enter a single character: ");
        char character = scanner.next().charAt(0);
        
        System.out.println("\nOutput:");
        System.out.println("You entered: " + character);
        System.out.println("ASCII value: " + (int)character);
        System.out.println("Is letter: " + Character.isLetter(character));
        System.out.println("Is digit: " + Character.isDigit(character));
        
        
        System.out.println("\n 5: Read and Print Multiple Inputs ");
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int personAge = scanner.nextInt();
        
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();
        
        System.out.print("Are you employed? (true/false): ");
        boolean isEmployed = scanner.nextBoolean();
        
        System.out.println("\n--- Personal Information ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("City: " + city);
        System.out.println("Age: " + personAge);
        System.out.println("Height: " + height + " meters");
        System.out.println("Employed: " + isEmployed);
        
        
    
        System.out.println("\n 6: Difference between next() and nextLine() ");
        scanner.nextLine(); // Consume newline
        
        System.out.println("Using next() - reads single word:");
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();
        System.out.println("You entered: " + firstName);
        
        scanner.nextLine(); // Consume remaining line
        
        System.out.println("\nUsing nextLine() - reads entire line:");
        System.out.print("Enter your full sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);
        
        System.out.println("\nDemonstration:");
        System.out.print("Type multiple words and press Enter: ");
        String word = scanner.next();
        String restOfLine = scanner.nextLine();
        
        System.out.println("next() captured: \"" + word + "\"");
        System.out.println("Remaining line: \"" + restOfLine + "\"");
        
        System.out.println("\nKey Differences:");
        System.out.println("next()     - Reads until whitespace (space, tab, newline)");
        System.out.println("nextLine() - Reads entire line until Enter key");
        
        
        
        System.out.println("\n 7: Calculate Average Marks ");
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int totalMarks = 0;
        
        System.out.println("\nEnter marks for each subject:");
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        
        double average = (double) totalMarks / numSubjects;
        
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Number of Subjects: " + numSubjects);
        System.out.println("Average Marks: " + average);
        System.out.printf("Average (formatted): %.2f%n", average);
        
        // Determine grade
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println("Grade: " + grade);
        


        System.out.println("\n 8: Print Error Message using System.err");
        System.out.print("Enter a number (positive only): ");
        int userInput = scanner.nextInt();
        
        if (userInput < 0) {
            System.err.println("ERROR: Negative number not allowed!");
            System.err.println("ERROR: Please enter a positive number.");
        } else {
            System.out.println("SUCCESS: Valid input received - " + userInput);
        }
        
        // Demonstrating different output streams
        System.out.println("\nDemonstration of output streams:");
        System.out.println("This is printed to standard output (System.out)");
        System.err.println("This is printed to standard error (System.err)");
        
        System.out.print("Enter zero to see error, non-zero for success: ");
        int testValue = scanner.nextInt();
        
        if (testValue == 0) {
            System.err.println("ERROR: Division by zero not allowed!");
        } else {
            System.out.println("Result: " + (100 / testValue));
        }
        
        
        // 9. Calculate tax from salary input
        System.out.println("\n 9: Calculate Tax from Salary ");
        System.out.print("Enter your annual salary: $");
        double salary = scanner.nextDouble();
        
        double tax = 0;
        double taxRate = 0;
        
        // Tax slabs
        if (salary <= 10000) {
            taxRate = 0;
            tax = 0;
        } else if (salary <= 30000) {
            taxRate = 5;
            tax = (salary - 10000) * 0.05;
        } else if (salary <= 60000) {
            taxRate = 10;
            tax = (20000 * 0.05) + (salary - 30000) * 0.10;
        } else if (salary <= 100000) {
            taxRate = 15;
            tax = (20000 * 0.05) + (30000 * 0.10) + (salary - 60000) * 0.15;
        } else {
            taxRate = 20;
            tax = (20000 * 0.05) + (30000 * 0.10) + (40000 * 0.15) + (salary - 100000) * 0.20;
        }
        
        double netSalary = salary - tax;
        
        System.out.println("\n--- Tax Calculation ---");
        System.out.printf("Gross Salary: $%.2f%n", salary);
        System.out.printf("Tax Rate: %.0f%%%n", taxRate);
        System.out.printf("Tax Amount: $%.2f%n", tax);
        System.out.printf("Net Salary: $%.2f%n", netSalary);
        
        System.out.println("\nTax Slabs:");
        System.out.println("Up to $10,000: 0%");
        System.out.println("$10,001 - $30,000: 5%");
        System.out.println("$30,001 - $60,000: 10%");
        System.out.println("$60,001 - $100,000: 15%");
        System.out.println("Above $100,000: 20%");
        
        
        // 10. Simple login using input
        System.out.println("\n=== Task 10: Simple Login System ===");
        scanner.nextLine(); // Consume newline
        
        // Predefined credentials
        final String CORRECT_USERNAME = "admin";
        final String CORRECT_PASSWORD = "password123";
        
        System.out.println("--- Login System ---");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        System.out.println("\nAuthenticating...");
        
        if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
            System.out.println("✓ Login Successful!");
            System.out.println("Welcome, " + username + "!");
            System.out.println("Access Granted.");
        } else {
            System.err.println("✗ Login Failed!");
            
            if (!username.equals(CORRECT_USERNAME)) {
                System.err.println("ERROR: Invalid username.");
            }
            if (!password.equals(CORRECT_PASSWORD)) {
                System.err.println("ERROR: Invalid password.");
            }
            
            System.err.println("Access Denied.");
        }
        scanner.close();
    }
}