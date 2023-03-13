package kodlama.io;

import kodlama.io.business.CategoryManager;
import kodlama.io.business.CourseManager;
import kodlama.io.business.InsructorManager;
import kodlama.io.coreLogger.DatabaseLogger;
import kodlama.io.coreLogger.FileLogger;
import kodlama.io.coreLogger.Logger;
import kodlama.io.coreLogger.MailLogger;
import kodlama.io.dataAccess.HibernateDao;
import kodlama.io.dataAccess.JdbcDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;


public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};
		
		System.out.println("------------------------------------------------------------");
		
		
		Category category1 = new Category("Programlama", 1);
		CategoryManager categoryManager = new CategoryManager(new JdbcDao(), loggers);
		categoryManager.validName(category1);
		
		System.out.println("-------------------------------------------------------------");
		
		Course course1 = new Course("C++ Camp", 01, 75, "Engin Demiroð", 150);
		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
		courseManager.add(course1);
		
		System.out.println("-------------------------------------------------------------");
		
		Instructor instructor = new Instructor("Haluk Sayýn", 54);
		InsructorManager insructorManager = new InsructorManager(new JdbcDao(), loggers);
		insructorManager.add(instructor);
		
		
		System.out.println("-------------------------------------------------------------");
	}

}
