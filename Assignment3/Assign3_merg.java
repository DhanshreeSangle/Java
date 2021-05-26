// merge 2 array into single array

import java.util.Scanner;
public class Assign3_merg {

	public static void main(String[] args) {
	
		int[] arr1=new int[3];
		int[] arr2=new int[3];
		int[] arr3=new int[6];
		int i,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st array element:");
		for(i=0;i<3;i++)
		{
				arr1[i]=sc.nextInt();
		}
		for(i=0;i<3;i++)
		{
				arr3[i]=arr1[i];
		}
		
		System.out.println("Enter 2nd array element:");
		for(i=0;i<3;i++)
		{
				arr2[i]=sc.nextInt();
		}
		for(i=0,j=3;i<3;i++,j++)
		{
				arr3[j]=arr2[i];
		}
		sc.close();
		System.out.println(" Merge of 2 array :");
		for(i=0;i<6;i++)
		{
				System.out.println("   "+arr3[i]);
		}
	}

}
