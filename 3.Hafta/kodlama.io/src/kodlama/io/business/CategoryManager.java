package kodlama.io.business;


import kodlama.io.coreLogger.Logger;
import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
	
		this.categoryDao = categoryDao;		
		this.loggers = loggers;
	}
	
	public void validName (Category category) throws Exception {
		Category[] categories = {new Category("Backend", 123), new Category("Web", 456), new Category("Mobile", 321)};
		for (Category ktgori : categories) {
			if (ktgori.getName() == category.getName()) {
				throw new Exception("This category has already been added.");
			}
		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
}
