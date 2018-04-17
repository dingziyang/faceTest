package com.dcm.d_designPattern.factory.factoryMethod;

//具体产品角色
public class Plane implements Moveable {
	
    @Override
    public void run() {
        System.out.println("plane....");
    }
}

