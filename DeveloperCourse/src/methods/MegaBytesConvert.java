package methods;

public class MegaBytesConvert {
	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(1024);
	}
	public static void printMegaBytesAndKiloBytes (int kiloBytes) {
		int megaBytes=0, ikiloBytes=kiloBytes;
		if (kiloBytes<0) {
			System.out.println("Invalid Value");
		}
		else {
			for (int x = 0; kiloBytes >= 1024; x++) {
				megaBytes+=1;
				kiloBytes-=1024;
			}
			System.out.println(ikiloBytes+" KB = "+megaBytes+" MB "
					+ "and "+kiloBytes+" KB");
		}
	
	}

}
