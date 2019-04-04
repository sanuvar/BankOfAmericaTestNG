package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContact;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;
import util.Xls_Reader;


public class AddContactTest {
	
private static final String Name = null;

private static final String Phone = null;

private static final String Address = null;

Xls_Reader reader = new Xls_Reader("/Users/Afroza/.eclipse/TechfiosTestNg/Data/TestData (2).xlsx");

String email = reader.getCellData("Sheet1", "Email", 2);
String password = reader.getCellData("Sheet1", "Password", 2);
String name = reader.getCellData("Sheet1", "FullName", 2);
String Company = reader.getCellData("Sheet1", "Company", 2);
String Email = reader.getCellData("Sheet1", "EmailAddress", 2);
String phone = reader.getCellData("Sheet1", "Phone", 2);
String address = reader.getCellData("Sheet1", "Address", 2);
String City = reader.getCellData("Sheet1", "", 2);
String State = reader.getCellData("Sheet1", "State", 2);
String Zip = reader.getCellData("Sheet1", "Zip", 2);
String Country = reader.getCellData("Sheet1", "Country", 2);

@Test
public void AddContact() throws InterruptedException {

WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");

LoginPage login = PageFactory.initElements(driver, LoginPage.class);
login.TechfiosLogin(email, password);

HomePage home = PageFactory.initElements(driver, HomePage.class);
home.VerifyPageLogin();

home.NavigatingToAddcontact();
AddContact contact = PageFactory.initElements(driver, AddContact.class);

contact.FillinUpAddressForm(name, Company, email, phone, address, City, State, Zip, Country);

driver.close();
driver.quit();
}

}
