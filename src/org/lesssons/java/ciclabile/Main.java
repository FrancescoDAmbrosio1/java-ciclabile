package org.lesssons.java.ciclabile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
//	int i = 0;
	boolean result = false;

	public static void main(String[] args) {
		
	List<Integer> elencoInteri = new ArrayList<>();
	elencoInteri.addAll(Arrays.asList(2,56,64,23,12,6,89,60,5));
	
	System.out.println(elencoInteri);
	getElementoSuccessivo(elencoInteri);
	
	}
	
	public static int getElementoSuccessivo(List<Integer> input) {
		int interoI = 0;
		for(int i = 0; i < input.size(); i++) {
			if(i == input.size() - 1) {
				System.out.println("\n----- Sei alla fine della lista !! -----");
				break;
			} else {
				interoI = input.get(i);
				System.out.print("\nNumero ricercato: " + interoI);
				System.out.println(" - " + hasAncoraElementi() + " - hai ancora elementi da cercare.") ;
			}
		}
		return interoI;
	}
	
	public static boolean hasAncoraElementi() {
		boolean result = true;
		return result;
	}

}
