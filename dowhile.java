import java.util.Scanner;
public class dowhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        int entpin;
        do {
            System.out.println("Enter your pin:");
            entpin = sc.nextInt();

        } while (entpin != pin);
        System.out.println("Pin is correct!");
    }
}