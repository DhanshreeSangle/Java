//addition of 2 number and characters

import java.util.Scanner;

// addition of 2 number and addition of 2 character
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  no1,no2,add;
		System.out.println("Enter two number :");
		Scanner sc = new Scanner (System.in);
		
		no1=sc.nextInt();
		no2=sc.nextInt();
		add=no1+no2;
		System.out.println("Addition of "+no1+" and "+no2+" is :"+add);
		
		System.out.println("Enter the two character: ");
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		System.out.println("Addition of "+a+" and "+b+" is :"+(a+b));
		
		sc.close();
	}

}
