
public class TEST1 {
public static void main(String[]args) {
	Product pro1= new Product();
	pro1.setpid(101);
	pro1.setName("mobile");
	pro1.setQty(2);
	pro1.setCost(20000);
	
	
	Product pro2= new Product();
	pro2.setPid(101);
	pro2.setName("laptop");
	pro2.setQty(1);
	pro2.setCost(50000);
	
	Product pro3= new Product();
	pro3.setPid(101);
	pro3.setName("headphone");
	pro3.setQty(3);
	pro.setCost(500);
	
	Bill b= new Bill(pro1,pro2,pro3);
	System.out.println(b.calTotalBill);
	
	
	
}
}
