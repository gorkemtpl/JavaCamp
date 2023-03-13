package kodlama.io.business;

import kodlama.io.coreLogger.Logger;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	
	public void add (Course course) throws Exception {
		Course[] courses = {new Course("Java Camp", 01, 75, "Engin Demiroð", 150), new Course("C# ANGULAR", 02, 55, "Engin Demiroð", 100),
				new Course("Java + REACT", 03, 43, "Engin Demiroð", 800)};
		
		for (Course kurs : courses) {
			if (kurs.getName() == course.getName()) {
				throw new Exception("This course is already attached : ");
			}
			else if (course.getPrice() < 0) {
				throw new Exception("The course price cannot be less than zero.");
			}
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
