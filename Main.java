package school.management.system;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher bittu = new Teacher(1,"Bittu");
		Student sakshi = new Student(1,"Sakshi",5);
		Teacher sonu = new Teacher(2,"Sonu");
		Student akanksha = new Student(2,"Akanksha", 10);
		Teacher renu = new Teacher(3,"Renu");
		Student kanak = new Student(3,"Kanak",12);
		List <Teacher> teacherList = new ArrayList<>();
		List <Student> studentList = new ArrayList<>();
		teacherList.add(bittu);
		teacherList.add(renu);
		teacherList.add(sonu);
		studentList.add(sakshi);
		studentList.add(akanksha);
		studentList.add(kanak);
		
		School abvp = new School(teacherList, studentList);
		System.out.println( "GHS has earned: $" + abvp.getTotalMoneyEarned());
		
		sakshi.payFee(5000);
		System.out.println("GHS has earned: $" +abvp.getTotalMoneyEarned());
		bittu.paySalary(2000);
		renu.paySalary(1000);
		System.out.println("GHS has earned: $" +abvp.getTotalMoneyEarned());
		System.out.println("GHS has spent: $" +abvp.getTotalMoneySpent());
		
		
		
		
		
		

	}

}
