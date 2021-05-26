// perform array operation like sum,avg,min,max

import java.util.Scanner;
public class Assignment2_arrayOperation {

	public static void main(String[] args) {
		
		int[] arr;
		int i,sum=0,min,max=0,avg,size;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("Enter array element:");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		for(i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of all array element is:"+sum);
		
		avg=sum/arr.length;
		System.out.println("Average of all array element is:"+avg);
		
		for(i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Maximum element is:"+max);
		
		min=max;
		for(i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("Minimum element is:"+min);
	}

}
