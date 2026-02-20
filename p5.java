class Student3 {
    String name;
    int age;
    
    void checkEligibility() {
        System.out.println("Name: " + name);
        if(age >= 18) {
            System.out.println("Eligible for admission");
        } else {
            System.out.println("Not eligible");
        }
        System.out.println();
    }
}

public class p5 {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        s1.name = "Tom";
        s1.age = 17;
        
        Student3 s2 = new Student3();
        s2.name = "Jerry";
        s2.age = 19;
        
        s1.checkEligibility();
        s2.checkEligibility();
    }
}

