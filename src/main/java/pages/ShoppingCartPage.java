package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import application.Driver;
import constant.IConstant;

public class ShoppingCartPage {
	
	WebDriver driver = Driver.getInstance().getDriver();
	
	By getCartPrice = By.xpath("//*[@class=\"pb-summary-total-price \"]");
	By plusOne = By.xpath("//*[@class='ty-numeric-counter-button']");
	By getAmount = By.className("amount");
	By delete = By.xpath("//*[@class='ty-font-w-semi-bold ty-button ty-bordered ty-transition ty-input-medium ty-primary']");
	
	public void openShoppingCartPage() {
		sleep();
		driver.get(IConstant.SHOPPING_CART_PAGE_URL);
		
	}
	
	public void getShoppingCartPrice() {
		
		openShoppingCartPage();		
	}
	
	public void addOneMoreProductAndGetAmount() {
		
		driver.findElement(plusOne).click();
	}
	
	public void deleteCartProduct() {
		sleep();
		driver.findElements(By.className("i-trash")).get(0).click();
	//	driver.findElement(By.xpath("//*[@class='ty-font-w-semi-bold ty-button ty-bordered ty-transition ty-input-medium ty-primary']"));
		driver.findElement(delete).click();
	}
	
	private void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
