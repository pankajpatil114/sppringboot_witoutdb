

public class Arraylistsize {

//	you can define arraylist as resizeable array.you can grow or shrink arraylist 
//dynamically
//1)	example of adding and remmoving an elemnt in arraylist

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList <String> list= new Arraylist<String>();

//list.add("one");
//list.add("two");
//list.add("three");
////System.out.println(list.size());
//list.add("four");
//list.add("five");
//System.out.println(list.size());
//list.remove("three");
//System.out.println(list.size());
//		
//	}
//2) elements can added or deleted from particular position
//	public static void main(String[] args) {
//		Arraylist<String> list=new Arraylist<String>();
//		list.add("one");
//		list.add("two");
//		list.add("three");
//		System.out.println(list);
//		list.add(1,"six");
//		list.add(2,"seven");
//		System.out.println(list);
//		list.remove(3);
//		System.out.println(list);
		
		
		
		
//}	
	
//	arraylist has many methods to manipulated the stored objects
//	such as methods to perform solo modifications as add, remove , bulk modifications 
//	such as addall, rmoveall, reetain all& searching(indexof(),lastindex of, iterations(iterator))



//4)if generics are not used it can hold any type of objects.

	public static void main(String[] args) {
		Linklist list=new Linklist();
		list.add("one");
		list.add(2);
		list.add("three");
		list.add(6);
		list.add(new Float(2.6));
	
		
		System.out.println(list);


//set method is used to replace the value and get mothod is used get specific value
//clear method is used to delete whole array
		list.set(0,"pankaj");
System.out.println(list);
System.out.println(list.get(2));
list.clear();
System.out.println(list);

}
}


