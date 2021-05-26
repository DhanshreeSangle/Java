

import java.util.Scanner;
public class Employee {

	private int id;
	private String name;
	private double bs,hra,pf,pt,medical,ns,gs;
	
	public void acceptDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter Basic Salary:");
		bs=sc.nextDouble();
		sc.close();
	}
	
	public void claculate()
	{
		hra=(50*bs)/100;
		pf=(12*bs)/100;
		pt=200;
		medical=500;
		gs=bs+hra+medical;
		ns=gs-(pt+pf);
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Employe id: "+id);
		System.out.println("Basic Salary: "+bs);
		System.out.println("gross Salary: "+gs);
		System.out.println("Net Salary: "+ns);
	}
}
