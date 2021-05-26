/* customer class with data member name,email,age,credit limit
function  to accept info and display name,credit*/

import java.util.Scanner;
public class Customer {

	private String name,email;
	private int age;
	private double creditl;
	
	public void setCreditLimit(double cl)
	{
		creditl=cl;
	}
	public double getCreditLimit()
	{
		return creditl;
	}
	
	public void acceptInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter Email:");
		email=sc.next();
		System.out.println("Enter age:");
		age=sc.nextInt();
		System.out.println("Enter Credit Limit:");
		creditl=sc.nextDouble();
		//sc.close();
	}
	
	public void showDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Credit Limit: "+creditl);
	}
}
