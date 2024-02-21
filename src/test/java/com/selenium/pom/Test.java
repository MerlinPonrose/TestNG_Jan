package com.selenium.pom;

import com.selenium.pages.RegisterPage;

public class Test extends BaseClass{
	
	
	@org.testng.annotations.Test
	public void validateAddressField()
	{
		driver.findElement(reg.address);
	}

}
