// accept array and print it

import java.util.Scanner;
public class Assignment2_array {

	public static void main(String[] args) {
		
		int[] arr= new int[5];
		int i;
		
		System.out.println("Enter array element:");
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Element of array :");
		for(i=0;i<5;i++)
		{
			System.out.println("  "+arr[i]);
		}
	}

}
