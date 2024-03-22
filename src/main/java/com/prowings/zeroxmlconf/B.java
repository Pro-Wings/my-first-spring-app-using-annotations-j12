package com.prowings.zeroxmlconf;

public class B {
	
	private int id;
	private String name;

	public B() {
		System.out.println("B's no arg constructor invoked");
	}

	public B(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "B [id=" + id + ", name=" + name + "]";
	}

	
}
