package com.nt.beans;

public class A {
    private B b;
    
    public A(B b) {
    	System.out.println("A::1-param constructor");
    }

	@Override
	public String toString() {
		System.out.println("A.toString()");
		return "A [b=" + b + "]";
	}
    
    
}
