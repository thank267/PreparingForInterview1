package task1;

import task1.builder.PersonBuilder;
import task1.model.Person;

public class App {
	public static void main(String[] args) {
		Person person = new PersonBuilder()
				.firstName("Иван")
				.lastName("Иванов")
				.age(23)
				.build();

		System.out.println(person);
	}
}
