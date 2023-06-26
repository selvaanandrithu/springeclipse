package overloading;

public class Calculation {
	public int add(int num1 ,int num2) {
		return num1+num2;
		
	}
	public int add(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	public int add(String s1,String s2) {
		return s1.length()+s2.length();
		
	}
	

}
