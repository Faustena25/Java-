import java.util.Scanner;
import java.util.ArrayList;

// ========== EXERCISE 3: Interface (Polymorphism) ==========
interface Enrollment {
    void enrollCourse(String courseName);
    void displayEnrollment();
}

// ========== EXERCISE 1 & 4: Class with Encapsulation ==========
class Person {
    // Exercise 4: Private variables (Encapsulation)
    private String id;
    private String name;
    private int age;
    private String email;
    
    // Constructor
    Person(String id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
    // Exercise 4: Getter methods
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getEmail() {
        return email;
    }
    
    // Exercise 4: Setter methods with validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    
    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        }
    }
    
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }
    
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}

// ========== EXERCISE 2: Inheritance with Constructor ==========
class Student extends Person implements Enrollment {
    private String studentId;
    private String department;
    private double gpa;
    private ArrayList<String> courses;
    
    // Exercise 2: Child constructor calling parent constructor
    Student(String id, String name, int age, String email, String studentId, String department) {
        super(id, name, age, email);  // Call parent constructor
        this.studentId = studentId;
        this.department = department;
        this.gpa = 0.0;
        this.courses = new ArrayList<>();
        System.out.println("Student object created successfully!");
    }
    
    // Getter and Setter
    public String getStudentId() {
        return studentId;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }
    
    // Exercise 3: Interface implementation (Polymorphism)
    public void enrollCourse(String courseName) {
        if (!courses.contains(courseName)) {
            courses.add(courseName);
            System.out.println(getName() + " enrolled in: " + courseName);
        } else {
            System.out.println("Already enrolled in this course!");
        }
    }
    
    public void displayEnrollment() {
        System.out.println("\nEnrolled Courses for " + getName() + ":");
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled yet.");
        } else {
            for (int i = 0; i < courses.size(); i++) {
                System.out.println((i + 1) + ". " + courses.get(i));
            }
        }
    }
    
    // Exercise 2: Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("\n--- Student Information ---");
        super.displayInfo();  // Call parent method
        System.out.println("Student ID: " + studentId);
        System.out.println("Department: " + department);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.println("Total Courses: " + courses.size());
    }
}

// ========== EXERCISE 2: Another Child Class (Inheritance) ==========
class Teacher extends Person implements Enrollment {
    private String employeeId;
    private String specialization;
    private double salary;
    private ArrayList<String> teachingCourses;
    
    // Constructor with super
    Teacher(String id, String name, int age, String email, String employeeId, String specialization, double salary) {
        super(id, name, age, email);
        this.employeeId = employeeId;
        this.specialization = specialization;
        this.salary = salary;
        this.teachingCourses = new ArrayList<>();
        System.out.println("Teacher object created successfully!");
    }
    
    public String getEmployeeId() {
        return employeeId;
    }
    
    public String getSpecialization() {
        return specialization;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
    
    // Interface implementation
    public void enrollCourse(String courseName) {
        if (!teachingCourses.contains(courseName)) {
            teachingCourses.add(courseName);
            System.out.println(getName() + " assigned to teach: " + courseName);
        } else {
            System.out.println("Already teaching this course!");
        }
    }
    
    public void displayEnrollment() {
        System.out.println("\nTeaching Courses for " + getName() + ":");
        if (teachingCourses.isEmpty()) {
            System.out.println("No courses assigned yet.");
        } else {
            for (int i = 0; i < teachingCourses.size(); i++) {
                System.out.println((i + 1) + ". " + teachingCourses.get(i));
            }
        }
    }
    
    // Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("\n--- Teacher Information ---");
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Specialization: " + specialization);
        System.out.printf("Salary: $%.2f\n", salary);
        System.out.println("Total Courses Teaching: " + teachingCourses.size());
    }
}

// ========== EXERCISE 1: Simple Class for Course ==========
class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private String instructor;
    
    Course(String courseCode, String courseName, int credits, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public String getInstructor() {
        return instructor;
    }
    
    public void displayCourse() {
        System.out.println("\n--- Course Details ---");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
        System.out.println("Instructor: " + instructor);
    }
}

// ========== EXERCISE 5: Mini-Project Main Class ==========
public class unitfour {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   EDUCATION MANAGEMENT SYSTEM (EMS)        ║");
        System.out.println("║   All 5 OOP Concepts Implemented          ║");
        System.out.println("╚════════════════════════════════════════════╝\n");
        
