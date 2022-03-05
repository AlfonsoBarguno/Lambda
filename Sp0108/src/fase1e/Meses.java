package fase1e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //imprimir con lambda
		
		ArrayList<String> Meses = new ArrayList<String>(Arrays.asList("Enero", "Febrero","Marzo", "Abril",
				"Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" ));
		
		//Primera forma de hacerlo
		
		Meses.forEach(p -> System.out.println(p));
		
		//Segunda forma de hacerlo
		
		Consumer<String> recorridoEnteros = (n) ->{ System.out.println(n);};
		
		Meses.forEach(recorridoEnteros);
		
	}
	
}





