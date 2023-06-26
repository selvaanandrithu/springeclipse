package overloading;

public class UseCalculation {
	public static void main(String[] args) {
		Calculation c = new Calculation();
		System.out.println(c.add(5,7));
		System.out.println(c.add(10, 3,7));
		System.out.println(c.add("srimaan", "selvam"));
		
	}

}
