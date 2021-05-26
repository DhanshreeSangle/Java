// swap 2 number using function

import java.util.Scanner;

public class Assignment2_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		
		System.out.println("Enter the two number:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swapping A="+a+"B="+b);
		swapNum(a,b);
		sc.close();
	}

	private static void swapNum(int a, int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping A="+a+"B="+b);
		
	}

}
