//Main.java
//Name: Utkarsh Lakhani
//PRN: 23070126064
//Batch: AIML A-3

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOps operations = new StudentOps();
        
    //Implement switch case using do while loop to do CRUD operations on student data
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

                case 2 -> operations.displayStudents(); // Display all students

                case 3 -> {
                    // Update student or add if not found
                    System.out.println("\nEnter PRN to update: ");
                    long prnToUpdate = Long.parseLong(scan.nextLine());
                    boolean studentFound = false;

                    for (Student student : operations.getStudents()) {
                        if (student.getPrn() == prnToUpdate) { // If student found
                            studentFound = true;
                            System.out.println("\nStudent found. Enter new details:");
                            System.out.println("Enter new Name: ");
                            String name = scan.nextLine();
                            System.out.println("Enter new GPA: ");
                            double gpa = Double.parseDouble(scan.nextLine());
                            System.out.println("Enter new Batch: ");
                            String batch = scan.nextLine();
                            System.out.println("Enter new Branch: ");
                            String branch = scan.nextLine();
                            
                            operations.updateStudent(prnToUpdate, name, gpa, batch, branch); // Update student details
                            break;
                        }
                    }
                    
                    if (!studentFound) {
                        // If student is not found, add a new one
                        System.out.println("\nStudent with PRN " + prnToUpdate + " not found. Adding new student...");
                        System.out.println("Enter Name: ");
                        String name = scan.nextLine();
                        System.out.println("Enter GPA: ");
                        double gpa = Double.parseDouble(scan.nextLine());
                        System.out.println("Enter Batch: ");
                        String batch = scan.nextLine();
                        System.out.println("Enter Branch: ");
                        String branch = scan.nextLine();
                        Student student = new Student(name, prnToUpdate, gpa, batch, branch);
                        operations.addStudents(student); // Add new student
                    }
                }

                case 4 -> {
                    // Remove student by PRN
                    System.out.println("\nEnter PRN of the student to remove: ");
                    long prnToRemove = Long.parseLong(scan.nextLine());
                    operations.removeStudent(prnToRemove); // Remove student from the list
                }

                case 5 -> {
                    // Exit the program
                    System.out.println("\nExiting...");
                    return;
                }
                default -> System.out.println("\nInvalid choice! Try again.");  
            }
        }
    }
}    
