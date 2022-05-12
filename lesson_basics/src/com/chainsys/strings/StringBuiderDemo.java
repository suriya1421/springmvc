package com.chainsys.strings;

public class StringBuiderDemo {
	public static void testA()
	{
		String firstString="hello how are you today";
		StringBuilder stringbuilder=new StringBuilder();
		stringbuilder.ensureCapacity(250);
		
		System.out.println("length"+ stringbuilder.length());
		System.out.println("capacity"+ stringbuilder.capacity());
		stringbuilder.append(firstString);
		System.out.println("buffer"+" "+stringbuilder);
		System.out.println("length"+stringbuilder.length());
		System.out.println("capacity"+stringbuilder.capacity());
		firstString="wish it rains this week";
		stringbuilder.append(firstString);
		System.out.println("buffer"+" "+stringbuilder);
		System.out.println("length"+stringbuilder.length());
		System.out.println("capacity"+stringbuilder.capacity());
		stringbuilder.trimToSize();
		System.out.println("length"+stringbuilder.length());
		System.out.println("capacity"+stringbuilder.capacity());
		stringbuilder.replace(3, 8, "-this is a test-");
		System.out.println("replace"+stringbuilder);
		stringbuilder.insert(10, "this is march");
		System.out.println("insert"+stringbuilder);
		System.out.println("length"+stringbuilder.length());
		System.out.println("capacity"+stringbuilder.capacity());
		stringbuilder.delete(5, 20);
		System.out.println("delete"+stringbuilder);
		System.out.println("length"+stringbuilder.length());
		System.out.println("capacity"+stringbuilder.capacity());
		System.out.println("befour reverse:"+" "+stringbuilder);
		stringbuilder.reverse();
		System.out.println("after everse:"+" "+stringbuilder);
		}

}
