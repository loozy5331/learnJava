package com.javalec.makeClass;

public class ManClass {
	private int age;
	private int height;
	private int weight;
	private String phoneNum;
	
	public ManClass() {
		
	}
	
	public ManClass(int age, int height, int weight, String phoneNum){
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.phoneNum = phoneNum;
	}
	
	public double calculateBMI() {
		double result = weight / (height * height);
		return result;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public String getPhoneNum() {
		return this.phoneNum;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}
