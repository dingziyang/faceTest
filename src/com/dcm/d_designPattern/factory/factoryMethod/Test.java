package com.dcm.d_designPattern.factory.factoryMethod;

// 测试类
public class Test {
    public static void main(String[] args) {
    	
    	// 抽象工厂                                                      具体工厂
        VehicleFactory factory = new BroomFactory();
        
        // 抽象产品
        Moveable m = factory.create();//重写了父类的抽象方法：create()
        
        
        m.run();// 重写了父类的抽象方法：run()
    }
}