package fase1d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CincoElementos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>(Arrays.asList("Marta", "Carlos", "Alvaro", "Ana"));

		lista = lista.stream().filter(x -> x.length() > 5).collect(Collectors.toList());

		lista.forEach(System.out::println);

	}

}
