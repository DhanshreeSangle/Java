// accept 2D array element and display it

import java.util.Scanner;
public class Assign3_2Darray {

	public static void main(String[] args) {
		
		int[][] arr=new int[3][3];
		int i,j;
		
		System.out.println("Enter 2D array element :");
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Array element are:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("    "+arr[i][j]);
			}
			System.out.println("\n");
		}
		
	}

}
