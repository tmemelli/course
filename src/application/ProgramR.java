package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.ListEmployee;

public class ProgramR {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<ListEmployee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int numemp = sc.nextInt();

		for (int i = 1; i <= numemp; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			// Vou instanciar o objeto funcioario
			ListEmployee funcionario = new ListEmployee(id, name, salary);
			// Vou adicionar o funcionario
			list.add(funcionario);
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int id_increase = sc.nextInt();

		// Verificar se funcionario existe pelo ID
		ListEmployee id_emp = list.stream().filter(x -> x.getId() == id_increase).findFirst().orElse(null);

		if (id_emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			id_emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees: ");
		// Printar a lista de funcionarios pelo foreach
		for (ListEmployee listEmployee : list) {
			System.out.println(listEmployee.toString());
		}

		sc.close();
	}

}
