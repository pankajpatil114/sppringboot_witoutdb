
public class Bill {
private double totalBill;
private Product pro1;
private Product pro2;
private Product pro3;

public Bill(Product pro1, Product pro2, Product pro3) {
	this.pro1=pro1;
	this.pro2=pro2;
	this.pro3=pro3;
}
public double calTotalBill() {
	totalBill=pro1.getCost()+pro2.getCost()+pro3.getcost();
	return totalBill;
	
	
}
}
