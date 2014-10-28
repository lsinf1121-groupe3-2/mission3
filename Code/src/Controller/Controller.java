package Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Controller {

	public static void main(String[] args) {
		System.out.println("Hello Project 3");
		try {
			Reader reader = new FileReader("persons.csv");

			CSVReader<Person> csvPersonReader = ...;

			// read all entries at once
			List<Person> persons = csvPersonReader.readAll();

			// read each entry individually
			Iterator<Person> it = csvPersonReader.iterator();
			while (it.hasNext()) {
			  Person p = it.next();
			  // ...
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
