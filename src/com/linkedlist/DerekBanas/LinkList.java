package com.linkedlist.DerekBanas;

public class LinkList {
	
	public Link firstLink;
	
	LinkList(){
		firstLink = null;
	}
	
	public boolean isEmpty(){
		return (null == firstLink.next);
	}
	
	public void insert(String bookName, int millionsSolds){
		Link newLink = new Link(bookName, millionsSolds);
		newLink.next = firstLink;
		firstLink = newLink;
	}
	
	public void removeFirstLink(){
		if(!isEmpty()){
			firstLink = firstLink.next;
		}
	}
	
	public void display(){
		Link traverseLink = firstLink;
		while(traverseLink != null){
			traverseLink.display();
			traverseLink = traverseLink.next;
		}
	}
	
	public Link find(String bookName){
		Link traverseLink = firstLink;
		if(!isEmpty()){
			while(traverseLink != null){
				if(traverseLink.bookName.equals(bookName)){
					return traverseLink;
				}
				traverseLink = traverseLink.next;
			}
		} else {
			System.out.println("Empty linkedlist");
		}
		return null;
	}
	
	public void remove(String bookName){
		Link currentLink = firstLink;
		Link previousLink = firstLink;
		
		if(!isEmpty()){
			while(currentLink != null){
				if(currentLink.bookName.equals(bookName)){
					
					if(currentLink == firstLink){
						firstLink = firstLink.next;
					} else {
						previousLink.next = currentLink.next;
					}
					break;
				} else{
					previousLink = currentLink;
					currentLink = currentLink.next;
				}
			}
		} else {
			System.out.println("Empty linkedlist");
		}
	}

}
