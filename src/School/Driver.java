package School;


/**
 *
 * @author sande
 */
public class Driver {

    
    public static void main(String[] args) {
        
        
        Course cs331 = new Course("Data Structures and Algorithms");
        
        Student Austin = new Student(001212666, "Austin");
        Austin.setTestScore(1,87);
        Austin.setTestScore(2,92);
        
        
        
        Student Eli = new Student(114575874, "Eli");
        Eli.setTestScore(1,84);
        Eli.setTestScore(2,89);
        
        cs331.addStudent(Austin);
        cs331.addStudent(Eli);
        
        cs331.roll();
        
        System.out.println("The average for " + cs331.getCourseName() + "is: " + cs331.average());
                
        
        
        
        
        
    }
    
}
