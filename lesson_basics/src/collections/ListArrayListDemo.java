package collections;

import java.util.ArrayList;

public class ListArrayListDemo {
	public static void usingStringArrayList() {
		ArrayList<String> stringArrayList=new 	ArrayList<String>();
		System.out.println("inttial size of stringArrayList:"+stringArrayList);
		try {
			stringArrayList.add("car");
			stringArrayList.add("auto");
			stringArrayList.add("egg");
			stringArrayList.add("box");
			stringArrayList.add("doll");
			stringArrayList.add("fan");
			//will insert a new value
			//pushing the current value of index 1 to the next index
			stringArrayList.add("1,animal");
			stringArrayList.add("girl");
			stringArrayList.add("fan");
			System.out.println("size of stringArrayList after Additions"+stringArrayList.size());
			System.out.println("contents of stringArrayList"+stringArrayList);
			//will replace the value in index 2
			stringArrayList.set(2, "xenas");
			System.out.println("after set(2):"+stringArrayList);
			System.out.println("last indexof:fan"+stringArrayList.lastIndexOf("fan"));
			//remove the first instance of fan
			stringArrayList.remove("fan");
			stringArrayList.remove(2);
			System.out.println("size after remove(2):"+stringArrayList.size());
			System.out.println("contents of stringArrayList" +stringArrayList);
			//will reduce the capacity
			stringArrayList.trimToSize();
		}
		catch(Exception err) {
			System.out.println(err.getMessage());
		}
	}

}
