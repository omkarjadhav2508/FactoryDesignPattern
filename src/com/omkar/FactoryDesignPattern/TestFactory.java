package com.omkar.FactoryDesignPattern;

public class TestFactory {

	public static void main(String[] args) {
		
		ProfessionFactory pf= new ProfessionFactory();
		Profession profession = pf.getProfession("doctor");
		profession.print();
		
	}
}
