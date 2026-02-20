import java.util.Scanner;

public class u2l2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char op = input.next().charAt(0);
        
        
        switch (op) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
                
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
                
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
                
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
                
            default:
                System.out.println("Error: Invalid operator!");
                System.out.println("Please use +, -, *, or /");
        }
        
        input.close();
    }
}