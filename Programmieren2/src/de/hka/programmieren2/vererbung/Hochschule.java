package de.hka.programmieren2.vererbung;

public class Hochschule {

	public static void main(String[] args) {
		Person[] personen = new Person[4];
		personen[0] = new Person("Preisach","Christine", 344);
		personen[1] = new Student("Hebel", "Olivia", 22, 22,3);
		personen[2] = new Student("Kunert", "Simon", 21, 21, 3);
		personen[3] = new Person("Artinger", "Frank",1);
		for(Person p:personen) {
			p.print();
			System.out.println("Diese Person ist ein(e) "+p.getClass().getSimpleName());
			System.out.println("---");
		}
	}
}
