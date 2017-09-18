package de.galileocomputing.schroedinger.java.kapitel08.sets.mengenlehre;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SymmetrischeDifferenz {
	public static void main(String[] args) {
		Set<Integer> A = new TreeSet<>();
		for(int i=2; i<=40; i+=2) {
			A.add(i);
		}
		Set<Integer> B = new TreeSet<>();
		for(int i=1; i<=20; i++) {
			if(20%i==0) {
				B.add(i);
			}
		}
		Set<Integer> C = new TreeSet<>();
		C.addAll(A);
		C.addAll(B);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		A.retainAll(B);
		C.removeAll(A);
		System.out.println(C);
	}
}
