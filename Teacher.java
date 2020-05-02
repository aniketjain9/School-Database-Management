package school.management.system;

public class Teacher {
	
	
	private int id;
	private String name;
	private static int salary;
	
	public Teacher(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
		//salary = salary;
	}
	
	
	
	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public int getSalary() {
		return salary;
	}
	
	public static void paySalary(int salarys)
	{
		School.updateTotalMoneySpent(salarys);
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
