package kodlama.io.entities;

public class Course {
	
	private String name;
	private int id;
	private int hour;
	private String instructor;
	private int price;
	
	
	
	public Course(String name, int id, int hour, String instructor, int price) {
		super();
		this.name = name;
		this.id = id;
		this.hour = hour;
		this.instructor = instructor;
		this.price = price;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getHour() {
		return hour;
	}



	public void setHour(int hour) {
		this.hour = hour;
	}



	public String getInstructor() {
		return instructor;
	}



	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	
	
}
