package pageUIs.nopCommerce.user;

public class WhishlishPageUI {
	public static final String PRODUCT_TITLE_BY_TEXT = "xpath=//a[text()='%s']";
	public static final String PAGE_TITLE_BY_TEXT = "xpath=//h1[text()='%s']";
	public static final String EMPTY_MESSAGE = "xpath=//div[contains(text(),'The wishlist is empty!')]";
	public static final String ADD_TO_CARD_BUTTON = "css=button.wishlist-add-to-cart-button";
	public static final String WHISHLISH_LINK = "xpath=//span[text()='Your wishlist URL for sharing:']//following-sibling::a";
	public static final String REMOVE_BUTTON_BY_TEXT = "xpath=//a[text()='%s']//parent::td//following-sibling::td[@class='remove-from-cart']";
	public static final String ADD_TO_CARD_CHECKBOX_BY_TEXT = "xpath=//a[text()='%s']//parent::td//preceding-sibling::td[@class='add-to-cart']";
	
	


}
