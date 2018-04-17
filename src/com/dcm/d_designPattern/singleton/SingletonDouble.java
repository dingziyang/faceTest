package com.dcm.d_designPattern.singleton;

/**
 * 双重线程检查模式
 * 
 * 优点：延迟加载，线程安全
 * 缺点： 写法复杂，不简洁
 * @author dcm
 *
 */
public class SingletonDouble {  
    private static volatile SingletonDouble sInst = null;  // <<< 这里添加了 volatile  
  
    // 私有的构造函数
    private SingletonDouble() {}
  
    public static SingletonDouble getInstance() {  
        SingletonDouble inst = sInst;  // <<< 在这里创建临时变量
        if (inst == null) {
            synchronized (SingletonDouble.class) {
                inst = sInst;
                if (inst == null) {
                    inst = new SingletonDouble();
                    sInst = inst;
                }
            }
        }
        return inst;  // <<< 注意这里返回的是临时变量
    }
  
    protected void print() {  
        System.out.println("SingletonDouble");
    }  
    
    // test
    public static void main(String[] args) {
    	SingletonDouble s = SingletonDouble.getInstance();
    	s.print();
	}
}  