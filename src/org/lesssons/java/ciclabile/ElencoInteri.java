package org.lesssons.java.ciclabile;

import java.util.List;

public class ElencoInteri {
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
		
		//metodo che aggiunge un elemento
		public static int addElemento(List<Integer> input) {
			double numeroCasuale = Math.random()*100;
			input.add((int) numeroCasuale);
			int lunghezzaElenco = input.size();
			return lunghezzaElenco;
		}
		
		//metodo che stampa il menu per azione successiva
		public static void stampaMenu() {
			System.out.println("\nDigita il numero corrispondente alla scelta: "
					+ "\n [1] - Visualizza elemento successivo"
					+ "\n [2] - Aggiungi un intero alla lista");
		}
}
