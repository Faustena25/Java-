class day3 {
    static int a = 10;  // Static variable - must be at class level
    final int d = 50;   // Final instance variable - must be at class level
    public static void main(String[] args) {
        final int b = 20;  // Final local variable
        int c = 30;        // Regular local variable
        
        a = a + 5;  // Valid: 'a' is static and can be modified
        System.out.println("Static variable a after modification: " + a);
        System.out.println("Final variable b remains unchanged: " + b);
        c = a + c;
        System.out.println("Local variable c dies in the local scope: " + c);
        // d = 60; // Invalid: 'd' is final and cannot be reassigned
        System.out.println("Final instance variable d remains unchanged: " + new day3().d);
    }
}