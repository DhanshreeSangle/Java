// calculate power of number

import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int n,e;
		System.out.println("Enter the number and exponent :");
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		e=sc.nextInt();
		
		System.out.println("Power of "+n+" is:"+(Math.pow(n,e)));
		sc.close();
	}

}
