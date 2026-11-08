/*
 * Author:Muhammad Rizki
 * Project: Student Information System
 */
public class StudentInformationSystem {

    public static void main(String[] args) {
        
        String studentName = "Muhammad Rizki";
        String studentId = "S12345";
        
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        
        
        double mark1 = 80.0;
        double mark2 = 90.0;
        
        
        double totalMark = mark1 + mark2;
        
        
        System.out.println("Total Mark: " + totalMark);
        
        
        if (totalMark >= 160) {
            System.out.println("Result: Excellent");
        } else if (totalMark >= 120) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
}
