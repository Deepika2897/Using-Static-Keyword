package com.edu;
//static method: it can access only static data
//any changes you want to do with static data go for static method
//static method belongs to class
//static can be called with reference to class name
//static methods cannot be inherited
//static method cannot be overridden


class Method{
	static int i; //variable as static->shared all objects
	int j; 
	static String college_name;
	static {
		college_name="DSCASW";
	}
	
	Method(){
		System.out.println("constructor");
	}
	
	static void myMethod() {//static method can access only static data
		//j=9;//j= non static error
		System.out.println("College name="+college_name);
	}
}
public class StaticMethod {
 
	public static void main(String[] args) {
		System.out.println("Main");
		Method.myMethod();//way to access static method
	}

}


