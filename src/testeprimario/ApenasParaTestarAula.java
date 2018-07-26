package testeprimario;

import java.util.ArrayList;
import java.util.List;

public class ApenasParaTestarAula {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Joao");
		list.add("Bob");
		list.add("James");
		list.add(2, "Jonas");

		for (String string : list) {
			System.out.println(string);
		}
	}
}