package com.example.SpringBootTestP1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTestP1ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testFindSquarroot()
	{
		Arithmetic instance=new Arithmetic();
		double expResult=12;
		
		double result=instance.findSquarroot(4);
		
		assertEquals(expResult,result,0.0);
	}
}
