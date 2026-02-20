class day1{
    public static void main(String[] args) {
        int a=10; 
        int b=20;

        System.out.println("The sum is: " + (a + b));       
        System.out.println("The difference is: " + (b - a));
        System.out.println("The product is: " + (a * b));       
        System.out.println("The quotient is: " + (b / a));
        System.out.println("The remainder is: " + (b % a));

        System.out.println("\n Relational Operations:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\nLogical Operations:");
        boolean x = (a > b);   
        boolean y = (a > 0);
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + !x);

    }
}