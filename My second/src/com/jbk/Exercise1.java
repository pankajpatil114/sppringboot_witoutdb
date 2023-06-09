package com.jbk;

public class Exercise1 {
int a;
float b;
String str;

public void operation1() {
	a=10;
	b=15.26f;
	str="Java";
	
}
public void operation2() {
	a=20;
	b=27f;
	str="SELENIUM";
	
}
public void display() {
	System.out.println("the integer value is "+a);
	System.out.println("the float value is"+b);
	System.out.println("the streing value is "+str);
}
public static void main(String args[]) {
	Exercise1 obj = new Exercise1();
	obj.operation1();
	obj.display();
	obj.operation2();
	obj.display();
}

}
