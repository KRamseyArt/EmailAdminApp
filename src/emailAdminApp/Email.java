package emailAdminApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPassLength = 10;
	private String alternateEmail;
	private String companySuffix= "testco.com";
	
	
	//Constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//call a method asking for the department - return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		//call a method that returns a random password
		this.password = randomPassword(defaultPassLength);
		System.out.println("Your password is: " + this.password);
		
		//combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." +  companySuffix;
		//System.out.println("Your email is: " + email);
	}
	
	//ask for the department
	private String setDepartment() {
		System.out.print("NEW WORKER: " + firstName + lastName + 
				"\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if (deptChoice == 1) {
			return "sales";
		} else if (deptChoice == 2) {
			return "dev";
		} else if (deptChoice == 3 ) {
			return "acct";
		} else {
			return "";
		}
	}
	
	//generate a random password
	private String randomPassword(int length) {
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%"; //generate a random number and find random values of this array at any given number
		char[] password = new char[length];//password var = new sequence of characters of the size 'length'
		for (int i=0; i<length; i++) {//for each value inside length, grab a new value inside the array
			int rand = (int) (Math.random() * passwordSet.length()); //cast a randomly generated number between 0 and 1 as an int, multiply that value by the value of length, for range of 0-30, then store inside rand
			password[i] = passwordSet.charAt(rand);//starting at index 0, assign a random value between 0-30 to password value. increment for as many units as defaultPasswordLength variable states, each time giving a new random value.
		}
		return new String(password);
	}
	
	//set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "MB";
	}
}
