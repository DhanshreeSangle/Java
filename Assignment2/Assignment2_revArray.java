// print array element in reverse

import java.util.Scanner;
public class Assignment2_revArray {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		int i;
		
		System.out.println("Enter array element:");
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Reverse array is :");
		for(i=4;i>=0;i--)
		{
			System.out.println("   "+arr[i]);
		}
	
	}

}
