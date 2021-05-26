// accept array element from user and find index of number if present in array

import java.util.Scanner;
public class Assignment2_arr {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		int i,num;
		
		System.out.println("Enter array element:");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number to search in array:");
		num=sc.nextInt();
		boolean flag=true;
		for(i=0;i<5;i++)
		{
			if(arr[i]==num)
			{
				System.out.println(num+" is present at "+i+" location in array");
				flag=false;
			}
		}
		if(flag)
			System.out.println("Number not in array.");
		sc.close();
	}

}
