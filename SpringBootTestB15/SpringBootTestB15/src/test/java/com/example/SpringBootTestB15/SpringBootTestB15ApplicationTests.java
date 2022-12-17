package com.example.SpringBootTestB15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTestB15ApplicationTests {

	@Test
	void contextLoads() 
	{
	}
	@Test
	public void testFindSquarroot()
	{
		Arithmetic instance=new Arithmetic();
		double expResult=2;
		
		double result=instance.findSquarroot(4);
		
		assertEquals(expResult,result,0.0);
		
	}

}
