// check armstrong number

import java.util.Scanner;
public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,temp,digit=0,sum=0;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			digit=n%10;
			sum=sum + (digit*digit*digit);
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+" is a armstrong number");
		else
			System.out.println(temp+" is not a armstrong number");
		sc.close();
	}

}
