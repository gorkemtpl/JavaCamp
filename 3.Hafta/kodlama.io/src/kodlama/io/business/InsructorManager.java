package kodlama.io.business;

import kodlama.io.coreLogger.Logger;
import kodlama.io.dataAccess.InstructorDao;
import kodlama.io.entities.Instructor;

public class InsructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	
	public InsructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	public void add (Instructor instructor) throws Exception{
		Instructor[] instructors = {new Instructor("Engin Demiroð", 10), new Instructor("Murat Yiðit", 11), new Instructor("Esma Gül", 12)};
		for (Instructor egitmen : instructors) {
			if (egitmen.getName() == instructor.getName()) {
				throw new Exception("This trainer is already attached.");
			}
			if (egitmen.getId() == instructor.getId()) {
				throw new Exception("There is a trainer for this id.");
			}
		}
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
	
}
