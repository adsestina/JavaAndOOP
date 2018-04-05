package abstractMethods;

public class PersonTester {



	public static void main(String[] args) {
		
		//Person suzy = new Person("Suzy", "111 May Street");
		Person suzy = new Employee("Suzy", "111 May Street", "designer");
		System.out.println(suzy);
		Employee joe = new Employee("Joe", "111 May Street", "programmer");
		//System.out.println(joe);
	}

}
