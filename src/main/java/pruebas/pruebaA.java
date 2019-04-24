package pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pruebaA {
	static List<String> result;
	public static void main(String[] args) {
		Programame pro = new Programame();
		result = new ArrayList<>(Arrays.asList("5", "5 + -13", "10 / 2", "7 * 3", "3 / 0", "5 - 13"));
		
		List<String> vuelta = new ArrayList<String>();
		vuelta = pro.problemaA(result);
		for (int i = 0; i < vuelta.size(); i++) {
			System.out.println(vuelta.get(i));
		}
	}
}
