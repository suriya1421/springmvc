package com.chainsys.reflection;

public class ReflectDemo {
	public static void main(String args[]){
		Emp e=new Emp();
	Class cls=e.getClass();
	System.out.println(cls.getName());

		
	}

}
