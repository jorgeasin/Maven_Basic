package pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pruebaE {
	static List<String> result;

	public static void main(String[] args) {
		Programame pro = new Programame();
		result = new ArrayList<>(Arrays.asList("2", "100", "3", "100 1000", "50 300", "50 5000", "200", "3", "100 1000",
				"60 300", "50 300"));

		List<String> vuelta = new ArrayList<String>();
		vuelta = pro.problemaE(result);
		for (int i = 0; i < vuelta.size(); i++) {
			System.out.println(vuelta.get(i));
		}
	}
}
