package com.mkyong.hashing;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    
	
	@Test
	public void samplePass()
	{
		int i=1;
		int j=2;
		assertTrue(i+j==3);
	}
	
	@Test
	public void sampleFail()
	{
		int i=2;
		int j=2;
		assertTrue(i+j==4);
	}
	
	
}
