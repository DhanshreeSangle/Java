//print sum of all even and odd numbers 

import java.util.Scanner;
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no,even=0,odd=0,i;
		System.out.println("Enter the number:");
		Scanner sc= new Scanner(System.in);
		no = sc.nextInt();
		
		for(i=0;i<=no;i++)
		{
			if(i%2 == 0)
				even = even + i;
			else
				odd= odd+i;
		}
		System.out.println("Addiotion of all even number is: "+even);
		System.out.println("Addition of all odd numbers is:"+odd);
		sc.close();
	}

}
