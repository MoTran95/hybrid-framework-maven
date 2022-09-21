package commons;


import org.openqa.selenium.WebDriver;

import pageObjects.bankGuru.payment.AddCustomerPageObject;
import pageObjects.bankGuru.payment.LoginPageObject;
import pageObjects.bankGuru.payment.NewAccountPageObject;
import pageObjects.bankGuru.payment.editCustomerPageObject;
import pageObjects.bankGuru.payment.editNewAccountPageObject;
import pageObjects.bankGuru.payment.homePagePageObject;

public class PageGeneratorManagerBankGuru {
	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	public static AddCustomerPageObject getAddCustomerPage(WebDriver driver) {
		return new AddCustomerPageObject(driver);
	}
	public static homePagePageObject getHomePage(WebDriver driver) {
		return new homePagePageObject(driver);
	}
	public static editCustomerPageObject getEditCustomerPage(WebDriver driver) {
		return new editCustomerPageObject(driver);
	}
	public static NewAccountPageObject getNewAccountPage(WebDriver driver) {
		return new NewAccountPageObject(driver);
	}
	public static editNewAccountPageObject getEditNewAccountPage(WebDriver driver) {
		return new editNewAccountPageObject(driver);
	}
}
