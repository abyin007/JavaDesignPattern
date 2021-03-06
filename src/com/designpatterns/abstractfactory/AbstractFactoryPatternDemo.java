package com.designpatterns.abstractfactory;

import com.designpatterns.factory.Shape;

public class AbstractFactoryPatternDemo {

	public static void main(String args[]) {
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");

		// get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		// call draw method of Circle
		shape1.draw();
		// get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		// call draw method of Rectangle
		shape2.draw();
		// get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("SQUARE");
		// call draw method of circle
		shape3.draw();
		
		colorFactory.getColor("red").fill();
		colorFactory.getColor("green").fill();
		colorFactory.getColor("blue").fill();
	}

}
