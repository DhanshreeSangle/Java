// write function for making addition of different types

public class Assignment2_addition {
public static void add()
{
	System.out.println(" Null ");
}
public static void add(int i,int j)
{
	System.out.println("Addition = "+(i+j));
}
public static void add(int i,double j)
{
	System.out.println("Additon ="+(i+j));
}
public static void add(int i, int j,int k)
{
	System.out.println("Addition ="+(i+j+k));
}
public static void add(String i, String j)
{
	System.out.println("Addition ="+(i+j));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=30,b=50;
		double d1=43.60;
		
		add();
		add(a,b);
		add(a,b,b);
		add(a,d1);
		add("Hello","Dhanshree");
	}

}
