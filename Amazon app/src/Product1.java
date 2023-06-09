
public class Product1 {
private int pid;
private String name;
private int qty;
private double cost;

public Product1 (int pid, String name,int qty, double cost) {
	this.pid= pid;
	this.name= name;
	this.qty=qty;
	this.cost= cost;
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getQty() {
	return qty;
}

public void setQty(int qty) {
	this.qty = qty;
}

public double getCost() {
	return cost;
}

public void setCost(double cost) {
	this.cost = cost;
}
public String toString() {
	return "Product1[pid="+ pid +", name="+name+", qty="+qty+",cost="+cost+"]";

	
	
}


}
