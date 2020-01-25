package methods;

public class EqualSumChecker {
	public static boolean hasEqualSum (int firstNumber, int secondNumber, int thirdNumber){
        int sum = firstNumber + secondNumber;
        if (sum == thirdNumber){
            return true;
        }
        else return false;
    }

}
