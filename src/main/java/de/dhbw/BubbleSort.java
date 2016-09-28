package de.dhbw;

import java.util.Vector;

public class BubbleSort {
	
	public static Vector<Integer> sortieren(Vector<Integer> liste){
		for (int i = 0; i < (liste.size() - 1); i++) {
			for (int j = 0; j < liste.size() - i - 1; j++) {
				if (liste.get(j) > liste.get(j + 1)) {
					int swap = liste.get(j);
					liste.set(j, liste.get(j + 1));
					liste.set(j + 1, swap);
				}
			}
		}
		return liste;
	}
}