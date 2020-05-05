package question2;

import question1.LinkedList;

/* The Custom Class for Student
 * The class implements Comparable to allow for comparison of the objects
 * See below for the implementation of the compareTo method
 */
public class Student implements Comparable<Student> {
	/*The instance variables*/
	private String name;
	private int age;
	private int studentNumber;
	private LinkedList academicRecord;
	
	/*The Constructor*/
	public Student(String name, int age, int studentNumber, LinkedList academicRecord) {
		this.name = name;
		this.age = age;
		this.studentNumber = studentNumber;
		this.academicRecord = academicRecord;
	}

	/*The Getter and Setter methods*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public LinkedList getAcademicRecord() {
		return academicRecord;
	}

	public void setAcademicRecord(LinkedList academicRecord) {
		this.academicRecord = academicRecord;
	}

	
	public String toString() {
		return "Name: " + name + " Age: " + age + " StudNo: " + studentNumber + " Average: " + academicRecord.getAverage()+"";
	}
	
	
	
	
	
	//Comparison based on academicRecord's average value;
	@Override
	public int compareTo(Student other) {
		if(academicRecord.getAverage() > other.getAcademicRecord().getAverage()) {
			return 1;
		}else if(academicRecord.getAverage() < other.getAcademicRecord().getAverage()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
