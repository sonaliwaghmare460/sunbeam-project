package Assign1;
import java.util.Scanner;
class Data 
{
	int day;
	int month;
	int year;
 void initData()
 {
        day = 4;
		month = 3;
		year = 2004;

	}
 void acceptData()
   {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter day");
		day = sc.nextInt();
    	System.out.println("Enter month");
		month = sc.nextInt();
		System.out.print("Enter year");
		year = sc.nextInt();
	}
		
	 
		void printData()
	{
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		
		
	}

}
 public class Assignment1
{
	public static void main(String args [])
	{
		Data d = new Data();
		d.acceptData();
		d.printData();
		
	}
	
	
	
	
}
 


