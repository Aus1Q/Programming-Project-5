package School;
import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private String courseName;
    ArrayList<Student> studentList = new ArrayList<>();
    
    
    public Course(String courseName){
        this.courseName = courseName;
        studentList = new ArrayList<>();
    }
    
    public void addStudent(Student stud){
        System.out.println(stud.getName() + " has been added to " + courseName);
        studentList.add(stud);
    }
    
    public double average(){
        double total = 0;
        for(Student studentList : studentList){
            total+=studentList.getAverageTestScores();
        }
        return total/studentList.size();
    }
    
    public void roll(){
        System.out.println("Course: " + this.courseName);
        System.out.println("Students: ");
        
        for(Student studentList : this.studentList){
            System.out.println(studentList);
        }
    }
    public String getCourseName() {
        return courseName;
    }

    
   
   }
