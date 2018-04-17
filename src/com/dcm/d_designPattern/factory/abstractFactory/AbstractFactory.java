package com.dcm.d_designPattern.factory.abstractFactory;

//抽象工厂类
public abstract class AbstractFactory {
	
    public abstract Vehicle createVehicle();
    public abstract Weapon createWeapon();
    public abstract Food createFood();
}



abstract class Vehicle {
	abstract void run();
}

abstract class Weapon {
	abstract void shoot();
}

abstract class Food {
	abstract void printName();
}