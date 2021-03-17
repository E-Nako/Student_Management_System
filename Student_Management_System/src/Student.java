import java.util.Scanner;

public class Student {
	
	private String firstname;
	private String lastname;
	private int studentLevel;
	private long admissionYear;
	private String studentID;
	private String courses = "";
	private double tuitionBalance = 0;
	private static int costofCourse = 500;
	private static long id = 001;
	private int payment;
	
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the student's firstname:");
		this.firstname = in.nextLine();
		
		System.out.print("Enter the student's lastname:");
		this.lastname = in.nextLine();
		
		System.out.print("Enter the student's admission year:");
		this.admissionYear = in.nextLong();
		
		System.out.println(" ");
		
		System.out.println("LEVEL:");
		
		System.out.print("1 = Level100\n2 = Level200\n3 = Level300\n4 = Level400\nEnter the student's level:");
		this.studentLevel = in.nextInt();
		
		setstudentID();
		
		
		System.out.println(" ");
		
	}
	

	private void setstudentID() {
		
		this.studentID =  studentLevel + "/" +admissionYear+ "/" +id;
		id++;
	}
	
	
	public void enroll() {
		
		System.out.println("COURSES:");
		System.out.print("Mathematics\nEnglish Language\nCommunication Studies\nCritical Thinking\nPsychology\n");
		
		System.out.println(" ");
		
		do {
			
			System.out.print("Enter course to enroll(Q to quit):");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q") ) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costofCourse;
			}
			
		else {
			break;
			}
		}while( 1 != 0);
		
		System.out.println(" ");
		
		System.out.println("ENROLLED IN: " + courses);
		
		System.out.println(" ");
		
	}
	
	
	public void viewTuitionCost() {
		System.out.println("Tuition Cost: GHC " + tuitionBalance);
	}
	
	
	public void payTuition() {
		viewTuitionCost() ;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter payment amount: GHC ");
		this.payment = in.nextInt();
		double TuitionBalance = tuitionBalance - payment;
		System.out.println("Balance: GHC "+TuitionBalance );
		System.out.println("Payment successfull. \n Thank you!! ");
		
		System.out.println("---------------------------------------");
		
		System.out.println(" ");
	}

	

	public String toString() {
		System.out.println(" ");
		System.out.println("STUDENT STATUS:");
		System.out.println(" ");
		double availableBalance = tuitionBalance - payment;
		return "Name: " + firstname+ " "+ lastname+
				"\nAdmission Year: "+ admissionYear+
				"\nStudent ID: "+ studentID+
				"\nCourses Enrolled: "+ courses+
				"\nBalance(Outstanding): GHC "+availableBalance;
		
	}
	
	
}
