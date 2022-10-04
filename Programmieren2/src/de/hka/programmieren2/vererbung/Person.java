package de.hka.programmieren2.vererbung;

public class Person {

	private String name;
	private String vorname;
	private int id;
	
	public Person(String name, String vorname, int id) {
		this.name = name;
		this.vorname = vorname; 
		this.id = id;
	
	}
	public void print() {
		System.out.println("Der Nachname ist: "+name);
		System.out.println("Der Vorname ist: "+vorname);
		System.out.println("Die id ist: "+id);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
