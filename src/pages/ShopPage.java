package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage {
	WebDriver driver;
	
	By search=By.name("q");
	By entersearch=By.xpath("//*[@id=\"shopify-section-header\"]/section/header/div/div/div[1]/form/div[1]/div/button");
	By selectpot=By.xpath("//*[@id=\"shopify-section-search-template\"]/section/div[1]/div[2]/div/div/div/div/div/div[3]/div[3]/div[2]/div/a");
	By addtocart=By.xpath("//*[@id=\"product_form_7777390526678\"]/div[4]/button");
	  By checkoutbutton=By.xpath("//*[@id=\"mini-cart\"]/div/div[2]/div[2]/div/button");
	  By signin=By.xpath("//*[@id=\"Form1\"]/div[1]/div/div[2]/div[1]/section/div/div[1]/span/a");
	  By mail=By.id("customer[email]");
	  By pass=By.id("customer[password]");
	  By signinbutton=By.xpath("//*[@id=\"customer_login\"]/button");
	  	By addressname=By.name("address1");
	By cityname=By.name("city");
By state=By.name("zone");
	By postcode=By.name("postalCode");
	By mobno=By.name("phone");
	By shipping=By.xpath("//*[@id=\"Form1\"]/div[1]/div/div[2]/div[2]/div[1]/button");
	By payment=By.xpath("//*[@id=\"Form2\"]/div[1]/div/div/div[2]/div[1]/button");
	By paynow=By.xpath("//*[@id=\"Form4\"]/div[1]/div/div[2]/div[1]/button");
public ShopPage(WebDriver driver2) {
	this.driver=driver2;
	}
public void search() {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(search)).click();
	
}
public void setvalues(String keyword)
{
	driver.findElement(search).sendKeys(keyword);
}
public void entersearch() {
	driver.findElement(entersearch).click();
}

	public void selectpot() {
	driver.findElement(selectpot).click();
	}
	public void addtocart() {
		driver.findElement(addtocart).click();
	}


	public void checkoutbutton()  {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(checkoutbutton)).click();

	}
	public void signin() {
		driver.findElement(signin).click();
	}
	public void setvalues1(String mailid,String password)
	{
		
		driver.findElement(mail).sendKeys(mailid);
		driver.findElement(pass).sendKeys(password);
	}
	public void signinbutton() {
		driver.findElement(signinbutton).click();
	}
	public void setvalues2(String address,String city,String postal,String mobile)
	{
		
		
		driver.findElement(addressname).sendKeys(address);
		driver.findElement(cityname).sendKeys(city);
		driver.findElement(postcode).sendKeys(postal);
		driver.findElement(mobno).sendKeys(mobile);
		
	}
	
	public void set() {
	
	WebElement kl=driver.findElement(state);
	Select s=new Select(kl);
s.selectByValue("KL");
	
}
	public void shipping() {
		driver.findElement(shipping).click();
	}
	public void payment() {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(payment)).click();
	}
	
}
	
	
