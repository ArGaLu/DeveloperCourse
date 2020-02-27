package ControlFlowStatements;

public class A07_SunOddExercise {
	public static void main(String[] args) {
		
	}
	public static boolean isOdd (int sun) {
		if (sun < 0 || sun  % 2 == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public static int sumOdd (int start, int end) {
		if (start>end || start<1 || end<1) {
			return -1;
		}
		int sum = 0;
		for (int i=start ; i<=end  ; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		return sum;
	}
}
