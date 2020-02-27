package pratice;
//asdfg

import java.util.Arrays;

public class Course {
	private String id;
	private String name;
	private Student[] students;
	private int price;
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", students=" + Arrays.toString(students) + ", price=" + price
				+ "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Course(String id, String name, Student[] students, int price) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
		this.price = price;
	}
	public Course() {
		super();
	}
	

}
