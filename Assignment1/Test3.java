// to calculate compound interest

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p=20000,t=3,n=12;
		double r=.06,amount=p*Math.pow(1+(r/n), n*t);
		double cint=amount-p;
		System.out.println("Compond intrest after"+t+"Years:"+cint);
		System.out.println("Amount after"+t+"Years:"+amount);
	}

}
