// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Student Management System ---");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        Student student = new Student(name, roll, marks);

        System.out.println("\n--- Student Details ---");
        student.displayInfo();
        System.out.println("Grade: " + StudentUtils.grade(marks));

        sc.close();
    }
}
