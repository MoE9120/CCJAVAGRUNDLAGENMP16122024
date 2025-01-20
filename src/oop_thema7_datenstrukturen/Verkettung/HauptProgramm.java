package oop_thema7_datenstrukturen.Verkettung;

public class HauptProgramm {

	public static void main(String[] args) {
		// Erstelle eine neue verkettete Liste
		SinglyLinkedList list = new SinglyLinkedList();
		
		// Füge Elemente hinzu
		list.add(10);
		list.add(20);
		list.add(30);
		
		// Zeige die Liste an
		System.out.println("Inhalt der einfach " + "verketteten Liste:");
		list.display();

	}

}
