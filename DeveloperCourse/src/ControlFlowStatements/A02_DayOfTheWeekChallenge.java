package ControlFlowStatements;

public class A02_DayOfTheWeekChallenge {

	public static void main(String[] args) {
		DayOfTheWeekIf(0);
		DayOfTheWeekIf(1);
		DayOfTheWeekIf(2);
		DayOfTheWeekIf(3);
		DayOfTheWeekIf(4);
		DayOfTheWeekIf(5);
		DayOfTheWeekIf(6);
		DayOfTheWeekIf(7);
		DayOfTheWeekIf(0);
		
		DayOfTheWeekSwitch(0);
		DayOfTheWeekSwitch(1);
		DayOfTheWeekSwitch(2);
		DayOfTheWeekSwitch(3);
		DayOfTheWeekSwitch(4);
		DayOfTheWeekSwitch(5);
		DayOfTheWeekSwitch(6);
		DayOfTheWeekSwitch(7);
		DayOfTheWeekSwitch(0);
		
	}
	private static void DayOfTheWeekSwitch(int day) {
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Day");
			break;
		}
	}
	
	private static void DayOfTheWeekIf(int day) {
		if (day == 1) {
			 System.out.println("Monday");
		 }else if (day == 2) {
			 System.out.println("Tuesday");
		 }else if (day == 3) {
			 System.out.println("Wednesday");
		 }else if (day == 4) {
			 System.out.println("Thursday");
		 }else if (day == 5) {
			 System.out.println("Friday");
		 }else if (day == 6) {
			 System.out.println("Saturday");
		 }else if (day == 7) {
			 System.out.println("Sunday");
		 }else {
			 System.out.println("Invalid day");
		 }
	}
}
	
