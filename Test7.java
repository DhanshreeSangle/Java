//find m to n power

import java.util.Scanner;
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double no,e,pow=1,temp;
		System.out.println("Enter base and exponent :");
		Scanner sc=new Scanner(System.in);
		
		no=sc.nextDouble();
		e=sc.nextDouble();
		
		//for(int i=1;i<=no;i++)
		{
		//	pow= pow * temp;
		}
		//System.out.println(e+" Power of "+no+" is :"+pow);
		System.out.println("Power is:"+Math.pow(no, e));
		sc.close();
	}

}
