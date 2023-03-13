package kodlama.io.dataAccess;

import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

public class HibernateDao implements CategoryDao, CourseDao, InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added with Hibernate database : " + instructor.getName());
		
	}

	@Override
	public void add(Course course) {
		System.out.println("Course added with Hibernate database : " + course.getName());
		
	}

	@Override
	public void add(Category category) {
		System.out.println("Category added with Hibernate database : " + category.getName());
		
	}
	
}
