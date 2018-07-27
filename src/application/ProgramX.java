package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramX {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departamentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));
		
		System.out.print("How many contracts to this worker?  ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(date, valuePerHour, hours);
			worker.addContract(contract);			
		}
		
		System.out.println();
		System.out.print("Enter month and year to calcule income (MM/YYYY): ");
		String mesAndano = sc.next();
		int month = Integer.parseInt(mesAndano.substring(0, 2));
		int year = Integer.parseInt(mesAndano.substring(3));
		
		System.out.println("Name: " + worker.getName());		
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + mesAndano + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
