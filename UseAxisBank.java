package overloading;

public class UseAxisBank {
	public static void main(String[] args) {
		AxisBank x = new AxisBank();
		System.out.println(x.loanEligibility());
		System.out.println(x.loanEligibility(30000));
		System.out.println(x.loanEligibility(30000,500000));

	}

}
