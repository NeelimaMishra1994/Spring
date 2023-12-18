package com.springCore.constructorInjection;

public class Certificate {
	private String name;
	

	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}

	public Certificate(String name) {
		super();
		this.name = name;
	}

}
