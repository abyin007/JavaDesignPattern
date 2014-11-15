package com.designpatterns.singleton;

public class SingleObject {

	private static SingleObject singleObject = null;

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {
	}

	public static SingleObject getInstance() {
		if (null != singleObject) {
			return singleObject;
		} else {
			singleObject = new SingleObject();
		}
		return singleObject;
	}

	public void showStatus() {
		if (null != singleObject) {
			System.out.println("Object instantiated.");
		} else {
			System.out.println("Object no instantiated");
		}
	}

}
