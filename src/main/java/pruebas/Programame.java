package pruebas;

import java.util.ArrayList;
import java.util.List;

public class Programame {
	List<String> salida;

	public List<String> problemaA(List<String> entrada) {
		salida = new ArrayList<>();
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
		ArrayList salida = null;
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

}
