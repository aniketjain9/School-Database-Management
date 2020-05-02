package school.management.system;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feePaid;
	private int feeTotal;
	
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		feePaid = 0;
		feeTotal = 30000;
	}
	//want to alter grade
	public void setGrade(int grade)
	{
		this.grade = grade;
	}
	//keep adding fee to feePaid
	public void payFee(int fees)
	{
		
		feePaid = feePaid + fees;
		School.updateTotalMoneyEarned(feePaid);
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getGrade()
	{
		return grade;
	}
	public int getFeesNet()
	{
		return feePaid;
	}
	public int getFeeTotal()
	{
		return feeTotal;
	}
	
	public int getRemainingFees()
	{
		return feeTotal - feePaid;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
