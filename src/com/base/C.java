package com.base;

public class C implements A, B {

	@Override
	public void person3() {
		System.out.println("Meena");
	}

	@Override
	public void person4() {
		System.out.println("Abdul");
	}

	@Override
	public void person1() {
		System.out.println("Vineth");
	}

	@Override
	public void person2() {
		System.out.println("Sandy");
	}

	public static void main(String[] args) {
		C ref = new C();
		ref.person1();
		ref.person2();
		ref.person3();
		ref.person4();

	}

}
