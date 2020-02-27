package ControlFlowStatements;

public class A09_DigitSumChallenge {

	public static void main(String[] args) {
		System.out.println(sumDigits(256));
		System.out.println(sumDigits(-256));
		System.out.println(sumDigits(4));
		System.out.println(sumDigits(5555));
	}
	public static int sumDigits (int number) {
		int suma=0, unit;
		if (number >= 10) {
			while(number > 0) {
				unit = number % 10;
				suma+=unit;
				number/=10;
			}
			return suma;
		}else {
			return -1;
		}
	}
	 //other solution
	
	public static int sumDigits2 (int num) {
		if (num<10) {
			return -1;
		}
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		return sum;
	}

}
