package pratice;

import java.util.Scanner;

public class DriverStudent {
	static Student[] students;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of courses");
		int noOfCourses = sc.nextInt();
		String id, name, sid, sname, gender;
		int price, age, noOfStudents;
		sc.nextLine();
		Course[] courses = new Course[noOfCourses];
		
		for (int i = 0; i < courses.length; i++) {
			System.out.println("enter details of the course");
			System.out.println("Enter the course id");
			id = sc.nextLine();
			System.out.println("enter the course name");
			name = sc.nextLine();
			System.out.println("enter the students in the course");
			System.out.println("enter the no of students");
			noOfStudents = sc.nextInt();
			sc.nextLine();
			students = new Student[noOfStudents];
			for (int j = 0; j < students.length; j++) {
				System.out.println("enter the student id");
				sid = sc.nextLine();
				System.out.println("enter the student name");
				sname = sc.nextLine();
				System.out.println("enter the student Gender");
				gender = sc.nextLine();
				System.out.println("enter the age of the student");
				age = sc.nextInt();
				sc.nextLine();
				students[j] = new Student(sid, sname, gender, age);
			}
			System.out.println("enter the price of the course");
			price = sc.nextInt();
			sc.nextLine();
			courses[i] = new Course(id, name, students, price);
		}
		for (int i = 0; i < courses.length; i++) {
			System.out.println(courses[i]);
		}
		int option;
		do {
			System.out.println("1.Find all courses price less than given value");
			System.out.println("2.Find Courses whose name start with given alphabet");
			System.out.println("3.Find all the courses whose female students count greater than given count");
			System.out.println("Enter your option");
			option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			case 1:
				System.out.println("Enter the price amount");
				int givenprice = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < courses.length; i++) {
					if (givenprice > courses[i].getPrice()) {
						System.out.println(courses[i].getName());
					}
				}
				break;
			case 2:
				System.out.println("enter the letter to find courses");
				String letter = sc.nextLine();
				for (int i = 0; i < courses.length; i++) {
					if ((courses[i].getName().charAt(0))==(letter.charAt(0))) {
						
						System.out.println(courses[i].getName());
					}
					
				}
				break;
			case 3:
				System.out.println("enter the count");
				int count1 = 0, count = sc.nextInt();
				for (int i = 0; i < courses.length; i++) {
					for (int j = 0; j < students.length; j++) {
						if (courses[i].getStudents()[j].getGender().equals("Female")) {
							count1++;
						}
					}
					if (count1> count) {
						System.out.println(courses[i].getName());
					}
					count1=0;
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid option");
				break;
			}
		} while (option != 4);

	}
}
