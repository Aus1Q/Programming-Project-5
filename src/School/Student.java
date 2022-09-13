
package School;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    
    private int ID;
    private String name;
    private TestScore testScores;
    ArrayList<Double> grades = new ArrayList<>();
    
    public Student(int ID, String name){
        this.ID = ID;
        this.name = name;
        testScores = new TestScore(0, 0);
    }
    
    public Student(int ID, String name, int test1, int test2){
        this.ID = ID;
        this.name = name;
        testScores = new TestScore(test1, test2);
    }
    
    public void settest1(int testNum, int testScore){
        if(testNum==1){
            testScores.settest1(testScore);
        }
        else if(testNum==2){
            testScores.settest2(testScore);
        }
    }
    
 







    public String getName() {
        return name;
    }
    
    public double getAverageTestScores(){
        double total = 0;
        double average;
        for(int i = 0; i < grades.size(); i++){
            total = total + grades.get(i);
        }      
        average = total/grades.size();    
        return average;
    }


}
