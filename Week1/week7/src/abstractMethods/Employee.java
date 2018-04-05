package abstractMethods;

public class Employee extends Person {
	
	private String jobTitle;
	
	public Employee(String name, String add, String jobTitle) {
		super(name, add);
		this.jobTitle = jobTitle;
		
	}
	
	public void findJob() {

		System.out.println("Put the job here");
	}
	public String formatAddress() {
		String add =  super.getAddress();
		return add;
	}
	
	 
	 

}
