package pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pruebaC {
	static List<String> result;

	public static void main(String[] args) {
		Programame pro = new Programame();
		result = new ArrayList<>(Arrays.asList("3", "100", "137", "7"));

		List<String> vuelta = new ArrayList<String>();
		vuelta = pro.problemaC(result);
		for (int i = 0; i < vuelta.size(); i++) {
			System.out.println(vuelta.get(i));
		}
	}

}
