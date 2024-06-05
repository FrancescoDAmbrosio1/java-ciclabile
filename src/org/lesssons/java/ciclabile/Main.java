package org.lesssons.java.ciclabile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	int iProvvisoria = 0;
	List<Integer> elencoInteri = new ArrayList<>();
	elencoInteri.addAll(Arrays.asList(2,56,64,23,12,6,89,60,5));
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println(" --------------------------------------------------- ");
	System.out.println(" -------------RICERCA SU LISTA DI INTERI------------ ");
	System.out.println(" --------------------------------------------------- ");
	
//	System.out.println(elencoInteri);
	int lunghezzaElenco = elencoInteri.size();
	
	for(int i = 0; i < lunghezzaElenco; i++) {
		ElencoInteri.stampaMenu();
		int scelta = scan.nextInt();
		switch(scelta) {
			case 1:
				System.out.println("----- Elemento della lista in posizione n°" + (i + 1) + " è: " 
						+ ElencoInteri.getElementoSuccessivo(elencoInteri, i) + " -----"); 
				ElencoInteri.hasAncoraElementi(lunghezzaElenco, i);
				iProvvisoria = i;
				if(ElencoInteri.hasAncoraElementi(lunghezzaElenco, i) == false) {
					System.out.println("----- Non hai più elementi da cercare!!! -----");
				} else {
					System.out.println("----- hai ancora elementi da cercare.-----");
				}
				break;
			case 2:
				lunghezzaElenco = ElencoInteri.addElemento(elencoInteri);
				System.out.println(elencoInteri);
				i = iProvvisoria;
			}
		}
	}
	
	
	

	
	
	
	

}
