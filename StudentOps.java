//StudentOps.java
import java.util.* ; 

class StudentOps{
	ArrayList<Student> students;
    //Create a constructor for StudentOps
    public StudentOps(){
        this.students = new ArrayList<>();
    }
    //Create addStudent method
	public void addStudents(Student student){
        students.add(student);
        System.out.println("Student Added Successfully");
    }
    //Create a dispay method
	public void displayStudents(){
        for (Student student : students){
            student.display();
        }
    }
}
