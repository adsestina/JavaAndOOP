package abstractMethods;

public abstract class Person {
	
	private String name;
	private String address;
	
	public Person(String name, String add) {
		this.name = name;
		address = add;
	}
	
	public abstract void findJob();
	public abstract String formatAddress();
	
	public void updateName(String newName) {
		name = newName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public boolean equals(Object object) {
		if (object instanceof Person) {
			Person otherPerson = (Person) object;
			return (name.equals(otherPerson.name) &&
					address.equals(otherPerson.address));
		} else 
			return false;
	}

	public static int addNums(int num1, int num2) {
	    return num1 + num2;
    }
	
	public String toString() {
		return name + " " + address;
	}

    public static void main(String[] args) {
        System.out.println(addNums(1,2));
        Person ted = new Employee("ted", "123 first street","teacher");
    }
}
