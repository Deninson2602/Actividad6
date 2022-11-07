package Course.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import Course.Courses;
import CourseRepo.CoursesRepo;

@RestController
public class CourseController {
	@Autowired
	CoursesRepo courseRep;
	
	ArrayList<Courses> courses;
	
	public void setCourseList() {
		courses = new ArrayList<>();
		courses = (ArrayList<Courses>) courseRep.findAll();
	}
	
	@GetMapping("api/courses")
	public List<Courses> getCourses(){
		setCourseList();
		return courses;
	}
	
	@GetMapping("api/alumnos/{id}")
	public Courses getCourse(@PathVariable(required = true, name = "id")int id) {
		setCourseList();
		return courses.get(id);
	}
}
