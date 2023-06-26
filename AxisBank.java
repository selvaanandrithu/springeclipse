package overloading;

public class AxisBank {
	public int loanEligibility () {
		return 30000;
	}
	public int loanEligibility(int salary) {
		return 30000+salary*10;
		
	}
	public int loanEligibility(int salary,int property) {
		return 30000+(salary*10)+(property*25/100);
		
	}

}
