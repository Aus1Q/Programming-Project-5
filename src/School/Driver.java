package School;


public class Driver {

    
    public static void main(String[] args) {
        
        
        Course cs331 = new Course("Data Structures and Algorithms");
        
        Student Austin = new Student(001212666, "Austin");
        
        
        
        Student Eli = new Student(114575874, "Eli");
        
        
        cs331.addStudent(Austin);
        cs331.addStudent(Eli);
        
        cs331.roll();
        
        System.out.println("The average for " + cs331.getCourseName() + "is: " + cs331.average());
                
        
        
        
        
        
    }
    
}
