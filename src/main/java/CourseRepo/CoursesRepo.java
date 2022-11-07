package CourseRepo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import Course.Courses;


public interface CoursesRepo extends CrudRepository<Courses, Long>{

	public List<Courses> findAll();
}
