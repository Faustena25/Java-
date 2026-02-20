import java.util.Scanner;

public class P1a {

    static int globalVar = 100; // Global variable
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        
        
        System.out.println(" 1. Variable Declaration ");
        int x = 25;
        double y = 55000.50;
        char z = 'A';
        boolean w = true;
        String v = "Tina";
        
        System.out.println("int: " + x);
        System.out.println("double: " + y);
        System.out.println("char: " + z);
        System.out.println("boolean: " + w);
        System.out.println("String: " + v);
        
        
        System.out.println("\n 2: Swaping ");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        a = a + b;  
        b = a - b;  
        a = a - b;  
        
        System.out.println("After swap: a = " + a + ", b = " + b);
        
        
        System.out.println("\n 3. Personal Information ");
        System.out.print("Enter your age: ");
        int Age = sc.nextInt();
        
        System.out.print("Enter your height (in feet): ");
        double Height = sc.nextDouble();
        
        sc.nextLine(); 
        System.out.print("Enter your name: ");
        String Name = sc.nextLine();
        
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age + " years");
        System.out.println("Height: " + Height + " feet");
        
        
        System.out.println("\n 4. Rectangle Area ");
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        
        double area = length * width;
        
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        
        
        System.out.println("\n 5: Multiple Variable Declaration ");
        int m = 5, n = 10, o = 15;
        double p = 1.1, q = 2.2, r = 3.3;
        
        System.out.println("m = " + m + ", n = " + n + ", o = " + o);
        System.out.println("p = " + p + ", q = " + q + ", r = " + r);

        
        System.out.println("\n  6: Int vs Double ");
        int intResult = 10 / 3;
        double doubleResult = 10.0 / 3.0;
        
        System.out.println("int division (10 / 3): " + intResult);
        System.out.println("double division (10.0 / 3.0): " + doubleResult);
        
        
        System.out.println("\n   7. ASCII Value ");
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int asciiValue = ch;
        
        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + asciiValue);
    
        
        
        System.out.println("\n 8. Simple Interest ");
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter rate of interest (%): ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter time period (years): ");
        double time = sc.nextDouble();
        
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("\nCalculation Results:");
        System.out.println("Principal: $" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: $" + simpleInterest);
        System.out.println("Total Amount: $" + (principal + simpleInterest));
        
        
        
        System.out.println("\n 9: Final Variable ");
        final double PI = 3.14159;
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double circleArea = PI * radius * radius;
        
        System.out.println("PI (constant): " + PI);
        System.out.println("Radius: " + radius);
        System.out.println("Circle Area: " + circleArea);


        System.out.println("\n 10: Variable Scope ");
        int localVar = 50;  // Local variable
        
        System.out.println("Global variable: " + globalVar);
        System.out.println("Local variable: " + localVar);
        
      

        sc.close();

    }
    
}
