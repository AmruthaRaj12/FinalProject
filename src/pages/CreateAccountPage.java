package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CreateAccountPage {
	WebDriver driver;
	By login=By.xpath("//*[@id=\"shopify-section-header\"]/section/header/div/div/div[2]/div[2]/div/a[2]");
	By createaccnt=By.xpath("//*[@id=\"header-login-panel\"]/div/div/p[1]/button");
	By fstname=By.name("customer[first_name]");
	By lstname=By.name("customer[last_name]");
	By mail=By.id("register-customer[email]");
	By pass=By.id("register-customer[password]");
	By create=By.xpath("//*[@id=\"create_customer\"]/button");
	
	public CreateAccountPage(WebDriver driver2) {

	this.driver=driver2;
	}
	public void login()
	{
		driver.findElement(login).click();
	}
	public void createaccnt()
	{
		driver.findElement(createaccnt).click();
	}
	public void setvalues(String firstname,String lastname,String email,String password)
	{
		driver.findElement(fstname).sendKeys(firstname);
		driver.findElement(lstname).sendKeys(lastname);
		driver.findElement(mail).sendKeys(email);
		driver.findElement(pass).sendKeys(password);

	}
	public void create()
	{
		driver.findElement(create).click();
		
	}
}