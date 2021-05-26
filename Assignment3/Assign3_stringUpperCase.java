// accept array of string and convert it into upper case

import java.util.Scanner;
public class Assign3_stringUpperCase {

	public static void main(String[] args) {
		
		String name;
		
		System.out.println("Enter the string :");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		
		sc.close();
		System.out.println("UpperCase :"+name.toUpperCase());
	}

}
