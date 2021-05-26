/*create date class with data member day ,month,year   
function to accept all data member and display it*/

import java.util.Scanner;
public class DateClass {

	private int day,month,year;
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day:");
		day=sc.nextInt();
		System.out.println("Enter month:");
		month=sc.nextInt();
		System.out.println("Enter Year:");
		year=sc.nextInt();
	}

	public void display()
	{
		System.out.println("Day/Month/Year: ");
		System.out.print(" "+day);
		System.out.print("/"+month);
		System.out.println("/"+year);
	}
	
}
