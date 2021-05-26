// sum of series

import java.util.Scanner;
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no,i,sum=0;
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		
		no=sc.nextInt();
		for(i=1;i<=no;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of all numbers is: "+sum);
		sc.close();
	}

}
