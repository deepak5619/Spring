package com.nt.comp;

public class CeatTyre implements Tyre {

	public CeatTyre() {
		System.out.println("CeatTyre::0-param constructor");
	}
	@Override
	public String roadGrip() {
		return "CEAT Tyre:: Smooth Road Grip -->Suitable for  Luxory Comfort";
	}

}
