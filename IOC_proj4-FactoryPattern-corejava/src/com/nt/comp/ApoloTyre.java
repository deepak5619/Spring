package com.nt.comp;

public class ApoloTyre implements Tyre {

	public ApoloTyre() {
		System.out.println("ApoloTyre::0-param constructor");
	}
	@Override
	public String roadGrip() {
		return "APOLO Tyre:: Standard Road Grip -->Suitable for any Transpotation";
	}

}
