package com.ejb.impl;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Named;

import com.ejb.interfaces.Counter;


/**
 * Session Bean implementation class Counter
 */
@Singleton
@Startup
@Named
public class CounterImpl implements Counter {

	private int a = 1;
	private int b = 1;

	public void incrementA() {
		a++;
	}

	public void incrementB() {
		b++;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

}
