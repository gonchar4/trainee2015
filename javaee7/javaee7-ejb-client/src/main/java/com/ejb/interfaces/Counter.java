package com.ejb.interfaces;

import javax.ejb.Remote;

@Remote
public interface Counter {

	public void incrementA();

	public void incrementB();

	public int getA();

	public int getB();

}
