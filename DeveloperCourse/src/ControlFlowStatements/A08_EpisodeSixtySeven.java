package ControlFlowStatements;

public class A08_EpisodeSixtySeven {
	public static void main(String[] args) {
//			int number = 4; 
//			int finishNumber = 20;
//			while (number <= finishNumber) {
//				number++;
//				if (!isEvenNumber(number)) {
//					continue;
//				}
//				System.out.println("Even number "+number);
//			}
			
			int number = 4; 
			int finishNumber = 20;
			int evenNumbersFound = 0;
			while (number <= finishNumber) {
				number++;
				if (!isEvenNumber(number)) {
					continue;
				}
				
				evenNumbersFound++;
				System.out.println("Even number "+number);
				if (evenNumbersFound >= 5) {
					break;
				}
				
			}
			System.out.println("total even numbers found "+ evenNumbersFound);
			
	}	
	public static boolean isEvenNumber (int num) {
		if (num % 2 != 0) {
			return false;
		}
		return true;
	}
}
