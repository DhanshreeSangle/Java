// calculate da,hra,

import java.util.Scanner;
public class Assignment2_salary {

	public static void main(String[] args) {
		
		int bs,da,hra;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic salary :");
		bs=sc.nextInt();
		sc.close();
		if(bs<=10000)
		{
			//System.out.println("Maximum element is:"+max);
			da=(80*bs)/100;
			System.out.println("DA is:"+da);
			hra=(20*bs)/100;
			System.out.println("Hra is:"+hra);
		}
		else if(10000<bs && bs<=20000)
		{
				//System.out.println("Maximum element is:"+max);
				da=(90*bs)/100;
				System.out.println("DA is:"+da);
				hra=(25*bs)/100;
				System.out.println("Hra is:"+hra);
		}
		else
		{
				//System.out.println("Maximum element is:"+max);
				da=(95*bs)/100;
				System.out.println("DA is:"+da);
				hra=(30*bs)/100;
				System.out.println("Hra is:"+hra);
		}
	}

}
