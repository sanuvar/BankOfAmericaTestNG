package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	

WebDriver driver;

//purpose of this constructor is to tell the driver to initiate this class
public HomePage(WebDriver ldriver ) {
		
this.driver= ldriver;
}
@FindBy(how=How.XPATH,using="//*[contains(text(),'CRM')]")
WebElement CRM;

@FindBy(how=How.XPATH,using="//*[contains(text(),'Add Contact')]")
WebElement AddContact;

@FindBy(how=How.NAME,using="name")
WebElement SearchCustomer;

public void NavigatingToAddcontact() {

// Explicit Wait`
WebDriverWait wait = new WebDriverWait(driver,10);
//wait.until(ExpectedConditions.visibilityOf(CRM));
wait.until(ExpectedConditions.elementToBeClickable(CRM));
//hovering
Actions action= new Actions(driver);
action.moveToElement(CRM).build().perform();

CRM.click();
AddContact.click();

}
public void VerifyPageLogin(){
	
	CRM.isDisplayed();// isDisplayed means if a visible or not.
	SearchCustomer.isDisplayed();
}


}
	
	
	



