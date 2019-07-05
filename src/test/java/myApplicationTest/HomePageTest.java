package myApplicationTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import myApplicationWebsite.BasePage;
import myApplicationWebsite.HomePageObjects;

public class HomePageTest {
	HomePageObjects homePage;
	BasePage bp;
	public HomePageTest() {
		homePage=new HomePageObjects();
		bp =new BasePage();
	}
	@Test
	public void HomePageWomenText() {
		Assert.assertTrue(homePage.WomenTextVisibility().isDisplayed());
	}
	@Test
	public void HomePageDressText() {
		Assert.assertTrue(homePage.dressTextVisibility().isDisplayed());
	}
	@Test
	public void HomePageTshirtText() {
		Assert.assertTrue(homePage.tshirtTextVisibility().isDisplayed());
	}
	@Test
	public void navWomenLink() {
		Assert.assertTrue(homePage.navWomenText().isDisplayed());
	}
	@Test
	public void navDressLink() {
		Assert.assertTrue(homePage.navDressText().isDisplayed());
	}
	@Test
	public void navTshirtLink() {
		Assert.assertTrue(homePage.navShirtText().isDisplayed());
	}
	@Test
	public void womanSizeText() {
		Assert.assertTrue(homePage.woSize().isDisplayed());
	}
	@Test
	public void dressSizeText() {
		Assert.assertTrue(homePage.dreSize().isDisplayed());
	}
	@Test
	public void shirtSizeText() {
		Assert.assertTrue(homePage.shirSize().isDisplayed());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
