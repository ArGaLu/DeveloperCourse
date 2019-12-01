package primitivetypesofvariables;

public class OperatorChallenge {

	public static void main(String[] args) {
		double vardouble = 20.00d;
		double vardoubletwo = 80.00d;
		double result = (vardouble + vardoubletwo)*100.00d;
		System.out.println("result ="+result);
		double remainder = result%40.00d;
		System.out.println("remainder= "+remainder);
		boolean consult = (remainder == 0) ? true : false;
		System.out.println("consult= "+ consult);
//		if (result == 0) {
//			consult = true;
//			System.out.println(consult);
//		}
//		if (result != 0) {
//			System.out.println(consult);
//		}
//		if (consult == false) {
//			System.out.println("got some remainder");
//		}
		if (!consult)  {
			System.out.println("got some remainder");
		}
		
	}

}
