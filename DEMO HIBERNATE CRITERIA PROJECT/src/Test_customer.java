import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Customer.class).configure("Test.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction Tx= ss.beginTransaction();
		Customer cc=new Customer(101,"pankaj" ,"mumbai");
		Tx.commit();
		ss.close();
	
		
	}

}
