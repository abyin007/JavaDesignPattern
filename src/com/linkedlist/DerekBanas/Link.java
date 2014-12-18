package com.linkedlist.DerekBanas;

public class Link {

	public String bookName;
	public int millionsSolds;	
	public Link next;
	
	public Link(String bookName, int millionsSolds){
		this.bookName = bookName;
		this.millionsSolds = millionsSolds;
	}
	
	public void display(){
		System.out.println(bookName + " : " + millionsSolds);
	}
	
	public String toString(){
		return bookName;
	}
	
	public static void main(String[] args) {
		LinkList theLinkedList = new LinkList();
		theLinkedList.insert("A", 1);
		theLinkedList.insert("B", 2);
		theLinkedList.insert("C", 3);
		theLinkedList.insert("D", 4);
		System.out.println(theLinkedList.isEmpty());
		theLinkedList.display();
		
		theLinkedList.removeFirstLink();
		System.out.println("\n\n First link removed");
		theLinkedList.display();
		
		System.out.println("\n\n Finding book - C");
		System.out.println(theLinkedList.find("C"));
		
		System.out.println("\n\n Display");
		theLinkedList.display();
		
		System.out.println("\n\n Removing book - C");
		theLinkedList.remove("A");
		theLinkedList.display();
	}

}
