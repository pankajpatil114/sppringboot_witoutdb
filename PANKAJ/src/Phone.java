
public class Phone {
private String name;
private int price;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	if(price>0)
	this.price = price;
}
@Override
public String toString() {
	return "Phone [name=" + name + ", price=" + price + "]";
}


}
