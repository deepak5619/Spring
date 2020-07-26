package com.nt.comp;

public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart:0-parma constructor");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "BlueDart Courier will deliver  order id :: "+oid +" order  products";
	}

}
