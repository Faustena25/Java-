import java.util.Scanner;
public class breakeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        
        for (int i = n; i <= 10; i++) {
            if (i == 5) {
                break;  // stops the loop when i equals 5
            }
            System.out.println(i);
        }

        System.out.println("Loop ended.");
    }
}