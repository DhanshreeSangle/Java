// number is palindrome or not

import java.util.Scanner;
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int num,temp,digit=0,pal=0;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		
		num=sc.nextInt();
		temp=num;
		
		while(num>0)
		{
			digit=num%10;
			pal=pal*10+digit;
			num=num/10;
		}
		
		if(pal==temp)
			System.out.println(pal+" is palindrome number");
		else
			System.out.println(pal+" is not palindrome number");
		sc.close();
	}

}
