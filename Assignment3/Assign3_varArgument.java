// function which take variable number int number as argument and return sum

import java.util.Scanner;
public class Assign3_varArgument {
	
	public static void sum(int... arr)
	{
		int add=0,i;
		for(i=0;i<arr.length;i++)
		{
			add=add+arr[i];
		}
		System.out.println("Addition of all array element is: "+add);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		sum();
		sum(1,7,28);
		sum(34,23,78,12,9,20,34);
		
	}

}
