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
		stampaMenu();
		int scelta = scan.nextInt();
		switch(scelta) {
			case 1:
				System.out.println("----- Elemento della lista in posizione n°" + (i + 1) + " è: " 
						+ getElementoSuccessivo(elencoInteri, i) + " -----"); 
				hasAncoraElementi(lunghezzaElenco, i);
				iProvvisoria = i;
				if(hasAncoraElementi(lunghezzaElenco, i) == false) {
					System.out.println("----- Non hai più elementi da cercare!!! -----");
				} else {
					System.out.println("----- hai ancora elementi da cercare.-----");
				}
				break;
			case 2:
				lunghezzaElenco = addElemento(elencoInteri);
				System.out.println(elencoInteri);
				i = iProvvisoria;
			}
		}
	}
	
	//metodo che visualizza elemento successivo
	public static int getElementoSuccessivo(List<Integer> input, int i) {
		int item;
		item = input.get(i);
		return item;
	}
	
	//metodo che visualizza true se ci sono ancora elementi da cercare
	public static boolean hasAncoraElementi(int sizeElenco, int i) {
		boolean result = true;
		if(i == sizeElenco-1) {
			result = false;
		}
		return result;
	}
	
	//metodo che stampa il menu per azione successiva
	public static void stampaMenu() {
		System.out.println("\nDigita il numero corrispondente alla scelta: "
				+ "\n [1] - Visualizza elemento successivo"
				+ "\n [2] - Aggiungi un intero alla lista");
	}
	
	//metodo che aggiunge un elemento
	public static int addElemento(List<Integer> input) {
		double numeroCasuale = Math.random()*100;
		input.add((int) numeroCasuale);
		int lunghezzaElenco = input.size();
		return lunghezzaElenco;
	}

}
