package Test;

public class RounfDouble {

	public static void main(String[] args) {
		double x = 3.775;
		System.out.println(Math.round(x));
		System.out.println(Math.ceil(x));
		System.out.println(Math.floor(x));
		
		
		Double a = (double) ((Math.round(x*100)));
		System.out.println(a/100);
		System.out.println(x*100);
		
	
	}
}
