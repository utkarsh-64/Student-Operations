# Student Operations
064-URL

This is a simple **Student operations program** implemented in Java. It allows you to add, update, display, and remove student records. The system uses an array list to store student data and allows operations like updating student information, deleting a student, and displaying all stored students.

## Features

- **Add Student**: Add a new student by providing their details such as name, PRN, GPA, batch, and branch.
- **Display Students**: View the list of all students with their details.
- **Update Student**: Modify a student's details using their PRN. If the student is not found, a new student is added.
- **Remove Student**: Remove a student from the system using their PRN.
- **Exit**: Exit the system.

## Classes and Methods

### 1. `Student` Class
This class represents a student with attributes like name, PRN, GPA, batch, and branch.

- **Attributes**:
  - `name`: Name of the student (String)
  - `prn`: PRN (Permanent Registration Number) of the student (long)
  - `gpa`: Grade Point Average (double)
  - `batch`: Batch of the student (String)
  - `branch`: Branch of the student (String)
  
- **Methods**:
  - `getName()`, `setName(String name)`: Get and set the student's name.
  - `getPrn()`, `setPrn(long prn)`: Get and set the student's PRN.
  - `getGpa()`, `setGpa(double gpa)`: Get and set the student's GPA.
  - `getBatch()`, `setBatch(String batch)`: Get and set the student's batch.
  - `getBranch()`, `setBranch(String branch)`: Get and set the student's branch.
  - `display()`: Displays the details of the student.

### 2. `StudentOps` Class
This class provides methods for managing a collection of students, including adding, displaying, updating, and removing students.

- **Methods**:
  - `addStudents(Student student)`: Adds a new student to the list.
  - `displayStudents()`: Displays all students in the list.
  - `removeStudent(long prn)`: Removes a student based on their PRN.
  - `updateStudent(long prn, String name, double gpa, String batch, String branch)`: Updates a student's details based on their PRN.
  - `getStudents()`: Returns the list of students.

### 3. `Main` Class
This class contains the main entry point of the application. It provides a menu-driven interface for the user to interact with the student management system.

- **Features**:
  - Prompts the user to choose an option from the menu.
  - Allows the user to add, update, display, and remove students.
  - Handles input and output using the `Scanner` class for user interaction.

## How to Use

1. **Compile and Run**
   - Compile the `Main.java` file and execute it.
   
2. **Provide Input**
   - Enter the choice.
   - Input the details when prompted.
   
4. **View Results**
   - See the output.

## Requirements
- Java Development Kit (JDK) installed
- Any Java-supported IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)
