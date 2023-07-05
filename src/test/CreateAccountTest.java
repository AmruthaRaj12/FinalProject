package test;

import org.testng.annotations.Test;

import pages.CreateAccountPage;

public class CreateAccountTest extends Baseclass {
	@Test
	public void testlogin()
	{
		CreateAccountPage ob=new CreateAccountPage(driver);
		ob.login();
		ob.createaccnt();
		ob.setvalues("Amrutha", "Raj", "amrutharaj08ii10@gmail.com","aq9wa1233");
		ob.create();
		
}
}