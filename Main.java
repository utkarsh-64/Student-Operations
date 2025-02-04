//Main.java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOps operations = new StudentOps();
    }

    while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Student\n2. Display Students\n3. Update Student\n4. Remove Student\n5. Exit");
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1 -> {
                    // Add new student
                    System.out.println("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.println("Enter PRN: ");
                    long prn = Long.parseLong(scan.nextLine());
                    System.out.println("Enter GPA: ");
                    double gpa = Double.parseDouble(scan.nextLine());
                    System.out.println("Enter Batch: ");
                    String batch = scan.nextLine();
                    System.out.println("Enter Branch: ");
                    String branch = scan.nextLine();
                    Student student = new Student(name, prn, gpa, batch, branch);
                    operations.addStudents(student); // Add student to the list
                }
    }
}    
