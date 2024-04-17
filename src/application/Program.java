package application;

import model.entities.Category;
import model.entities.Country;

public class Program {

	public static void main(String[] args) {

		Category obj = new Category(1, "Terror");
		Country country = new Country(21, "Brasil", obj);
		System.out.println(obj);
		System.out.println(country);

	}

}