        boolean exit = false;
        while (!exit) {
            displayMainMenu();
            
            // Input validation
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("✗ Invalid input! Please enter a number.");
                continue;
            }
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    addCourse();
                    break;
                case 4:
                    enrollStudentInCourse();
                    break;
                case 5:
                    assignTeacherToCourse();
                    break;
                case 6:
                    updateStudentGPA();
                    break;
                case 7:
                    displayAllStudents();
                    break;
                case 8:
                    displayAllTeachers();
                    break;
                case 9:
                    displayAllCourses();
                    break;
                case 10:
                    searchStudent();
                    break;
                case 11:
                    demonstratePolymorphism();
                    break;
                case 12:
                    exit = true;
                    System.out.println("\n✓ Thank you for using Education Management System!");
                    System.out.println("✓ All OOP concepts demonstrated successfully!");
                    break;
                default:
                    System.out.println("✗ Invalid option! Please try again.");
            }
        }
        
        sc.close();
    }
    
    static void displayMainMenu() {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║            MAIN MENU                       ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║ 1.  Add Student                            ║");
        System.out.println("║ 2.  Add Teacher                            ║");
        System.out.println("║ 3.  Add Course                             ║");
        System.out.println("║ 4.  Enroll Student in Course               ║");
        System.out.println("║ 5.  Assign Teacher to Course               ║");
        System.out.println("║ 6.  Update Student GPA                     ║");
        System.out.println("║ 7.  Display All Students                   ║");
        System.out.println("║ 8.  Display All Teachers                   ║");
        System.out.println("║ 9.  Display All Courses                    ║");
        System.out.println("║ 10. Search Student by ID                   ║");
        System.out.println("║ 11. Demonstrate Polymorphism               ║");
        System.out.println("║ 12. Exit                                   ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.print("Enter your choice: ");
    }
    
    // Exercise 1: Creating objects - FIXED INPUT HANDLING
    static void addStudent() {
        System.out.println("\n--- Add New Student ---");
        
        System.out.print("Enter Person ID: ");
        String id = sc.nextLine().trim();
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();
        
        System.out.print("Enter Age: ");
        int age = 0;
        try {
            age = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("✗ Invalid age! Student not added.");
            return;
        }
        
        System.out.print("Enter Email: ");
        String email = sc.nextLine().trim();
        
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine().trim();
        
        System.out.print("Enter Department: ");
        String department = sc.nextLine().trim();
        
        Student student = new Student(id, name, age, email, studentId, department);
        students.add(student);
        System.out.println("✓ Student added successfully!");
    }
    
    static void addTeacher() {
        System.out.println("\n--- Add New Teacher ---");
        
        System.out.print("Enter Person ID: ");
        String id = sc.nextLine().trim();
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();
        
        System.out.print("Enter Age: ");
        int age = 0;
        try {
            age = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("✗ Invalid age! Teacher not added.");
            return;
        }
        
        System.out.print("Enter Email: ");
        String email = sc.nextLine().trim();
        
        System.out.print("Enter Employee ID: ");
        String employeeId = sc.nextLine().trim();
        
        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine().trim();
        
        System.out.print("Enter Salary: ");
        double salary = 0;
        try {
            salary = Double.parseDouble(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("✗ Invalid salary! Teacher not added.");
            return;
        }
        
        Teacher teacher = new Teacher(id, name, age, email, employeeId, specialization, salary);
        teachers.add(teacher);
        System.out.println("✓ Teacher added successfully!");
    }
    
    static void addCourse() {
        System.out.println("\n--- Add New Course ---");
        
        System.out.print("Enter Course Code: ");
        String courseCode = sc.nextLine().trim();
        
        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine().trim();
        
        System.out.print("Enter Credits: ");
        int credits = 0;
        try {
            credits = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("✗ Invalid credits! Course not added.");
            return;
        }
        
        System.out.print("Enter Instructor Name: ");
        String instructor = sc.nextLine().trim();
        
        Course course = new Course(courseCode, courseName, credits, instructor);
        courses.add(course);
        System.out.println("✓ Course added successfully!");
    }
    
    // Exercise 3: Using interface methods
    static void enrollStudentInCourse() {
        if (students.isEmpty()) {
            System.out.println("✗ No students available!");
            return;
        }
        
        System.out.println("\n--- Enroll Student in Course ---");
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine().trim();
        
        Student foundStudent = null;
        for (Student s : students) {
            if (s.getStudentId().equals(studentId)) {
                foundStudent = s;
                break;
            }
        }
        
        if (foundStudent == null) {
            System.out.println("✗ Student not found!");
            return;
        }
        
        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine().trim();
        foundStudent.enrollCourse(courseName);  // Interface method
    }
    
    static void assignTeacherToCourse() {
        if (teachers.isEmpty()) {
            System.out.println("✗ No teachers available!");
            return;
        }
        
        System.out.println("\n--- Assign Teacher to Course ---");
        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine().trim();
        
        Teacher foundTeacher = null;
        for (Teacher t : teachers) {
            if (t.getEmployeeId().equals(empId)) {
                foundTeacher = t;
                break;
            }
        }
        
        if (foundTeacher == null) {
            System.out.println("✗ Teacher not found!");
            return;
        }
        
        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine().trim();
        foundTeacher.enrollCourse(courseName);  // Interface method
    }
    
    // Exercise 4: Using setter methods (Encapsulation)
    static void updateStudentGPA() {
        if (students.isEmpty()) {
            System.out.println("✗ No students available!");
            return;
        }
        
        System.out.println("\n--- Update Student GPA ---");
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine().trim();
        
        for (Student s : students) {
            if (s.getStudentId().equals(studentId)) {
                System.out.print("Enter new GPA (0.0 - 4.0): ");
                double gpa = 0;
                try {
                    gpa = Double.parseDouble(sc.nextLine().trim());
                    s.setGpa(gpa);  // Setter method with validation
                    System.out.println("✓ GPA updated successfully to: " + s.getGpa());
                } catch (NumberFormatException e) {
                    System.out.println("✗ Invalid GPA format!");
                }
                return;
            }
        }
        System.out.println("✗ Student not found!");
    }
    
    // Exercise 2: Method overriding demonstration
    static void displayAllStudents() {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║         ALL STUDENTS                       ║");
        System.out.println("╚════════════════════════════════════════════╝");
        
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        
        for (Student s : students) {
            s.displayInfo();  // Overridden method
            s.displayEnrollment();
            System.out.println("─────────────────────────────────────────────");
        }
    }
    
    static void displayAllTeachers() {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║         ALL TEACHERS                       ║");
        System.out.println("╚════════════════════════════════════════════╝");
        
        if (teachers.isEmpty()) {
            System.out.println("No teachers in the system.");
            return;
        }
        
        for (Teacher t : teachers) {
            t.displayInfo();  // Overridden method
            t.displayEnrollment();
            System.out.println("─────────────────────────────────────────────");
        }
    }
    
    static void displayAllCourses() {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║         ALL COURSES                        ║");
        System.out.println("╚════════════════════════════════════════════╝");
        
        if (courses.isEmpty()) {
            System.out.println("No courses in the system.");
            return;
        }
        
        for (Course c : courses) {
            c.displayCourse();
            System.out.println("─────────────────────────────────────────────");
        }
    }
    
    // Exercise 4: Using getter methods
    static void searchStudent() {
        System.out.println("\n--- Search Student ---");
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine().trim();
        
        for (Student s : students) {
            if (s.getStudentId().equals(studentId)) {  // Using getter
                s.displayInfo();
                s.displayEnrollment();
                return;
            }
        }
        System.out.println("✗ Student not found!");
    }
    
    // Exercise 3: Polymorphism demonstration
    static void demonstratePolymorphism() {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║     POLYMORPHISM DEMONSTRATION             ║");
        System.out.println("╚════════════════════════════════════════════╝");
        
        if (students.isEmpty() && teachers.isEmpty()) {
            System.out.println("✗ Add students and teachers first!");
            return;
        }
        
        // Polymorphism: Same interface, different implementations
        ArrayList<Enrollment> enrollments = new ArrayList<>();
        
        // Adding students and teachers to same list
        for (Student s : students) {
            enrollments.add(s);
        }
        for (Teacher t : teachers) {
            enrollments.add(t);
        }
        
        System.out.println("\nDisplaying all enrollments (Students & Teachers):");
        System.out.println("This demonstrates POLYMORPHISM - same method, different behavior\n");
        
        for (Enrollment e : enrollments) {
            e.displayEnrollment();  // Same method call, different behavior
            System.out.println("─────────────────────────────────────────────");
        }
    }
}