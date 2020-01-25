package methods;

public class OverloadingExample {
	public static void main(String[] args) {
		calcFeetandInchesToCentimeter(156);
	}
	public static double calcFeetandInchesToCentimeter (double feet, double inches) {
		if ((feet<0) || ((inches<0) || (inches>12))) {
			System.out.println("invalid feet or inches parameters");
			return -1;
		}
		double centimeters = (feet*12) * 2.54;
		centimeters += inches *2.54;
		System.out.println(feet+ " feet "+inches+" inches "+centimeters+" cm");
		return centimeters;
	}
	public static double calcFeetandInchesToCentimeter (double inches) {
		if (inches < 0) {
			return -1;
		}
		 double feet = (int) inches / 12;
		 double remainingInches = (int)feet % 12;
		 System.out.println("inches is equeal to "+feet+" feet and "+remainingInches+" inches");
		 return calcFeetandInchesToCentimeter(feet, remainingInches);
	}
}
