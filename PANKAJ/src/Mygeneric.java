import java.util.ArrayList;

public class Mygeneric<T>
{
T data;

public T getData() {
	return data;
}

public void setData(T data) {
	this.data = data;
}
public static void main(String[]args)
{
	ArrayList<Integer> arraylist1 =new ArrayList<Integer>();
			Mygeneric<Integer> OBJ1 =new Mygeneric<Integer>();
			OBJ1.setData(10);
			System.out.println(OBJ1.getData());
			
  ArrayList<String> arraylist2 = new Linklist<String>();
  Mygeneric<String> OBJ2 =new Mygeneric<String>();
  OBJ2.setData("pankaj bhai");
  System.out.println(OBJ2.getData());
  
	;
  
}
}