package fase1b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Llista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Tenint una llista de cadenes de noms propis, escriu un mètode que retorne una
		 * llista de totes les cadenes que comencen amb la lletra 'a' (mayuscula ) i
		 * tenen exactament 3 lletres. Imprimeix el resultat .
		 */

		List<String> nombres = new ArrayList<String>(Arrays.asList("Ada", "Marcos", "Ana", "Manuel", "Anastasia", "Pol"));
		
		
		
		
		nombres = nombres
			    .stream()
			    .filter(x -> x.toCharArray().length==3 && x.toCharArray()[0] == 'A')
			    .collect(Collectors.toList());
		
		nombres.forEach(System.out::println);
		
		
		
	/*	ListaA nombres1 = (a) -> {ArrayList<String> listadef = new ArrayList<String>();

		for (String b : a) {

			char[] arrayChar = b.toCharArray();

			for (int i = 0; i < arrayChar.length; i++) {

				if ( arrayChar.length == 3 && arrayChar[0] == 'A') {
					listadef.add(b);

					

				}
				
				}

			} return listadef; 
		};
		

		System.out.println(nombres1.ListaOrdenada(nombres));
		
	}

	public static void listaA (ArrayList<String> a) {

		ArrayList<String> listadef = new ArrayList<String>();

		for (String b : a) {

			char[] arrayChar = b.toCharArray();

			for (int i = 0; i < arrayChar.length; i++) {

				if ( arrayChar.length == 3 && arrayChar[0] == 'A') {
					listadef.add(b);

					

				}
				
				}

			}System.out.println(listadef); */
		}

	
	@FunctionalInterface
	interface ListaA{
		ArrayList<String> ListaOrdenada (ArrayList<String> a);
	}
	
}
