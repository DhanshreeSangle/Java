// menu driven program for stationary shop

import java.util.Scanner;
public class Assignment2_menuDriven {

	public static void main(String[] args) {
		
		int choice,sum=0;
		boolean flag=true;
		
		System.out.println("      Staionary shop:     ");
		System.out.println("1.Pen: 10Rs");
		System.out.println("2.Pencil: 5Rs");
		System.out.println("3.Notebook: 20Rs");
		System.out.println("4.Colour Box: 50Rs");
		System.out.println("5.Bottle: 30Rs");
		
		Scanner sc=new Scanner(System.in);
		
		while(flag != false)
		{
			System.out.println("Enter choice :");
			choice=sc.nextInt();
	
			switch(choice)
			{
						
				case 1: int price,penq;
						System.out.print("Enter quantity:");
						penq=sc.nextInt();
						price=penq*10;
					    System.out.println("Price of "+penq+" Pens is:"+price);
					    sum=sum+price;
					    break;
				case 2: int price1,pencilq;
						System.out.print("Enter quantity:");
						pencilq=sc.nextInt();
						price1=pencilq*5;
						System.out.println("Price of "+pencilq+" Pencil is:"+price1);
						sum=sum+price1;
						break;
				case 3: int price2,bookq;
						System.out.print("Enter quantity:");
						bookq=sc.nextInt();
						price2=bookq*20;
						System.out.println("Price of "+bookq+" Notebook is:"+price2);
						sum=sum+price2;
						break;
				case 4:	int price3,boxq;
						System.out.print("Enter quantity:");
						boxq=sc.nextInt();
						price3=boxq*50;
						System.out.println("Price of "+boxq+" Colour Box is:"+price3);
						sum=sum+price3;
						break;
				case 5: int price4,bottleq;
						System.out.print("Enter quantity:");
						bottleq=sc.nextInt();
						price4=bottleq*30;
			     		System.out.println("Price of "+bottleq+" Bottle is:"+price4);
			     		sum=sum+price4;
			     		break;
				case 6: flag=false;
						break;
				default: break;
			}
		}
		System.out.println("Total sum is: "+sum);
		sc.close();
	}

}
