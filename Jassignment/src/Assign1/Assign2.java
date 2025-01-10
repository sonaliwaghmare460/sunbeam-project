package Assign1;
import java.util.Scanner;
 class Student
{
	int roll_no ;
	int marks ;
	String name ;
	
public void initStudent()
{
	roll_no = 2;
	marks = 30;
	name = "sam";
	
	
}
void acceptStudentDetails(){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Rollno");
   roll_no = sc.nextInt();
   System.out.println("Enter marks");
   marks = sc.nextInt();
   System.out.println("Enter name");
   name = sc.nextLine();
   }
   
void printStudentDetails()
{
	System.out.println("StudentDetails");
	System.out.println("roll_no:" +roll_no);
	System.out.println("marks: " +marks);
	System.out.println("name:" +name);
	
	
}
}
public class Assign2{
	public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Student student = new Student();
    int choice;
	do {
    	System.out.println("menu");
    	System.out.println("1. initialize with default value");
    	System.out.println("2. accept StudentDetails");
    	System.out.println("3. print StudentDetails");
    	System.out.println("4. Exit");
    	System.out.println("5. Enetr your Choice");
    	choice = sc.nextInt();

    	switch (choice) {
    	case 1:
    	student = new Student ();
    	System.out.println("initialized with default values");
    	break;
    	
    	case 2:
    		student.acceptStudentDetails();
    		break;
    		
    	case 3:
    		student.printStudentDetails();
    		break;
    		
    	case 4:
    		System.out.println("Exiting..");
    	}
	}
    while(choice !=4);
}
}


 
