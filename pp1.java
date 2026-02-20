import java.util.Scanner;
public class pp1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int nu1 = sc.nextInt();
        System.out.println("Enter another number :");
        int nu2 = sc.nextInt();
        System.out.println("Enter 1 more number :");
        int nu3 = sc.nextInt();

        System.out.println("Enter 1 to perform addition, 2 to perform subtraction, 3 to perform multiplication, 4 to perform division :");
        int choice = sc.nextInt();

        int result = 0;
        switch(choice) {
            case 1:
                result = nu1 + nu2 + nu3;
                break;
            case 2:
                result = nu1 - nu2 - nu3;
                break;
            case 3:
                result = nu1 * nu2 * nu3;
                break;
            case 4:
                if (nu2 != 0 && nu3 != 0) {
                    result = nu1 / nu2 / nu3;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
        System.out.println("The result is : " + result);


       
        sc.close();
    }
}