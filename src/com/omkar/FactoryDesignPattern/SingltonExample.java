package com.omkar.FactoryDesignPattern;

public class SingltonExample {

	private static SingltonExample singltonExample=new SingltonExample();

	private SingltonExample() {
		super();
	}
	
	public static SingltonExample getSingltonInstance() {
		return singltonExample;
	}
	
	
}
