
package School;
import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private String courseName;
    ArrayList<Student> studentList = new ArrayList<>();
    
    
    public Course(String courseName){
        this.courseName = courseName;
    }
    
    public void addStudent(Student stud){
        System.out.println(stud.getName() + " has been added to " + courseName);
        studentList.add(stud);
    }
    
    public void roll(){
        
    }

    public String getCourseName() {
        return courseName;
    }

    
    

}
