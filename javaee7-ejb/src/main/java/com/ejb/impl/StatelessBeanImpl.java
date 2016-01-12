package com.ejb.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.ejb.interfaces.Counter;
import com.ejb.interfaces.StatelessBean;

/**
 * Session Bean implementation class StatelessBean
 */
@Stateless
public class StatelessBeanImpl implements StatelessBean {
	
	@EJB(mappedName="java:global/javaee7-ear/javaee7-ejb/CounterImpl!com.ejb.interfaces.Counter")
	private Counter counter;

    /**
     * Default constructor. 
     */
    public StatelessBeanImpl() {

    }

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("A=" + counter.getA());
		counter.incrementA();
		System.out.println("A=" + counter.getA());
	}

}
