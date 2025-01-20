package oop_thema7_datenstrukturen.DoppelteVerkettung;

public class DoublyLinkedList {
	
	private DoublyNode head;
	
	public void add(int data) {
		DoublyNode newNode = new DoublyNode(data);
		if (head == null) {
			head = newNode;
		} else {
			DoublyNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next =newNode;
			newNode.prev = current;
		}
	}
	
	public void displayForward() {
		DoublyNode current = head;
		while (current != null) {
			System.out.println(current.data +"<->");
			current = current.next;
		}
		System.out.println("null");
	}
}
