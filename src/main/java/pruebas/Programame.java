package pruebas;

import java.util.ArrayList;
import java.util.List;

public class Programame {
	List<String> salida;
	String vocales[] = { "a", "A", "e", "E", "i", "I", "o", "O", "u", "U" };

	public List<String> problemaA(List<String> entrada) {
		salida = new ArrayList<>();
		if (entrada.size() < 1) {
			salida.add("ERROR");
			return salida;
		}
		int n_Operaciones = Integer.parseInt(entrada.get(0));
		for (int i = 1; i <= n_Operaciones; i++) {
			int z = entrada.get(i).indexOf(" ", 0);
			int x = 0;
			String num[];
			num = new String[3];
			int indi=0;
			while (z != -1) {
				num[indi]=(entrada.get(i).substring(x, z));
				x = z + 1;
				z = x;
				z = entrada.get(i).indexOf(" ", z);
				indi++;
			}
			num[indi] = entrada.get(i).substring(x, entrada.get(i).length());
			if (num[1].equals("+"))
				salida.add("" +(Integer.parseInt(num[0]) + Integer.parseInt(num[2])));
			if (num[1].equals("-"))
				salida.add("" + (Integer.parseInt(num[0]) - Integer.parseInt(num[2])));
			if (num[1].equals("*"))
				salida.add("" + (Integer.parseInt(num[0]) * Integer.parseInt(num[2])));
			if (num[1].equals("/")) {
				if (num[0].equals("0") || num[2].equals("0"))
					salida.add("ERROR");
				else
					salida.add("" + (Integer.parseInt(num[0]) / Integer.parseInt(num[2])));
			}
		}
		return salida;
	}

	public List<String> problemaB(List<String> entrada) {
		salida = new ArrayList<>();
		if (entrada.size() < 1) {
			salida.add("ERROR");
			return salida;
		}
		int n_Operaciones = Integer.parseInt(entrada.get(0));
		for (int i = 1; i <= n_Operaciones; i++) {
			List<String> palabraLimpia = new ArrayList<>();
			int x=0;
			int y=1;
			for (int j = 0; j < entrada.get(i).length(); j++) {
				if (!comprovar(entrada.get(i).substring(x, y)))
					palabraLimpia.add((entrada.get(i).substring(x, y).toLowerCase()));
				x += 1;
				y += 1;

			}

			String letra = palabraLimpia.get(0);
			Boolean ordenada = true;
			if (palabraLimpia.size() > 1)
				for (int j = 1; j < palabraLimpia.size(); j++) {
					if (letra.compareTo(palabraLimpia.get(j)) > 0) {
						ordenada = false;
					}
					letra = palabraLimpia.get(j);

				}
			if (ordenada)
				salida.add("ERROR");
			else
				salida.add("OK");
		}
//			

		return salida;
	}


	public List<String> problemaC(List<String> entrada) {
		ArrayList salida = null;
		return salida;
	}

	public List<String> problemaD(List<String> entrada) {
		ArrayList salida = null;
		return salida;
	}

	public List<String> problemaE(List<String> entrada) {
		ArrayList salida = null;
		return salida;
	}

	private boolean comprovar(String letra) {
		for (int i = 0; i < vocales.length; i++) {
			if (letra.equals(vocales[i]))
				return true;
		}
		return false;

	}
}
