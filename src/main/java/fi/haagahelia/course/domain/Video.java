package fi.haagahelia.course.domain;
import java.util.Set;

import javax.persistence.*;
@Entity
public class Video {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)	
		private long videoid;
		
	    @Column(name="videoname")
		private String name; 
	     
	    @ManyToMany(mappedBy = "videos")    
	    private Set<Course> courses;  
	   

	    public Video() {
		}

		

		public Video(String name) {
			this.name = name;
		}     

	    public long getVideoid() {
			return videoid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}	
	    
	    
	    public Set<Course> getCourses() {
	        return courses;
	    }

	    public void setCourses(Set<Course> courses) {
	        this.courses= courses;
	    }	
	    
}
