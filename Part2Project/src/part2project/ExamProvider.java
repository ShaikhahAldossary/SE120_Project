
package part2project;
import java.util.*;

public class ExamProvider extends Accounts {
    public String credentials;
    public List<Subject> subjects;
    
    ExamProvider(int id, String name, String username, String password, String credentials){
       this.id = id;
       
       this.subjects = new ArrayList<>(3);
       
    }
    
//    public void addSubject(Subject subject) {
//        if (subjects.size() < 3) {
//          subjects.add(subject);
//        } else {
//          System.out.println("Exam provider has reached max number of subjects.");
//        }
//    }
    
    public void verify(){
        
    }
    
    public void update(String credentials){
        this.credentials = credentials;
        System.out.println("Credentials Updated Successfully.");
    }
}
