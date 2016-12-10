package com.demo.spring;

public class BeanC {

	private int age;
	
	private BeanB beanB;
	

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting the age using the setter.");
		this.age = age;
	}
}
