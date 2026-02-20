class Department {
    String deptName;
}

class Student2 {
    String name;
    Department dept;
    
    void display() {
        System.out.println("Student: " + name);
        System.out.println("Department: " + dept.deptName);
        System.out.println();
    }
}

public class p4 {
    public static void main(String[] args) {
        Department d1 = new Department();
        d1.deptName = "CSE";
        
        Department d2 = new Department();
        d2.deptName = "ECE";
        
        Student2 s1 = new Student2();
        s1.name = "John";
        s1.dept = d1;
        
        Student2 s2 = new Student2();
        s2.name = "Mary";
        s2.dept = d2;
        
        s1.display();
        s2.display();
    }
}