package com.reflect;

public class ReflectDemo {
	public static void main(String[] args){
		Class<?> c1=null;
		try {
			c1=Class.forName("com.reflect.UnknowClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c1.getName());
		UnknowClass ukc=null;
		try {
			 ukc =(UnknowClass)c1.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(ukc.getAge());
	}
}
