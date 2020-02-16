package ControlFlowStatements;

public class Oneswitch {
	public static void main(String[] args) {
		char value = 'g';
		
		switch (value){
		
			case 'A': case 'B': case 'C': case 'D': case 'E':
				System.out.println(value+" was found");
				break;
			
			default:
				System.out.println("could not find A, B, C, D, or E");
				break;
		}
	}
	
}
