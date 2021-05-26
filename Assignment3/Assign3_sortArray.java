// sort array

import java.util.Arrays;
import java.util.Scanner;
public class Assign3_sortArray {

	public static void main(String[] args) {
		
		int[] arr;
		int n,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length: ");
		n=sc.nextInt();
		arr=new int[n];
		System.out.print(" Enter array element :");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted array is:");
		for(i=0;i<n;i++)
		{
			System.out.print("     "+arr[i]);
		}
		sc.close();
	}

}
