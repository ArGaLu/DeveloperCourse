package ControlFlowStatements;

public class A06_ForChallengeTreeFive {
	public static void main(String[] args) {
		int sum = 0, cont = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i%3 == 0 && i%5 == 0) {
				cont++;
				sum += i;
				  System.out.println("Found number is "+i);
			}
			if (cont == 5) {
				break;
			}
		}
		System.out.println("The sum is "+sum);
	}

}
