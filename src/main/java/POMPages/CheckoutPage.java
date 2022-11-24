package POMPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	public CheckoutPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@onchange='Billing.newAddress(!this.value)']")
	private WebElement billingAddressDropdown;
	
	@FindBy(xpath="//option[text()='New Address']")
	private WebElement NewAddressDropDown;

	public WebElement getNewAddressDropDown() {
		return NewAddressDropDown;
	}
	@FindBy(id="BillingNewAddress_FirstName")
	private WebElement FirstName;
	
	@FindBy(id="BillingNewAddress_LastName")
	private WebElement LastName;
	
	@FindBy(id="BillingNewAddress_Email")
	private WebElement EmailTextfield;
	
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement BillingCountryDropdown;
	
	@FindBy(id="BillingNewAddress_City")
	private WebElement CityTextfield;
	
	public WebElement getBillingAddressDropdown() {
		return billingAddressDropdown;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}

	public WebElement getBillingCountryDropdown() {
		return BillingCountryDropdown;
	}

	public WebElement getCityTextfield() {
		return CityTextfield;
	}

	public WebElement getAddressTextfield() {
		return AddressTextfield;
	}

	public WebElement getPhoneNumberTextfield() {
		return PhoneNumberTextfield;
	}

	public WebElement getBillingContinueButton() {
		return BillingContinueButton;
	}
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement AddressTextfield;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement PhoneNumberTextfield;
	
	@FindBy(xpath="(//input[@title='Continue'])[1]")
	private WebElement BillingContinueButton;
	
	@FindBy(id="PickUpInStore")
	private WebElement ShippingCheckBox;
	
	@FindBy(xpath="//input[@onclick='Shipping.save()']")
	private WebElement ShippingContinueButton;
	
	@FindBy(id="paymentmethod_1")
	private WebElement PaymethodRadioButton;
	
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
	private WebElement PaymentMethodContinueButton;
	

	@FindBy(xpath="//input[@onclick='PaymentInfo.save()']")
	private WebElement PaymentInformationContinueButton;
	
	public WebElement getPaymentInformationContinueButton() {
		return PaymentInformationContinueButton;
	}
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
	private WebElement ConfirmButton;
	
	@FindBy(xpath="//input[@class='button-2 order-completed-continue-button']")
	private WebElement ThankYouContinueButton;

	public WebElement getShippingCheckBox() {
		return ShippingCheckBox;
	}

	public WebElement getShippingContinueButton() {
		return ShippingContinueButton;
	}

	public WebElement getPaymethodRadioButton() {
		return PaymethodRadioButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return PaymentMethodContinueButton;
	}

	public WebElement getConfirmButton() {
		return ConfirmButton;
	}

	public WebElement getThankYouContinueButton() {
		return ThankYouContinueButton;
	}
}
