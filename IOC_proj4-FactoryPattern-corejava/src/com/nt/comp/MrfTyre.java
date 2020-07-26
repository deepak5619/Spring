package com.nt.comp;

public class MrfTyre implements Tyre {

	public MrfTyre() {
		System.out.println("MrfTyre::0-param constructor");
	}
	@Override
	public String roadGrip() {
		return "MRF Type:: Super Road Grip -->Suitable for Sports";
	}

}
