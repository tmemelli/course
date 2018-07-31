package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class OrderUser {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrdemItem> items = new ArrayList<>();
	
	public OrderUser() {
	}
	
	public OrderUser(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrdemItem> getItems() {
		return items;
	}
	
	public void addItem(OrdemItem item) {
		items.add(item);
	}

	public void removeItem(OrdemItem item) {
		items.remove(item);
	}

	public double total() {
		double sum = 0.0;
		for (OrdemItem c : items) {
			sum += c.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ordem moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items: \n");
		for (OrdemItem c : items) {
			sb.append(c.toString() + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
}
