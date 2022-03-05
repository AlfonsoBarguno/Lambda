package fase1f;

import java.util.ArrayList;
import java.util.Arrays;

public class Meses1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//imprimir con Method reference
	
		
		ArrayList<String> Meses2 = new ArrayList<String>(Arrays.asList("Enero", "Febrero","Marzo", "Abril",
				"Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" ));
	
		MetodoMeses.printer(Meses2);
	}
	
	
}
