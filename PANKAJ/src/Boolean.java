
public class Boolean {
boolean a = true;
void check() {
	if(a==true) {
		a= false;
		System.out.println("the boolean value is "+a);
		
		
	}
}

public static void main(String[] args) {
	Boolean obj=new Boolean();
	obj.check();
}
}