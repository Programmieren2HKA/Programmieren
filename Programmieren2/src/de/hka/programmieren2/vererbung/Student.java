package de.hka.programmieren2.vererbung;

/**
 * @author prch0001
 * Diese Klasse erbt von Person und hat zusätzliche Eingenschaften wie MatrikelNr. und Semester
 * Sie überschreibt die Methode print
 */
public class Student extends Person {
	
private int matrNr;
private int semester;

	public Student(String name, String vorname, int id, int matrNr,int semester) {
		super(name, vorname, id);
		this.matrNr=matrNr;
		this.semester=semester;
		
	}
	public void print() {
		super.print();
		System.out.println("Die MatrikelNr. ist "+matrNr);
		System.out.println("Das Semester ist "+semester);
	}
	public int getMatrNr() {
		return matrNr;
	}
	public void setMatrNr(int matrNr) {
		this.matrNr = matrNr;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}

}
