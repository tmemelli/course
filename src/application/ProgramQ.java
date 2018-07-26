package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramQ {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Joao");
		list.add("Bob");
		list.add("James");
		list.add("Marcos");
		list.add(2, "Jonas");
		
		System.out.println("Tamanho da lista: " + list.size());
		System.out.println("------------------");

		int y = 0;
		for (String x : list) {
			System.out.println("Posição " + y + ": " + x);
			y += 1;
		}
		
		System.out.println("------------------");
	
		list.remove(2);
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
		System.out.println("------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'b').findFirst().orElse(null);
		
		System.out.println(name);

		
	}
}