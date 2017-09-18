package de.galileocomputing.schroedinger.java.kapitel03;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class SchleifenSpielereien {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}

		int i = 0;
		while (i < 10) {
			System.out.println(++i);
		}

		i = 0;
		do {
			System.out.println(++i);
		} while (i < 10);
		
		
		for(int k=0; k<=100; k++) {
			System.out.print(k%10!=0 ? k + " " : k + "\n");
		}
		
		for(int j=0; j<10; j++) {
			for(int k=1; k<=10; k++) {
				System.out.print(j*10+k + " ");
			}
			System.out.println();
		}
	}
}
