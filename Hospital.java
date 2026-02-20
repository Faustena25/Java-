// Abstract class
abstract class MedicalTest {
    protected String patientName;
    protected String testDate;
    
    public MedicalTest(String patientName, String testDate) {
        this.patientName = patientName;
        this.testDate = testDate;
    }
    
    // Abstract method - each test conducts differently
    abstract void conductTest();
    
    // Abstract method - each test has different results
    abstract void generateReport();
    
    // Concrete method - common for all tests
    public void scheduleTest() {
        System.out.println("Test scheduled for " + patientName + " on " + testDate);
    }
}

// Blood Test
class BloodTest extends MedicalTest {
    public BloodTest(String patientName, String testDate) {
        super(patientName, testDate);
    }
    
    @Override
    void conductTest() {
        System.out.println("Drawing blood sample from " + patientName);
    }
    
    @Override
    void generateReport() {
        System.out.println("Blood Test Report: Hemoglobin, WBC, Platelets levels");
    }
}

// X-Ray Test
class XRayTest extends MedicalTest {
    public XRayTest(String patientName, String testDate) {
        super(patientName, testDate);
    }
    
    @Override
    void conductTest() {
        System.out.println("Taking X-ray scan of " + patientName);
    }
    
    @Override
    void generateReport() {
        System.out.println("X-Ray Report: Bone structure and fracture analysis");
    }
}

// Usage
public class Hospital {
    public static void main(String[] args) {
        MedicalTest bloodTest = new BloodTest("John Doe", "2026-02-05");
        MedicalTest xrayTest = new XRayTest("Jane Smith", "2026-02-06");
        
        bloodTest.scheduleTest();
        bloodTest.conductTest();
        bloodTest.generateReport();
        
        System.out.println();
        
        xrayTest.scheduleTest();
        xrayTest.conductTest();
        xrayTest.generateReport();
    }
}
