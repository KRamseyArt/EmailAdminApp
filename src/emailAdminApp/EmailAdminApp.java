package emailAdminApp;

public class EmailAdminApp {
	
	public static void main(String[] args) {
		Email em1 = new Email("John", "Doe");
		
		
		//em1.setMailboxCapacity(capacity);
		//em1.changePassword(password);
		/*
		em1.setAlternateEmail("jd@gmail.com");
		System.out.println(em1.getAlternateEmail());
		*/
		
		System.out.println(em1.showInfo());
	}
}
