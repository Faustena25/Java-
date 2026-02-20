import java.util.Scanner;
public class tinaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to print 'Hello, World!':");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Hello, World!");
        }
        
        sc.close();
    }
}