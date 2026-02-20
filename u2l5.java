import java.util.Scanner;

public class u2l5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        boolean isPrime = true;
        
        if (num <= 1) {
            isPrime = false; 
        } else if (num == 2) {
            isPrime = true;  
        } else {
           
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false; 
                    System.out.println(num + " is divisible by " + i);
                    break;
                }
            }
        }
        
        System.out.println();
        if (isPrime) {
            System.out.println(num + " is a PRIME number");
        } else {
            System.out.println(num + " is NOT a prime number");
        }
        
        input.close();
    }
}