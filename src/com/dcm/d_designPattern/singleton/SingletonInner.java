package com.dcm.d_designPattern.singleton;

/**
 * 内部类的实现
 * @author dcm
 *
 */
public class SingletonInner {
	
    // 内部类实现单例模式 延迟加载，减少内存开销
    private static class SingletonHolder {
        private static SingletonInner instance = new SingletonInner();
    }
  
    // 私有的构造函数
    private SingletonInner() {}
  
    public static SingletonInner getInstance() {
        return SingletonHolder.instance;
    }  
  
    protected void print() {
        System.out.println("SingletonInner");
    } 
    
    // test
    public static void main(String[] args) {
    	SingletonInner.getInstance().print();
	}
    
}  