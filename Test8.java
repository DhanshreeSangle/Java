// check number is prime or not

import java.util.Scanner;
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		boolean check=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i == 0)
			{
				check = false;
				break;
			}
		}
		if(check)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
		sc.close();
	}

}
