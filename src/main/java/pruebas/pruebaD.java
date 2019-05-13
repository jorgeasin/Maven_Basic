package pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pruebaD {
	static List<String> result;

	public static void main(String[] args) {
		Programame pro = new Programame();
		result = new ArrayList<>(
				Arrays.asList("3", "2", "1", "1 2", "2", "3", "1", "1 2", "2,3", "5", "2", "1 2", "3 2", "2,3"));

		List<String> vuelta = new ArrayList<String>();
		vuelta = pro.problemaD(result);
		for (int i = 0; i < vuelta.size(); i++) {
			System.out.println(vuelta.get(i));
		}
	}

}
