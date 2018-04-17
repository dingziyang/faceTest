package com.dcm.d_designPattern.factory.simpleFactory;

/**
 * 静态工厂方法
 * 一种目前比较流行的规范是把静态工厂方法命名为valueOf或者getInstance。
 * @author dcm
 *
 */
public class Complex {
	
    private final float re;
    private final float im;

    private Complex(float re, float im){
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(float re, float im){
        return new Complex(re, im);
    }

    public static Complex valueOfPolar(float r, float theta){
        return new Complex((float)(r * Math.cos(theta)), (float)(r * Math.sin(theta)));
    }
    
    @Override
	public String toString() {
		return "Complex [re=" + re + ", im=" + im + "]";
	}

	// test 
    public static void main(String[] args) {
    	Complex a = Complex.valueOf(2.3f, 55.4f); //返回取值为100的Integer对象
    	System.out.println(a.toString());
	}
}