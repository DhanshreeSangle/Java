// accept 2 2D array and perform their addditon

import java.util.Scanner;
public class Assign3_addition {

	public static void main(String[] args) {
		
		int[][] arr1=new int[3][3];
		int[][] arr2=new int[3][3];
		int[][] arr3=new int[3][3];
		int i,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st array element:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Print 1st array element:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("   "+arr1[i][j]);
			}
			System.out.println("   ");
		}
		
		System.out.println("Enter 2nd array element:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Print 2nd array element:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("    "+arr2[i][j]);
			}
			System.out.println("   ");
		}
		
		System.out.println("Addition of 1st and 2nd array element:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("    "+arr3[i][j]);
			}
			System.out.println("   ");
		}
	}

}
