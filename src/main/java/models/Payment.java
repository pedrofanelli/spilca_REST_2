package models;

public class Payment {

	private String id;
	private double amount;
	
	public String getId() {
		return this.id;
	}
	public double getAmount() {
		return this.amount;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
