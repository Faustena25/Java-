

import java.util.Scanner;

public class u2l1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get three numbers from user
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        
        System.out.print("Enter third number: ");
        int c = input.nextInt();
        
        System.out.println("\nYou entered: " + a + ", " + b + ", " + c);
        
        // Check which number is largest
        if (a > b && a > c) {
            System.out.println("Largest is: " + a);
        } 
        else if (b > c) {
            System.out.println("Largest is: " + b);
        } 
        else {
            System.out.println("Largest is: " + c);
        }
        
        input.close();
    }
}