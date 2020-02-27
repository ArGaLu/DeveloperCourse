package ControlFlowStatements;

public class A05_ForChallenge {
	public static void main(String[] args) {
		//using the for statement, call the calculateInterest method with
		//the  amount of 10000 with an interetsRate of 2,3,4,5,6,7 and 8
		//and print the result to the console window
		for (int i = 2; i < 9; i++) {
			System.out.println("10.000 at "+ i +"% "
		+String.format("%.2f", (calculateInterest(10000, i))));
		}
		
		System.out.println();
		
		for (int i = 8; i > 1; i--) {
			System.out.println("10.000 at "+ i +"% "
		+String.format("%.2f", (calculateInterest(10000, i))));
		}
		
		//create a  for statement using any range of numbers
		//determine if the number is a  prime number using the isPrime method
		//if it is a prime number, print  it out AND increment a count of the
		//number of prime numbers found
		//if that count is 3 exit for loop
		//hint: use break; statement to exit
		int count=0;
		for (int i = 5; i < 100; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println("the prime number is "+i);
			}
			if (count == 3) {
				break;
			}
		}
		
	}
	public static double calculateInterest (double amount, double interestRate) {
		return (amount*(interestRate/100));
	}
	
	 public static boolean isPrime (int n) {
		 if (n == 1) {
			 return false;
		 }
		 for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		 return true;
	 }
	
}
