package com.designpatterns.abstractfactory;

import com.designpatterns.factory.Shape;

public class ColorFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		if(null == color){
			return null;
		}
		if("RED".equalsIgnoreCase(color)){
			return new Red();
		} else if("GREEN".equalsIgnoreCase(color)){
			return new Green();
		} else if("Blue".equalsIgnoreCase(color)){
			return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}


}
