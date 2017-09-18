package de.galileocomputing.schroedinger.java.kapitel03;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Aberglauben {

	public static void main(String[] args) {
		if(args.length > 0) {
			String parameter = args[0];
			int zahl = Integer.parseInt(parameter);
			if(zahl%7 == 0 || zahl%13 !=0) {
				System.out.println("Glück gehabt");
			} else {
				System.out.println("Pech gehabt");
			}
		} else {
			System.err.println("Keine Zahl übergeben.");
		}
	}

}
