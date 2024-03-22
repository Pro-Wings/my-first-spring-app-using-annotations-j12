package com.prowings.zeroxmlconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
public class P {
	
	private int id;
	private Q q;

	public P() {
	}

	@Autowired
	public P(@Lazy Q q) {
		super();
		this.q = q;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Q getQ() {
		return q;
	}

	public void setQ(Q q) {
		this.q = q;
	}

	@Override
	public String toString() {
		return "P [id=" + id + "]";
	}

	
	
	
}
