package pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pruebaB {
	static List<String> result;

	public static void main(String[] args) {
		Programame pro = new Programame();
		result = new ArrayList<>(Arrays.asList("6", "Polonio", "TT", "RADIO", "helio", "BeCeRRo", "AHA"));

		List<String> vuelta = new ArrayList<String>();
		vuelta = pro.problemaB(result);
		for (int i = 0; i < vuelta.size(); i++) {
			System.out.println(vuelta.get(i));
		}
	}
}
