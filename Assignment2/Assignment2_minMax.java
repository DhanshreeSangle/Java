// find max and min from array

import java.util.Scanner;
public class Assignment2_minMax {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		int i,min,max=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array element:");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(i=0;i<5;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Maximum number of array is:"+max);
		
		min=max;
		for(i=0;i<5;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("Minimum number of array is:"+min);
		
		
	}

}
