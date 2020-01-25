package methods;

public class SecondsAndMinuteChallenge {
	public static void main(String[] args) {
		System.out.println(getDuringString(65, 45));
	}
	 public static String getDuringString (int minutes, int seconds) {
		 String result;
		 int hours=0;
		 if (minutes >= 0 && (seconds >= 0 && seconds <=59)) {
			  for (int i = 0; !(minutes<60) ; i++) {
				if (minutes>=60){
					minutes-=60;
					hours+=1;
				}
			}
			  result = hours+" h "+minutes+" m "+seconds+" s";
			  return result;
			  
		  } else {
			  result = "Invalid Value";
			  return result;
		  }
	 }
	 public static String getDuringString (int seconds) {
		 String result = "Invalid Value";
		 int minutes=0; 
		 if (seconds >= 0) {
			 for (int i = 0;!(seconds < 60); i++) {
				 if (seconds>=60){
					    seconds-=60;
						minutes+=1;
					}
			}
			return getDuringString(minutes, seconds);
		 }else return result;
	 }
}
