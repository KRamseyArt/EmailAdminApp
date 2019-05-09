package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
				
		//1) Ask how many new students we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
			//create an array of student objects based on the input size
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];		
		
		//2) Create n number of new students
		for (int n = 0; n< numOfStudents; n++) {
			students[n] = new Student();
			//Student stu = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		for (int n = 0; n< numOfStudents; n++) {
			System.out.println(students[n].showInfo());
		}
	}

}
