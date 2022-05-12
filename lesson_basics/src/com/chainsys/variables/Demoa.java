package com.chainsys.variables;

public class Demoa {
public static int DataA;//static global variable
public final int DataB;   //immutable global variable(not static)
public final static int Data=300;  //constant must be declared
//private int dataD();//non static member field
//constructor
/*
 * constructor is a special method
 * the name of constructor and the name of the class will be same
 * constructor dont have return type
 * constructor can take parameters
 */
public Demoa(int dataB) {
	//asigning value to the globel read only field(this.DataB)
	this.DataB=dataB;
	
}
/*
 * static method can be called without an object
 */
public static void sayHello() {
	System.out.println("hello Developer");
}
/*
 * greetuser is a 
 */
public void greetUser()
{
	System.out.println("Greetins USER!!!");
}

}
