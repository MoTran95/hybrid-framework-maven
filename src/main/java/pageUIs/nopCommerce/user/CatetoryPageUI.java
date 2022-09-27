package pageUIs.nopCommerce.user;

public class CatetoryPageUI {
	public static final String PRODUCT_BY_TITLE = "xpath=//img[@titsle='%s']";
	public static final String CATEGORY_LINK_BY_TEXT = "xpath=//div[@class='master-wrapper-content']//a[text()='%s']";
	public static final String LIST_PRODUCT_TITLE = "xpath=//h2[@class='product-title']";
	public static final String LIST_PRICE = "xpath=//div[@class='prices']";
	public static final String SORT_DROPDOWN = "xpath=//select[@id='products-orderby']";
	public static final String DISPLAYED_DROPDOWN = "xpath=//select[@id='products-pagesize']";
	public static final String PRODUCT_NUMBER = "css=h2.product-title";
	public static final String PRODUCT_TITLE_BY_TEXT = "xpath=//a[text()='%s']";
	public static final String NEXT_BUTTON = "xpath=//li[@class='next-page']";
	public static final String PREVIOUS_BUTTON = "xpath=//li[@class='previous-page']";
	public static final String PAGE_BUTTON = "xpath=//a[text()='%s']";
	public static final String CLOSE_MESSAGE_BUTTON = "css=span.close";
	public static final String FOOTER_MENU_BY_TEXT = "xpath=//a[text()='%s']";
	public static final String ADD_MESSAGE_SUCCESS = "css=p.content";
	public static final String ADD_BUTTON_BY_TEXT = "xpath=//a[text()='%s']//parent::h2//following-sibling::div[@class='add-info']//button[text()='%s']";

}
