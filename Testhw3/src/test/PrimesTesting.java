package test;

import org.junit.Before;
import org.junit.Test;

import primesfinding.PrimesFinding;

public class PrimesTesting {

    public PrimesFinding prime;
	
	@Before
	public void setup(){
		prime=new PrimesFinding();
	}
	
	@Test
	public void tests(){
		prime.printPrimes(10);
	}

}