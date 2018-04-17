package com.dcm.d_designPattern.factory.factoryMethod;

//具体工厂
public class PlaneFactory extends VehicleFactory{
    
	@Override
	public Moveable create() {
        return new Plane();
    }
}

