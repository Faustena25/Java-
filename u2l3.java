import java.util.Scanner;

public class  u2l3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        

        System.out.println("\nPattern 1: Triangle");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.println("Pattern 2: Reverse Triangle");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        

        System.out.println("Pattern 3: Number Pattern");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}