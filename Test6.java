// find factorial of number

import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,fact=1,i;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		sc.close();
		//fact=n;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is a: "+fact);
		
	}

}
