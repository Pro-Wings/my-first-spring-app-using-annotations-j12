package com.prowings.zeroxmlconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Q {
	
	private int id;
	private P p;

	public Q() {
	}

	@Autowired
	public Q(P p) {
		super();
		this.p = p;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public P getP() {
		return p;
	}

	public void setP(P p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Q [id=" + id + ", p=" + p + "]";
	}
	
}
