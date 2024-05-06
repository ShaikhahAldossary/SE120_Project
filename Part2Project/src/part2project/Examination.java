
package part2project;

public class Examination {
    protected int id;
    public String details;
    public String date;
    Subject subjects;
    Requirements requirment;
    
    Examination(int id, String details, String date, Subject subjects, Requirements requirment){
        this.subjects = subjects;
        this.requirment = requirment;
        this.id = id;
        this.details = details;
        this.date = date;
        
        
    }
    
    public void calculateScore(){
        
    }
}
