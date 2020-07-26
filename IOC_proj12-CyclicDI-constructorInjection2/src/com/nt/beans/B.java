package com.nt.beans;

public class B {
  private A a;
  
  public B(A a) {
	  System.out.println("B.A()::1-param constructor");
  }



@Override
public String toString() {
	System.out.println("B.toString()");
	return "B [a=" + a + "]";
}
  
  
}
