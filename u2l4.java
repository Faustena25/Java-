import java.util.Scanner;

public class u2l4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int original = num; 
        
        int reversed = 0;
        
       
        while (num != 0) {
            int lastDigit = num % 10;              
            reversed = reversed * 10 + lastDigit;  
            num = num / 10;                        
        }
        
        System.out.println("\nOriginal number: " + original);
        System.out.println("Reversed number: " + reversed);
        
        input.close();
    }
}