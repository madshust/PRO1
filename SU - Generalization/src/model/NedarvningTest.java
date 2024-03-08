package model;

import java.time.LocalDate;
import java.time.Month;

public class NedarvningTest {

	public static void main(String[] args) {

		System.out.println("model.Person:");

		Person person = new Person("Hanne", "Sydbakken 27", "Datalog");

		Student student = new Student("Margrethe", "Ringvej 7", "STX", 9.5, "DMU01");

		person.print();

		System.out.println();

		System.out.println("model.Student:");

		student.print();// kalder overrided metode

		System.out.println();

		student.udskrivAdresse(); // kalder egen metode

		System.out.println(student.getName()); // kalder nedarvet metode


		// TEACHER TEST
		System.out.println();
		Teacher teacher = new Teacher("Benn","Sønderhøj 30","Datalog",40000);
		teacher.print();
		System.out.println();
		teacher.setHired(LocalDate.of(2018, Month.MAY,10));
		teacher.print();

	}

}
