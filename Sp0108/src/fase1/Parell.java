package fase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Parell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escriu un mètode que retorne una cadena separada per comes basada en una
		 * llista d’Integers. Cada element hauria d'anar precedit per la lletra "e" si
		 * el nombre és parell , i precedit de la lletra "o" si el nombre és im parell.
		 * Per exemple, si la llista d'entrada és (3,44), la sortida hauria de ser
		 * "o3, e44". Imprimeix el resultat.
		 */

		ArrayList<Integer> lista1 = new ArrayList<Integer>(Arrays.asList(9, 8, 7, 6, 5, 4));

		// Sin lambda

		System.out.println(llistaHibrida(lista1));

		// Con Lambda

		llistaH list = (a) -> {

			ArrayList<String> LH = new ArrayList<String>();

			for (int elemento : a) {

				if (elemento % 2 == 0) {

					LH.add("e" + elemento);
				} else {
					LH.add("o" + elemento);
				}
			}
			return LH;

		};

		System.out.println(list.llistaHH(lista1));
	}

	public static ArrayList<String> llistaHibrida(ArrayList<Integer> a) {

		ArrayList<String> LH = new ArrayList<String>();

		for (int elemento : a) {

			if (elemento % 2 == 0) {

				LH.add("e" + elemento);
			} else {
				LH.add("o" + elemento);
			}
		}
		return LH;

	}

	@FunctionalInterface
	interface llistaH {
		ArrayList<String> llistaHH(ArrayList<Integer> a);
	}

	/*
	 * public static ArrayList<String> llistaHibrida (ArrayList<Integer> a){
	 * 
	 * ArrayList<String> LH = new ArrayList<String>();
	 * 
	 * 
	 * for(int elemento : a) {
	 * 
	 * if(elemento%2==0) {
	 * 
	 * LH.add("e" + elemento); } else { LH.add("o" + elemento); } } return LH;
	 * 
	 * 
	 * 
	 * }
	 */

}
