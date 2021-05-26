// accept student info and calculate total , percentage and grade

import java.util.Scanner;
public class Assignment2_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int roll,total=0,i;
		int[] mark=new int[5];
		String name;
		double per;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll number:");
		roll=sc.nextInt();
		System.out.println("Enter name:");
		name=sc.next();
		
		System.out.println("Enter marks of 5 subject:");
		for(i=0;i<5;i++)
		{
			System.out.println("Marks of subject "+(i+1));
			mark[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("Roll number is: "+roll);
		System.out.println("Name is: "+name);
		
		for(i=0;i<5;i++)
		{
			total=total+mark[i];
		}
		System.out.println("Total marks are: "+total);
		per=(total/5);
		System.out.println("Percentage are :"+per);
		
		
		System.out.println("Student grade is ");
		if(per>85)
			System.out.println("A+");
		else if(per>70)
			System.out.println("A");
		else if(per>60)
			System.out.println("B");
		else if(per>50)
			System.out.println("C");
		else if(per>40)
			System.out.println("D");
		else
			System.out.println("  Fail  ");
		
	}

}
