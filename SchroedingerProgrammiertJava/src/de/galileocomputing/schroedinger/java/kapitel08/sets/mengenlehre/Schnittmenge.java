package de.galileocomputing.schroedinger.java.kapitel08.sets.mengenlehre;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Schnittmenge {
	public static void main(String[] args) {
		Set<Integer> A = new HashSet<>();
		for(int i=2; i<=40; i+=2) {
			A.add(i);
		}
		Set<Integer> B = new HashSet<>();
		for(int i=1; i<=20; i++) {
			if(20%i==0) {
				B.add(i);
			}
		}
		System.out.println(A);
		System.out.println(B);
		A.retainAll(B);
		System.out.println(A);
	}
}
