package com.dcm.d_designPattern.factory.abstractFactory;

//具体工厂类，其中Food,Vehicle，Weapon是抽象类
public class DefaultFactory extends AbstractFactory{
	
    @Override
    public Food createFood() {
        return new Apple();
    }
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
    @Override
    public Weapon createWeapon() {
        return new AK47();
    }
}



class Apple extends Food {

	@Override
	void printName() {
		System.out.println("my name is apple!");
	}
	
}

class Car extends Vehicle {

	@Override
	void run() {
		System.out.println("the car is running!");
	}
	
}

class AK47 extends Weapon {

	@Override
	void shoot() {
		System.out.println("Killed all Japan!");
	}
	
}