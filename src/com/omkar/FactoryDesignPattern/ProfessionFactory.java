package com.omkar.FactoryDesignPattern;

public class ProfessionFactory {

	public Profession getProfession(String profession) {

		if (profession.equalsIgnoreCase("Doctor")) {
			return new Doctor();
		}

		else if (profession.equalsIgnoreCase("Engineer")) {
			return new Engineer();
		}

		else {
			return null;
		}
	}

}
