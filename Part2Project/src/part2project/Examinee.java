
package part2project;

public class Examinee extends Accounts {
    public String course;
    public int year;
    public int accountnum;
    
    Examinee(String course, int year, int accoutnum, String name, int id, String username, String password){
        this.course = course;
        this.year = year;
        this.accountnum = accountnum;
        this.name = name;
        this.id = id;
        this.username = username;
        this.password = password;
    }

    
    public void update(){
        
    }
}
