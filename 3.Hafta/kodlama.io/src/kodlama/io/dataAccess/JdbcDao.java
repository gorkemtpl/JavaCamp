package kodlama.io.dataAccess;

import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

public class JdbcDao implements CategoryDao, CourseDao, InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added with JDBC database : " + instructor.getName());
		
	}

	@Override
	public void add(Course course) {
		System.out.println("Course added with JDBC database : " + course.getName());
		
	}

	@Override
	public void add(Category category) {
		System.out.println("Category added with JDBC database : " + category.getName());
		
	}

}
