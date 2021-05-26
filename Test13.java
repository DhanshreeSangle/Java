//print all prime number between 1 to n

import java.util.Scanner;
public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,j;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		
		num=sc.nextInt();
		System.out.println("Prime number from 1 to "+num+" are :");
		for(int i=2;i<=num;i++)
		{
			
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
				
					//System.out.println("not prime"+i);
					break;
				}
			
			
			}
			if(j==i) {
				System.out.println(" "+i);
			}
		}
		sc.close();
	}

}
