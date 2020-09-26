package com.study.garbage;

public class GarbageExample {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collector called");
		System.out.println("Object garbage collected : " + this);
	}

	public static void main(String[] args) {
		GarbageExample gc1 = new GarbageExample();
		GarbageExample gc2 = new GarbageExample();
		//gc1= null;
		System.gc();
//		gc2 = null;
//		System.gc();
	}

}
