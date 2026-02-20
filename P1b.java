import java.util.Scanner;

public class P1b {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println(" 1: Arithmetic Operators ");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("\nArithmetic Operations:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        
        
        
        System.out.println("\n  2: Even or Odd Check ");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);
        


        System.out.println("\n  3: Relational Operators ");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        System.out.println("\nComparison Results:");
        System.out.println(a + " == " + b + " : " + (a == b));
        System.out.println(a + " != " + b + " : " + (a != b));
        System.out.println(a + " > " + b + " : " + (a > b));
        System.out.println(a + " < " + b + " : " + (a < b));
        System.out.println(a + " >= " + b + " : " + (a >= b));
        System.out.println(a + " <= " + b + " : " + (a <= b));
        
        System.out.println("\n  4: Voting Eligibility (Logical Operators) ");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();
        
        boolean canVote = (age >= 18) && isCitizen;
        
        System.out.println("\nEligibility Check:");
        System.out.println("Age >= 18: " + (age >= 18));
        System.out.println("Is Citizen: " + isCitizen);
        System.out.println("Can Vote (AND): " + canVote);
        
    
        
    
        System.out.println("\n Task 5: Maximum of Two Numbers ");
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();
        
        int max = (x > y) ? x : y;
        System.out.println("Maximum of " + x + " and " + y + " is: " + max);
        

        System.out.println("\n 6: Increment and Decrement Operators ");
        System.out.print("Enter a number: ");
        int value = scanner.nextInt();
        
        System.out.println("\nOriginal value: " + value);
       
        System.out.println("Post-increment (value++): " + (value++));
        System.out.println("After post-increment: " + value);

        System.out.println("Pre-increment (++value): " + (++value));
        System.out.println("After pre-increment: " + value);
        
        System.out.println("Post-decrement (value--): " + (value--));
        System.out.println("After post-decrement: " + value);
        
        System.out.println("Pre-decrement (--value): " + (--value));
        System.out.println("After pre-decrement: " + value);
        
        
        System.out.println("\n 7: Complex Expression ");
        System.out.print("Enter value for p: ");
        int p = scanner.nextInt();
        System.out.print("Enter value for q: ");
        int q = scanner.nextInt();
        System.out.print("Enter value for r: ");
        int r = scanner.nextInt();
        
        
        int complexResult = (p + q) * r - p / q + r % p;
        
        System.out.println("\nExpression: (p + q) * r - p / q + r % p");
        System.out.println("Step by step:");
        System.out.println("(p + q) = (" + p + " + " + q + ") = " + (p + q));
        System.out.println("(p + q) * r = " + (p + q) + " * " + r + " = " + ((p + q) * r));
        System.out.println("p / q = " + p + " / " + q + " = " + (p / q));
        System.out.println("r % p = " + r + " % " + p + " = " + (r % p));
        System.out.println("Final Result: " + complexResult);
        
        
        
        System.out.println("\n 8: Leap Year Check ");
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
    
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        System.out.println("\nLeap Year Analysis:");
        System.out.println("Divisible by 4: " + (year % 4 == 0));
        System.out.println("Divisible by 100: " + (year % 100 == 0));
        System.out.println("Divisible by 400: " + (year % 400 == 0));
        System.out.println(year + " is " + (isLeapYear ? "a LEAP year" : "NOT a leap year"));
        
        
        
        System.out.println("\n 9: Operator Precedence ");
        System.out.print("Enter value for m: ");
        int m = scanner.nextInt();
        System.out.print("Enter value for n: ");
        int n = scanner.nextInt();
        
        // Demonstrating precedence: multiplication before addition
        int precedenceResult1 = m + n * 2;
        int precedenceResult2 = (m + n) * 2;
        
        System.out.println("\nPrecedence Demonstration:");
        System.out.println("Expression 1: m + n * 2");
        System.out.println("Result: " + m + " + " + n + " * 2 = " + precedenceResult1);
        System.out.println("(Multiplication happens first)");
        
        System.out.println("\nExpression 2: (m + n) * 2");
        System.out.println("Result: (" + m + " + " + n + ") * 2 = " + precedenceResult2);
        System.out.println("(Parentheses override precedence)");
        

    
        System.out.println("\n 10: Assignment Operators ");
        System.out.print("Enter initial value: ");
        int val = scanner.nextInt();
        System.out.print("Enter operand value: ");
        int operand = scanner.nextInt();
        
        int temp = val;
        System.out.println("\nInitial value: " + temp);
        
        // Addition assignment
        temp += operand;
        System.out.println("After += " + operand + ": " + temp);
        
        // Subtraction assignment
        temp -= operand;
        System.out.println("After -= " + operand + ": " + temp);
        
        // Multiplication assignment
        temp *= operand;
        System.out.println("After *= " + operand + ": " + temp);
        
        // Division assignment
        temp /= operand;
        System.out.println("After /= " + operand + ": " + temp);
        
        // Modulus assignment
        temp %= operand;
        System.out.println("After %= " + operand + ": " + temp);
        
        // All operators in one demonstration
        System.out.println("\nAll Assignment Operators Summary:");
        int demo = val;
        System.out.println("Starting value: " + demo);
        demo += 5;
        System.out.println("demo += 5: " + demo);
        demo -= 2;
        System.out.println("demo -= 2: " + demo);
        demo *= 3;
        System.out.println("demo *= 3: " + demo);
        demo /= 4;
        System.out.println("demo /= 4: " + demo);
        demo %= 5;
        System.out.println("demo %= 5: " + demo);
        

        
        scanner.close();
    }
}