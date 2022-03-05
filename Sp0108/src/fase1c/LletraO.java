package fase1c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LletraO {

	public static void main(String[] args) {
	/*	Tenint una llista de Strings, escriu un mètode  
		que retorne una llista de totes les  cadenes  que 
		çcontinguen la lletra ‘o’ i  imprimeix el resultat . */
		
		ArrayList<String> lista = new ArrayList<String>(Arrays.asList("Marta", "Carlos", "Alvaro", "Ana"));
		
		
		//Con stream y Lambda
		
		lista = lista.stream().filter(x -> x.toCharArray().contains("o").collect(Collectors.toList()));
		
		lista.forEach(System.out::println);
		
		//Con función
		
		System.out.print(llistaO(lista));
		
		
	}

	
	public static ArrayList<String> llistaO (ArrayList<String> list){
		
		ArrayList<String> llistaO = new ArrayList<String>();
		
		for(String elemento : list) {
			char [] arrayChar = elemento.toCharArray();
			
			for(char elemento2: arrayChar) {
				if (elemento2 == 'o') {
					llistaO.add(elemento);
				}
			}
		}
		
		return llistaO;
	}
}
