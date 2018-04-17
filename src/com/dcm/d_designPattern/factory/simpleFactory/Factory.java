package com.dcm.d_designPattern.factory.simpleFactory;

/**
 * 静态工厂方法
 * 一个工厂类处于对产品类实例化调用的中心位置上,它决定那一个产品类应当被实例化
 * @author dcm
 *
 */
public class Factory {
	
	public static Sample creator(int which){ 
        if (which==1)
            return new SampleA();
        else if (which==2)
            return new SampleB();
		return null;
    }
}



class Sample {
	
}

class SampleA extends Sample{
	
}

class SampleB extends Sample{
	
}
