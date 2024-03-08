package model;

import model.Person;

public class Student extends Person {

	private double gradeAverage;
	private String studentId;

	public Student(String name, String address, String qualification, double gradeAverage, String studentId) {
		
		super(name, address, qualification); // kalder constructoren i
		// superklassen, dette kald skal ske som det første i metoden

		this.gradeAverage = gradeAverage; // attributten i subklassen får en
											// værdi
		this.studentId = studentId;
	}

	public double getGradeAverage() {
		return gradeAverage;
	}

	public void setGradeAverage(double gradeAverage) {
		this.gradeAverage = gradeAverage;
	}

	public void udskrivAdresse() {
		System.out.println("Adresseoplysninger: " + address);

	}

	@Override
	public void udskrivPerson() { // løsning på udskriv, hvor vi
		// udnytter, at der er en udskriv i superklassen
		super.udskrivPerson(); // nødvendigt med super for ikke at kalde sig
		// selv.
		System.out.println("Gennemsnit: " + gradeAverage);
		System.out.println("model.Student identifikation: " + studentId);
	}

}
