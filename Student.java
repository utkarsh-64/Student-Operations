//Student.java
class Student{
    //Setting private fields for Name, PRN, GPA, Batch, Branch
    private String name;
    private long prn;
    private double gpa;
    private String batch;
    private String branch;

    //Create a Student class constructor
    public Student(String name, long prn, double gpa, String batch, String branch) {
        this.name = name;
        this.prn = prn;
        this.gpa = gpa;
        this.branch = branch;
        this.batch = batch;
    }
}
