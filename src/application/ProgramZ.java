package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.OrderUser;
import entities.Produto;
import entities.enums.OrderStatus;

public class ProgramZ {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		sc.nextLine();
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		
		OrderUser order = new OrderUser(new Date(), status , client);
		
		System.out.print("How many items to this order? ");
		int totItems = sc.nextInt();
		
		for (int i = 1; i <= totItems; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			
			Produto produto = new Produto(prodName, prodPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
						
			OrdemItem item = new OrdemItem(quantity, prodPrice ,produto);
			
			order.addItem(item);			
		}
		
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		sc.close();
		
	}

}
