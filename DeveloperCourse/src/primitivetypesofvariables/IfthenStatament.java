package primitivetypesofvariables;

public class IfthenStatament {

	public static void main(String[] args) {
		boolean isAlien = false;
		if (isAlien == false) {
			System.out.println("is it not an alien");
		}
		
		int topScore = 100;
		if (topScore == 100) {
			System.out.println("you got high score");
		}
		if (topScore != 100) {
			System.out.println("you dont got high score");
		}
		
		if (topScore >= 100) {
			System.out.println("you got high score");
		}
		topScore = 80;
		if (topScore < 100) {
			System.out.println("you dont got high score");
		}
		
		int secondTopScore = 60;
		if ((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("greater than second top score and less than 100");
		}
		if ((topScore > 90)  || (secondTopScore <= 90)) {
			System.out.println("either or both of the conditions are true");
		}
		
		boolean isCar = false;
		if (isCar = true) {
			System.out.println("this is not supposed to happen");
		}
		
		boolean wasCar = isCar ?  true : false;
		if (wasCar) {
			System.out.println("wasCar is true");
		}
	}

}
