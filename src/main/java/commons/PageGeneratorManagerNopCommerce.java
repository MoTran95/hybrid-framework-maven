package commons;


import org.openqa.selenium.WebDriver;

import pageObjects.bankGuru.payment.AddCustomerPageObject;
import pageObjects.bankGuru.payment.LoginPageObject;
import pageObjects.bankGuru.payment.NewAccountPageObject;
import pageObjects.bankGuru.payment.editCustomerPageObject;
import pageObjects.bankGuru.payment.editNewAccountPageObject;
import pageObjects.bankGuru.payment.homePagePageObject;
import pageObjects.nopCommerce.user.RegisterPageObject;
import pageObjects.nopCommerce.user.HomePageObject;
import pageObjects.nopCommerce.user.MyAccountPageObject;

public class PageGeneratorManagerNopCommerce {
	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
	public static pageObjects.nopCommerce.user.LoginPageObject getLoginPage(WebDriver driver) {
		return new pageObjects.nopCommerce.user.LoginPageObject(driver);
	}
	public static  MyAccountPageObject getMyAccountPage(WebDriver driver) {
		return new MyAccountPageObject(driver);
	}

}
