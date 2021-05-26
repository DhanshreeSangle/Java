// find greatest of 3 number using nested if else

import java.util.Scanner;
public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		System.out.println("Enter three number:");
		Scanner sc=new Scanner(System.in);
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		if(n1>n2)
		{
			if(n1>n3)
				System.out.println(n1+" is greatest number");
		}
		else if(n2>n3)
			System.out.println(n2+"is greatest number");
		else
			System.out.println(n3+"is greatest number");
		sc.close();
	}

}
