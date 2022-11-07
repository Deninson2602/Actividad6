package Course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
    private String title;
    
    public Courses() {
    	
    }
    
    public Courses(String title) {
    	super();
    	this.title = title;
    }
    public String getTitle() {
    	return title;
    }
    public String setTitle() {
    	return title;
    }
}