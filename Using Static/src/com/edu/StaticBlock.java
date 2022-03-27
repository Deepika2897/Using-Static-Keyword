package com.edu;

//static block it is used to initialize static data
//it is called before any object creation


class Block{
	static int i; //variable as static->shared all objects
	int j; 
	
	static {
		System.out.println("static block it is called ");
		i=1;
	}
	Block(){
		System.out.println("constructor");
	}
	
}
public class StaticBlock {
 static {
	   System.out.println("Static1 before main");
 }
 static {
	   System.out.println("Static2 before main");
 }
	public static void main(String[] args) {
		System.out.println("Main");
Block ob=new Block();
	}

}


