package Recursion;

public class findNumberofDigit {
	
	public static int digitCount(int n) {
		if(n==0) {
			return 0;
		}
		return 1+digitCount(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitCount(2343));
	}

}
