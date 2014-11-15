package com.designpatterns.singleton;

public class SingletonPatternDemo {
	
	public static void main(String arg[]){
		SingleObject object = SingleObject.getInstance(); 
		if(object == null)
			System.out.println(" is null");
		object.showStatus();
	}

}
