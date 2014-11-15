package com.designpatterns.abstractfactory;

import com.designpatterns.factory.Shape;

public abstract class AbstractFactory {

	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
