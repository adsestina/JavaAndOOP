package interfaceReview;

public class Employee extends Person implements Measure {
	
	private String jobTitle;
	private double salaryPerMonth;
	
	public Employee(String name, String add, String jobTitle, double salary) {
		super(name, add);
		this.jobTitle = jobTitle;
		salaryPerMonth = salary;
		
	}
	public double getMeasure(){
		return salaryPerMonth;
	}


	 
	
	public void findJob() {
		System.out.println("Put the job here");
	}
	public String formatAddress() {
		String add =  super.getAddress();
		return add;
	}
	
	 
	 

}
