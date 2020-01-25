package methods;

public class SecondsAndMinuteChallengeOther {
	public static final String INVALID_VALUE_MESSAGE = "Invalid Value";
	public static String getDuringString (long minutes, long seconds) {
		if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
			return INVALID_VALUE_MESSAGE;
		}
		long hours = minutes / 60;
		long remainingMinutes = minutes % 60;
		return hours+" h "+remainingMinutes+" m "+seconds+" s";
	}
	public static String getDuringString (int seconds) {
		if (seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		}
		long minutes = seconds / 60;
		long remainingSeconds = seconds % 60;
		return getDuringString(minutes, remainingSeconds);
	}
	
}
