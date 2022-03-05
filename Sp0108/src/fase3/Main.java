package fase3;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una Functional Interface que conting a un mètode abstracte reverse (),
		 * que retorn e un valor String; en una altra classe, injecta a la interfície
		 * creada mitjançant una lambda el cos de l mètode, de manera que torne la
		 * mateixa cadena que rep com a paràmetre però a l'inrevés. Invo ca la instància
		 * de la interfície passant-li una cadena i comprovant el resultat.
		 */
		
		
		//1era forma
		
		MetodoReverse re1 = (n) -> {StringBuilder str= new StringBuilder(n); String Invertida = str.reverse().toString(); return Invertida;};

		
		//2a forma
		
		MetodoReverse re2 =(n) -> {String cadenaInvertida = "";
        for (int x = n.length() - 1; x >= 0; x--)
            cadenaInvertida = cadenaInvertida + n.charAt(x);
        return cadenaInvertida;};
		
		System.out.println(re1.reverse("Adios"));
		System.out.println(re2.reverse("Hola"));
	}
	
}
		
		

	

