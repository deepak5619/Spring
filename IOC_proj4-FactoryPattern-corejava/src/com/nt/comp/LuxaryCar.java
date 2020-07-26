package com.nt.comp;

public class LuxaryCar implements Car {
	private Tyre tyre;
    public LuxaryCar(Tyre tyre) {
    	System.out.println("LuxaryCar()::1-param constructor");
       this.tyre=tyre;
    }
	@Override
	public void drive() {
		System.out.println("Driving Luxary car  having"+tyre.roadGrip());

	}

}
