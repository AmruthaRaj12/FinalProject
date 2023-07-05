package test;

import org.testng.annotations.Test;

import pages.ShopPage;

public class ShopTest extends Baseclass{
	@Test
	public void testshop() 
	{
		ShopPage ob=new ShopPage(driver);
		
		ob.search();
		ob.setvalues("pots");
		ob.entersearch();
		ob.selectpot();
		ob.addtocart();
		ob.checkoutbutton();
		ob.signin();
		ob.setvalues1("amrutharaj080@gmail.com","aq9wa1233");
		ob.signinbutton();
		ob.setvalues2("kizhakkveedu","kollam","691537","9847754772");
       ob.set();
		ob.shipping();
		ob.payment();
		
	}
}
