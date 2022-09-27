package pageUIs.bankGuru.payment;

public class AddToCartPageUI {
	public static final String PRODUCT_TITLE_BY_TEXT = "xpath=//div[@class='table-wrapper']//a[text()='%s']";
	public static final String PAGE_TITLE_BY_TEXT = "xpath=//h1[text()='Shopping cart']";
	public static final String EMPTY_MESSAGE = "xpath=//div[contains(text(),'Your Shopping Cart is empty!')]";
	public static final String ADD_TO_CARD_CHECKBOX_BY_TEXT = "xpath=//a[text()='%s']//parent::td//preceding-sibling::td[@class='add-to-cart']";
	public static final String REMOVE_BUTTON_BY_TEXT = "xpath=//a[text()='%s']//parent::td//following-sibling::td[@class='remove-from-cart']";


}
