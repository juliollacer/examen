package tester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.Resta;

public class test {

	Resta rest=new Resta();
	@Before
	public void setUp() throws Exception {
		
		rest.setA(20);
		rest.setB(10);
	}

	@Test
	public void test() {
		assertEquals(10,rest.resta());
		}
	}


