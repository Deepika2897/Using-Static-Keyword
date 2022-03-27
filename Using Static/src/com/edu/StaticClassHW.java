package com.edu;
//static block it is used to initialize static data
//it is called before any object creation

class PracticeStatic{
	static int i; //variable as static->shared all objects
	int j; 
	static String college_name;

	
	static {
		System.out.println("static block it is called ");
		i=1;
		college_name="DSCASW";
	}
	PracticeStatic(){
		System.out.println("constructor");
	}
	
}
public class StaticClassHW{
 static {
	   System.out.println("Static1 before main");
 }
 static {
	   System.out.println("Static2 before main");
 }
	public static void main(String[] args) {
		System.out.println("Main");
		PracticeStatic ob=new PracticeStatic();
		PracticeStatic ob1=new PracticeStatic();
		System.out.println("college name="+ob.college_name);
		//System.out.println("college name="+PracticeStatic.college_name);
	}

}


