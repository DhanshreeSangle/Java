// print reverse of number

import java.util.Scanner;
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no,rev=0,digit=0;
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		
		no=sc.nextInt();
		while(no>0)
		{
			digit=no%10;
			rev=rev*10+digit;
			no=no/10;
		}
		System.out.println("Reverse of is :"+rev);
		sc.close();
	}

}
