package school.management.system;

//import com.sun.tools.javac.util.List;
import java.util.List;
public class School {
	//implement teacher and students as an ArrayList
	private List<Teacher> teachers; 
	private List<Student> students; 
	private static int totalMoneySpent;
	private static int totalMoneyEarned;



	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
		
	}
	


	public List<Teacher> getTeachers() {
		return teachers;
	}



	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
		
	}
	


	public List<Student> getStudents() {
		return students;
	}



	public void addStudent(Student student) {
		students.add(student);
	}
	
	


	public static int getTotalMoneySpent() {
		return totalMoneySpent;
	}



	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;
		totalMoneySpent += MoneySpent;
	}



	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}



	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}



	public static void main(String[] args) {

	}

}
