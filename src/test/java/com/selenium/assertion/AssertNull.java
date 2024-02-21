package com.selenium.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
	
	@Test
	public void validatenull()
	{
		String a = "hghj";
		
		
		Assert.assertNull(a,"it is not a null value");
		
		System.out.println("next line");
	}

}
