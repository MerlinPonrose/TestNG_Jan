package com.selenium.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
	
	@Test
	public void assertnotnull()
	{

		String a = null;
		
		
		Assert.assertNotNull(a,"it is a null value");
		
		System.out.println("next line");
	}

}
