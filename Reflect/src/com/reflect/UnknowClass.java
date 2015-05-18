package com.reflect;

public class UnknowClass {
	private int age;
	private String name;
	public UnknowClass(){
		this.setAge(25);
		this.setName("one");
	}
	public UnknowClass(int age,String name){
		this.setAge(age);
		this.setName(name);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
