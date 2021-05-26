// swap 2 numbers

import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,t;
		
		System.out.println("Enter two number:");
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		t=a;
		a=b;
		b=t;
		
		System.out.println("After swapping numbers are A="+a+"and B="+b);
		sc.close();
	}

}
