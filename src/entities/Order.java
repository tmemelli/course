package entities;

import java.util.Date;

public class Order {
	
	private Date date;
	private Product4 product;
	
	public Order(Date date, Product4 product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product4 getProduct() {
		return product;
	}

	public void setProduct(Product4 product) {
		this.product = product;
	}
		
}
