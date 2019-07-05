package myApplicationWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {
	@FindBy(xpath="//*[text()='Women']")
	private WebElement womenText;
	@FindBy(xpath="(//*[text()='Dresses'])[2]")
	private WebElement dressText;
	@FindBy(xpath="(//*[text()='T-shirts'])[2]")
	private WebElement tshirtText;
	@FindBy(xpath="//*[text()='Women']")
	private WebElement navWomen;
	@FindBy(xpath="(//*[text()='Dresses'])[2]")
	private WebElement navDress;
	@FindBy(xpath="(//*[text()='T-shirts'])[2]")
	private WebElement navTshirt;
	@FindBy(xpath="//*[text()='Women']")
	private WebElement womanSize;
	@FindBy(xpath="(//*[text()='Dresses'])[2]")
	private WebElement dressSize;
	@FindBy(xpath="(//*[text()='T-shirts'])[2]")
	private WebElement shirtSize;
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	//using methods
	public WebElement WomenTextVisibility() {
		return womenText;
	}
	public WebElement dressTextVisibility() {
		return dressText;
	}
	public WebElement tshirtTextVisibility() {
		return tshirtText;
	}
	public WebElement navWomenText() {
		driver.findElement(By.xpath("//*[text()='Women']")).click();
		String txt =driver.findElement(By.xpath("//*[text()='You will find here all woman fashion collections.']")).getText();
		if(txt.equals("You will find here all woman fashion collections")){
			System.out.println("Success");
			return navWomen;
		}
		return navWomen;
	}
	public WebElement navDressText() {
		driver.findElement(By.xpath("(//*[text()='Dresses'])[2]")).click();
		String txt1 = driver.findElement(By.xpath("//*[text()='We offer dresses for every day, every style and every occasion.']")).getText();
		if(txt1.equals("We offer dresses for every day, every style and every occasion.")) {
			System.out.println("Dress Passed");
		}
		return navDress;
	}
	public WebElement navShirtText() {
		driver.findElement(By.xpath("(//*[text()='T-shirts'])[2]")).click();
		String txt2 = driver.findElement(By.xpath("//*[text()='shapes and style of our collection!']")).getText();
		if(txt2.equals("shapes and style of our collection!")) {
			System.out.println("Shirt Passed");
		}
		return navTshirt;
	}
	public WebElement woSize() {
		driver.findElement(By.xpath("//*[text()='Women']")).click();
		driver.findElement(By.xpath("//*[@id='ul_layered_id_attribute_group_1']")).getText();
		return womanSize;
	}
	public WebElement dreSize() {
		driver.findElement(By.xpath("(//*[text()='Dresses'])[2]")).click();
		driver.findElement(By.id("ul_layered_id_attribute_group_1")).getText();
		return dressSize;
	}
	public WebElement shirSize() {
		driver.findElement(By.xpath("(//*[text()='T-shirts'])[2]")).click();
		driver.findElement(By.id("ul_layered_id_attribute_group_1")).getText();
		return shirtSize;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
