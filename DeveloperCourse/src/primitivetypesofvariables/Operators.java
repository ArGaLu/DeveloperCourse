package primitivetypesofvariables;

public class Operators {

	public static void main(String[] args) {
		int result = 1 + 2;
        System.out.println("1 + 2 = " + result); //result 3

        int previousResult = result;

        result = result - 1; // result 2
        System.out.println( previousResult + " - 1 = " + result);   // 3 - 1 = 2 

        previousResult = result; 
 
        result = result * 10; //result 20
        System.out.println(previousResult + " * 10 = " + result); // 2 * 10 = 20

        previousResult = result;

        result = result / 5; //result 4
        System.out.println(previousResult + " / 5 = " + result); // 20 / 5  = 4

        previousResult = result;
        result = result % 3; //result 1
        System.out.println(previousResult + " % 3 = " + result);// 4 % 3 = 1

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result); //result = 2
        result++;
        System.out.println("Result is now " + result); //result = 3
        result--;
        System.out.println("Result is now " + result); //result = 2

        result += 2;
        System.out.println("Result is now " + result); //result = 4
        result *= 10;
        System.out.println("Result is now " + result); //result = 40
        result -= 10;
        System.out.println("Result is now " + result); //result = 30
        result /= 10;
        System.out.println("Result is now " + result); //result = 3

	}

}
