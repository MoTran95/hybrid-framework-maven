package pageObjects.nopCommerce.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.BasePage;
import commons.PageGeneratorManagerNopCommerce;
import pageUIs.nopCommerce.user.CatetoryPageUI;
import pageUIs.nopCommerce.user.SearchPageUI;

public class CatetoryPageObject extends BasePage{
	WebDriver driver;

	public CatetoryPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public ProductDetailsPageObject clickToProductsInCatetory(String value) {
		waitForElementClickable(driver,CatetoryPageUI.PRODUCT_BY_TITLE ,value);
		clickToElement(driver, CatetoryPageUI.PRODUCT_BY_TITLE,value);
		return PageGeneratorManagerNopCommerce.getProductDetailsPage(driver);
	}

	public void clickToSortDropdown(String value) {
		waitForElementVisible(driver, CatetoryPageUI.SORT_DROPDOWN);
		selectItemInDefaultDropdown(driver, CatetoryPageUI.SORT_DROPDOWN, value);
		sleepInSecond(2);
	}

	public boolean isProductNameSortByAscending() {
		List<String> productNameListText = new ArrayList<String>();
		List<WebElement> productNameListWebElements = getListWebElement(driver, CatetoryPageUI.LIST_PRODUCT_TITLE);
		
		for (WebElement product : productNameListWebElements) {
			productNameListText.add(product.getText());
			
		}
		List<String> sortProductName = new ArrayList<>(productNameListText);
		Collections.sort(sortProductName);
		return productNameListText.equals(sortProductName);
	}
	public boolean isProductNameSortByDescending() {
		List<String> productNameListText = new ArrayList<String>();
		List<WebElement> productNameListWebElements = getListWebElement(driver, CatetoryPageUI.LIST_PRODUCT_TITLE);
		
		for (WebElement product : productNameListWebElements) {
			productNameListText.add(product.getText());
			
		}
		List<String> sortProductName = new ArrayList<>(productNameListText);
		Collections.sort(sortProductName);
		Collections.reverse(sortProductName);
		return productNameListText.equals(sortProductName);
	}

	public void clickToCategorylink(String value) {
		sleepInSecond(2);
		waitForElementClickable(driver, CatetoryPageUI.CATEGORY_LINK_BY_TEXT,value);
		clickToElement(driver, CatetoryPageUI.CATEGORY_LINK_BY_TEXT, value);
		
	}

	public boolean isPriceSortByAscending() {
		List<Float> priceListText = new ArrayList<Float>();
		List<WebElement> priceListWebElements = getListWebElement(driver, CatetoryPageUI.LIST_PRICE);
		
		for (WebElement product : priceListWebElements) {
			priceListText.add(Float.parseFloat(product.getText().replace("$", "").replace(",", "")));
			
		}
		List<Float> sortPrice = new ArrayList<>(priceListText);
		System.out.println("gia truoc sort "+ sortPrice);
		Collections.sort(sortPrice);
		System.out.println("sau sort "+ sortPrice);
		System.out.println("Price text "+ priceListText);
		
		return priceListText.equals(sortPrice);
	}
	public boolean isPriceSortByDescending() {
		List<Float> priceListText = new ArrayList<Float>();
		List<WebElement> priceListWebElements = getListWebElement(driver, CatetoryPageUI.LIST_PRICE);
		
		for (WebElement product : priceListWebElements) {
			priceListText.add(Float.parseFloat(product.getText().replace("$", "").replace(",", "")));
			
			
		}
		List<Float> sortPrice = new ArrayList<>(priceListText);
		Collections.sort(sortPrice);
		Collections.reverse(sortPrice);
		return priceListText.equals(sortPrice);
	}
	public boolean isProductDisplayed(String product) {
		waitForElementVisible(driver, CatetoryPageUI.PRODUCT_TITLE_BY_TEXT,product);
		return isElementDisplayed(driver,CatetoryPageUI.PRODUCT_TITLE_BY_TEXT, product);
	}
	public boolean isNumberProduct(int pageNumber) {
		waitForAllElementVisible(driver, CatetoryPageUI.PRODUCT_NUMBER);
		int number = getElementSize(driver, CatetoryPageUI.PRODUCT_NUMBER);
		if (number<=pageNumber) {
			return true;
		}
		return false;
	}

	public void clickToDisplayedDropdown(String value) {
		waitForElementVisible(driver, CatetoryPageUI.DISPLAYED_DROPDOWN);
		selectItemInDefaultDropdown(driver, CatetoryPageUI.DISPLAYED_DROPDOWN, value);
		sleepInSecond(2);
		
	}

	public boolean isNextButtonDisplayed() {
		waitForElementVisible(driver, CatetoryPageUI.NEXT_BUTTON);
		return isElementDisplayed(driver, CatetoryPageUI.NEXT_BUTTON);
	}
	public boolean isNextButtonUnDisplayed() {
		waitForElementInVisible(driver, CatetoryPageUI.NEXT_BUTTON);
		return isElementUndisplayed(driver, CatetoryPageUI.NEXT_BUTTON);
	}
	public boolean isPreviousButtonDisplayed() {
		waitForElementVisible(driver, CatetoryPageUI.PREVIOUS_BUTTON);
		return isElementDisplayed(driver, CatetoryPageUI.PREVIOUS_BUTTON);
	}

	public void clickToPageDisplayed(String value) {
		waitForElementClickable(driver, CatetoryPageUI.PAGE_BUTTON, value);
		clickToElement(driver,CatetoryPageUI.PAGE_BUTTON , value);
	}

	public boolean isPageUnDisplayed(String pageNumber, String value) {
		waitForElementInVisible(driver, CatetoryPageUI.PAGE_BUTTON,value);
		return isElementUndisplayed(driver, CatetoryPageUI.PAGE_BUTTON, value);
	}

	public ProductDetailsPageObject clickToProductLink(String value) {
		waitForElementClickable(driver, CatetoryPageUI.PRODUCT_TITLE_BY_TEXT, value);
		clickToElement(driver,CatetoryPageUI.PRODUCT_TITLE_BY_TEXT , value);
		return PageGeneratorManagerNopCommerce.getProductDetailsPage(driver);
	}

	public void clickToAddCompareButton(String productName, String nameButton) {
		waitForElementClickable(driver, CatetoryPageUI.ADD_BUTTON_BY_TEXT, productName, nameButton);
		clickToElement(driver,CatetoryPageUI.ADD_BUTTON_BY_TEXT , productName, nameButton);
		
	}

	public String getSuccessMessageDisplayed() {
		waitForElementVisible(driver, CatetoryPageUI.ADD_MESSAGE_SUCCESS);
		return getElementText(driver, CatetoryPageUI.ADD_MESSAGE_SUCCESS);
		
	}

	public void clickCloseButtonMessage() {
		waitForElementClickable(driver, CatetoryPageUI.CLOSE_MESSAGE_BUTTON);
		clickToElement(driver,CatetoryPageUI.CLOSE_MESSAGE_BUTTON);
		sleepInSecond(2);
		
	}

	public CompareProductPageObject clickToCompareProductLink(String value) {
		waitForElementClickable(driver, CatetoryPageUI.FOOTER_MENU_BY_TEXT,value);
		clickToElement(driver,CatetoryPageUI.FOOTER_MENU_BY_TEXT,value);
		return PageGeneratorManagerNopCommerce.getCompareProductPage(driver);
	}
}
