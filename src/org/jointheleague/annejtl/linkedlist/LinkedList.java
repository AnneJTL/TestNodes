package org.jointheleague.annejtl.linkedlist;


public class LinkedList<T> {
	
	private Node<T> first = null;
	
	public Node<T> getFirst() {
		return first;
	}

	public void setFirst(Node<T> first) {
		this.first = first;
	}

	public static <T>LinkedList<T> init(){
		return new LinkedList<>();
	}
	
	public void append(T element) {
		Node<T> newNode = new Node<T>(element);
		Node<T> lastNode = first;
		
		if (first == null) {
			first = newNode;					
		} else {
			while(lastNode.getNext() != null) {
				lastNode = lastNode.getNext();
			}
			lastNode.setNext(newNode);
		}
		
	}

	@Override
	public String toString() {
		String affiche = new String();
		Node<T> parcours = first;
		while (parcours.getClass() != null) {
			//System.out.println(parcours.getValue());
			affiche += parcours.getValue() + " -- ";
			parcours.getNext();
		}
		return affiche;
	}

	
}
