package Test;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import POMPages.CheckoutPage;
import POMPages.HomePage;
import POMPages.JewelryPage;
import POMPages.LoginPage;
import POMPages.NecklacePage;
import POMPages.ShoppingCartPage;

public class JewelryTest extends BaseTest{
	@Test
	public void Jewel() {
		LoginPage login=new LoginPage(driver);
		login.getLoginLink().click();
		Reporter.log("Login page is displayed");
		//assertTrue(login.getLoginLink().isSelected(),"login page is not displayed");
		login.getEmailTextfield().sendKeys("vanigowdas54@gmail.com");
		Reporter.log("Emailid is entered into EmailTextfield");
		
		login.getPasswordTextfield().sendKeys("Vani@7411");
		Reporter.log("Password is entered into PasswordTextfield");
		
		login.getRemembercheckbox().click();
		Reporter.log("Rememberme is checked into Rememberme checkbox");
		
		login.getLoginButton().click();
		HomePage home=new HomePage(driver);
		home.getJewelryButton().click();
		//assertTrue(home.getJewelryPage().isDisplayed(),"Jewelry Page is not Displayed");
		JewelryPage jewel=new JewelryPage(driver);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		jewel.getBlackandwhiteDiamondHeartLink().click();
		assertTrue(jewel.getBlackandWhiteDiamondheartPage().isDisplayed(),"BlackandwhiteDiamond heart link is not clicked");
	    
	}
	@Test
	public void Necklace() throws InterruptedException {
		NecklacePage necklace=new NecklacePage(driver);
//		assertTrue(necklace.getPrice().isDisplayed(),"Price is not displayed");
//		Reporter.log("Price is displayed");
//		assertTrue(necklace.getQty().isDisplayed(),"By default Qty 1 is not displayed");
//		Reporter.log("By default Qty is 1");
		JavascriptExecutor jse1=(JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,200)");
		//Reporter.log("AddToCart button is clicked");
		necklace.getAddtocart().click();	
		Reporter.log("AddtoCart popup msg is displayed");
		assertTrue(necklace.getPopupMsg().isDisplayed(),"Popup msg is not displayed");
		Thread.sleep(2000);
		JavascriptExecutor jse2=(JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,-200)");
		necklace.getShoppingcart().click();
		Reporter.log("Shopping cart link is clicked");
		assertTrue(necklace.getShoppingCartPage().isDisplayed(),"ShoppingCart Page is not displayed");
}
	@Test
	public void ShoppingCart() throws InterruptedException {
	ShoppingCartPage shopping=new ShoppingCartPage(driver);
	Select sel=new Select(shopping.getCountryDropdown());
	sel.selectByVisibleText("India");
	Reporter.log("India Country DropDown is selected");
	shopping.getTermsandCondition().click();
	Reporter.log("TermsAndConditions checkbox is clicked");
	shopping.getCheckoutButton().click();
	Reporter.log("CheckOutButton is clicked");
	//assertTrue(shopping.getCheckoutPage().isDisplayed(),"CheckoutPage is not displayed");
	
	
	
		CheckoutPage checkout=new CheckoutPage(driver);
		Thread.sleep(2000);
		checkout.getBillingContinueButton().click();
		Reporter.log("Clicked on BillingAddress continue Button");
		checkout.getShippingCheckBox().click();
		Reporter.log("Clicked on ShippingAddress Checkbox");
		checkout.getShippingContinueButton().click();
		Reporter.log("Clicked on ShippingAddress continue Button");
//		checkout.getPaymethodRadioButton().click();
//		Reporter.log("Clicked on Payment method Radiobutton");
//		JavascriptExecutor jse3=(JavascriptExecutor)driver;
//		jse3.executeScript("window.scrollBy(0,200)");
		checkout.getPaymentMethodContinueButton().click();
		Reporter.log("Clicked on PaymentMethod continue Button");
		checkout.getPaymentInformationContinueButton().click();
		Reporter.log("Clicked on PaymentInformation continue Button");
		checkout.getConfirmButton().click();
		Reporter.log("Clicked on confirm order button");
		checkout.getThankYouContinueButton().click();
		//Reporter.log(null);
		//checkout.getConfirmButton().click();
	}
		
	}