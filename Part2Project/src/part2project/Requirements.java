
package part2project;
import java.util.*;

public class Requirements {
    protected int id;
    public String details;
    public String requirments;
    public String date;
    public List<Examinee> examinee;
    
    Requirements(int id, String details, String requirments, String date){
        this.examinee = new ArrayList<>();
        this.id = id;
        this.details = details;
        this.requirments = requirments;
        this.date = date;
        
    }

    public void verify(){
        
    }
    
    public void update(){
        
    }
}
