package com.chainsys.unittest;

import com.chainsys.classandmethods.Branch;

public class Abcbanktest {
	
public static void  testLocation() {
	Branch bh=new Branch(01);
	bh.setLocation("theni");
	bh.setManagerId(21);
	System.out.println(bh.getLocation());
	System.out.println(bh.getManagerId());
	System.out.println(bh.getId());
	System.out.println(bh.getBankName());
	
	}
public static void testManagerId() {
	Branch mi=new Branch(02);
	mi.getManagerId();
	mi.setManagerId(22);
}
}
