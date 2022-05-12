package com.chainsys.garbageCollections;

	public class FinalizeDemo
	{
		public static void main(String args[])throws Exception
		{
			Calculator c1=new Calculator();
			c1.add(100,50);
			c1=null;
			Calculator c2=new Calculator();
			Calculator c3=new Calculator();
           //creating an object for runtime
			//it is not possible to create an object directly for runtime like
			Runtime rt=Runtime.getRuntime();//factorymethod
			//the default constructor for run time is private here.
			//so we use a static method getRunTime() of the rumtime class to create
			//an object for runtime
		     rt.gc();    //forcing garbage collection
		     c2=null;
		     c3=null;
		     rt.gc();
			System.in.read();
		}
	}


