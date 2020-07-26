package com.nt.comp;

public class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC:0-parma constructor");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return " DTDC Courier will deliver  order id :: "+oid ;
	}

}
