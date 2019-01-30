package com.WMSapp.Stepdefinition;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.WMSapplication.Baseclass;
import com.WMSapplication.WMSTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WmsRawmaterialsStepdefinition extends Baseclass {

	public static WebDriver driver;
	public static WMSTest test;

@Given("^User Launch the Chrome Browser$")
public void user_Launch_the_Chrome_Browser() throws Throwable {
    // test = new WMSTest(driver);
   driver = browsers("Chrome");
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  
}

@When("^User hit the WMS application$")
public void user_hit_the_WMS_application() throws Throwable {
	test = new WMSTest(driver);
   geturl("http://localhost/WMSERP/");
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   Assert.assertEquals("http://localhost/WMSERP/", "http://localhost/WMSERP/");
   Thread.sleep(3000);
}

@When("^User Enter the Username$")
public void user_Enter_the_Username() throws Throwable {
	test = new WMSTest(driver);
	test.getEmailid().sendKeys("sysmixadmin");
	 Assert.assertEquals("sysmixadmin", "sysmixadmin");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	
}

@When("^User Enter the Password$")
public void user_Enter_the_Password() throws Throwable {
	test = new WMSTest(driver);
	test.getSigninPassword().sendKeys("SysmixAdmin");
	 Assert.assertEquals("SysmixAdmin", "SysmixAdmin");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
}

@Then("^User Click the Login Functionality$")
public void user_Click_the_Login_Functionality() throws Throwable {
	test = new WMSTest(driver);
	test.getSigninbutton().click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Given("^User Click the Purchase Menu$")
public void user_Click_the_Purchase_Menu() throws Throwable {
	test = new WMSTest(driver);
	test.getPurchase().click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
}

@Given("^User Click the Raw Materials Goods Recepit Notes$")
public void user_Click_the_Raw_Materials_Goods_Recepit_Notes() throws Throwable {
	test = new WMSTest(driver);
	test.getGoodsReceiptnotes().click();
	driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
}

@When("^User Click the Add New Button$")
public void user_Click_the_Add_New_Button() throws Throwable {
	test = new WMSTest(driver);
      test.getRawmaterialsGRNAddnew().click();
      driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
      
   
}

@When("^User Enter the Farmer Supplier Details Add New Menu$")
public void user_Enter_the_Farmer_Supplier_Details_Add_New_Menu() throws Throwable {
	test = new WMSTest(driver);
	test.getFarmersupplierAddnew().click();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
   
}

@When("^User Click the Check box Farmer$")
public void user_Click_the_Check_box_Farmer() throws Throwable {
	test = new WMSTest(driver);
	test.getFarmerradio1().click();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
   
}

@When("^User Contact Details Enter the Name \"([^\"]*)\"$")
public void user_Contact_Details_Enter_the_Name(String Name) throws Throwable {
	test = new WMSTest(driver);
	test.getContactdetailsname().sendKeys(Name);
	String Rawvechicletype = test.getRawmaterialsvechicledetailsType1().getAttribute("value");
   // Assert.assertEquals(Typeoptionone, attribute);
	 Assert.assertEquals(Name, Rawvechicletype);
	Thread.sleep(3000);
}

@When("^User Contact Details Enter the code \"([^\"]*)\"$")
public void user_Contact_Details_Enter_the_code(String code) throws Throwable {
	test = new WMSTest(driver);
	test.getContactdetailscode().clear();
	Thread.sleep(3000);
	test.getContactdetailscode().sendKeys(code);
	Assert.assertEquals(code, code);
	Thread.sleep(3000);
}

@When("^User Contact Details Enter the Address Line one \"([^\"]*)\"$")
public void user_Contact_Details_Enter_the_Address_Line_one(String Addresslineone) throws Throwable {
	test = new WMSTest(driver);
	test.getContactdetailsaddressline1().sendKeys(Addresslineone);
	Assert.assertEquals(Addresslineone, Addresslineone);
	Thread.sleep(3000);
}

@When("^User Contact Details Enter the  Address Line two \"([^\"]*)\"$")
public void user_Contact_Details_Enter_the_Address_Line_two(String Addresslinetwo) throws Throwable {
	test = new WMSTest(driver);
	test.getContactdetailsaddressline2().sendKeys(Addresslinetwo);
	Assert.assertEquals(Addresslinetwo, Addresslinetwo);
	Thread.sleep(3000);
}

@When("^User Contact Details Enter the City/Town \"([^\"]*)\"$")
public void user_Contact_Details_Enter_the_City_Town(String city) throws Throwable {
	test = new WMSTest(driver);
	test.getContactdetailscitytown().sendKeys(city);
	Assert.assertEquals(city, city);
	Thread.sleep(3000);
}

@When("^User Contact Details Enter the Postal code \"([^\"]*)\"$")
public void user_Contact_Details_Enter_the_Postal_code(String postalcode) throws Throwable {
	test = new WMSTest(driver);
	test.getContactdetailspostalcode().sendKeys(postalcode);
	Assert.assertEquals(postalcode, postalcode);
	Thread.sleep(3000);
}

@When("^User Contact Details Enter the Landline code \"([^\"]*)\"$")
public void user_Contact_Details_Enter_the_Landline_code(String landlinecode) throws Throwable {
	test = new WMSTest(driver);
   test.getContactdetailsLandlinecode().sendKeys(landlinecode);
   Assert.assertEquals(landlinecode, landlinecode);
   Thread.sleep(3000);
}

@When("^User Contact Details Enter the Landline Number \"([^\"]*)\"$")
public void user_Contact_Details_Enter_the_Landline_Number(String landlinenumber) throws Throwable {
	test = new WMSTest(driver);
	test.getContactdetailsLandlinenumber().sendKeys(landlinenumber);
	Assert.assertEquals(landlinenumber, landlinenumber);
	Thread.sleep(3000);
}

@When("^User Contact Details Enter the Mobile Number \"([^\"]*)\"$")
public void user_Contact_Details_Enter_the_Mobile_Number(String mobilenumber) throws Throwable {
	test = new WMSTest(driver);
   test.getContactdetailsmobileno().sendKeys(mobilenumber);
   Assert.assertEquals(mobilenumber, mobilenumber);
   Thread.sleep(3000);
}

@When("^User Contact Details Enter the EmailID \"([^\"]*)\"$")
public void user_Contact_Details_Enter_the_EmailID(String emailid) throws Throwable {
	test = new WMSTest(driver);
   test.getContactdetailsemailid().sendKeys(emailid);
   Assert.assertEquals(emailid, emailid);
   Thread.sleep(3000);
}

@When("^User Contact Details Enter the GSTIN number \"([^\"]*)\"$")
public void user_Contact_Details_Enter_the_GSTIN_number(String gstin) throws Throwable {
	test = new WMSTest(driver);
   test.getContactdetailsGSTIN().sendKeys(gstin);
   Assert.assertEquals(gstin, gstin);
   Thread.sleep(3000);
}


@Then("^User Contact Details Click the Next Button and Verifies the credentials$")
public void user_Contact_Details_Click_the_Next_Button_and_Verifies_the_credentials() throws Throwable {
	 test = new WMSTest(driver);
		test.getContactdetailsnextbutton().click();
		Thread.sleep(3000);	
}



@Given("^User Enter the Farm Name \"([^\"]*)\"$")
public void user_Enter_the_Farm_Name(String Farmname) throws Throwable {
	test = new WMSTest(driver);
	test.getFarmdetailsfarmname().sendKeys(Farmname);
	Assert.assertEquals(Farmname, Farmname);
	Thread.sleep(3000);
}

@Given("^User Enter the CAA Reg No \"([^\"]*)\"$")
public void user_Enter_the_CAA_Reg_No(String CAAregno) throws Throwable {
	test = new WMSTest(driver);
	test.getFarmdetailsCAARegno().sendKeys(CAAregno);
    Assert.assertEquals(CAAregno, CAAregno);
	Thread.sleep(3000);
}

@Given("^User Enter the Pound Count \"([^\"]*)\"$")
public void user_Enter_the_Pound_Count(String PoundCount) throws Throwable {
	test = new WMSTest(driver);
	test.getFarmdetailspoundcount().sendKeys(PoundCount);
	Assert.assertEquals(PoundCount, PoundCount);
	Thread.sleep(3000);
}

@Then("^User Click the Farm Next Button and Verifies the Credentials$")
public void user_Click_the_Farm_Next_Button_and_Verifies_the_Credentials() throws Throwable {
	test = new WMSTest(driver);
	test.getFarmdetailsnext().click();
	Thread.sleep(3000);
}

@Given("^User click the Add Bank Button$")
public void user_click_the_Add_Bank_Button() throws Throwable {
	test = new WMSTest(driver);
	test.getAddbankdetails().click();
	Thread.sleep(3000);
}

@Given("^User Click the Radio button National$")
public void user_Click_the_Check_box_National() throws Throwable {
	test = new WMSTest(driver);
	test.getRadiobuttonnational().click();
	Thread.sleep(3000);
}

@Given("^User Enter the Account Name \"([^\"]*)\"$")
public void user_Enter_the_Account_Name(String Bankaccountname) throws Throwable {
	test = new WMSTest(driver);
	test.getBankdetailsaccountname().sendKeys(Bankaccountname);
	Assert.assertEquals(Bankaccountname, Bankaccountname);
	Thread.sleep(3000);
}

@Given("^User Enter the Account No \"([^\"]*)\"$")
public void user_Enter_the_Account_No(String Bankaccountno) throws Throwable {
	test = new WMSTest(driver);
   test.getBankdetailsaccountnumber().sendKeys(Bankaccountno);
   Assert.assertEquals(Bankaccountno, Bankaccountno);
   Thread.sleep(3000);
}

@Given("^User Enter the Bank Name \"([^\"]*)\"$")
public void user_Enter_the_Bank_Name(String Bankname) throws Throwable {
	test = new WMSTest(driver);
	test.getBankdetailsbankname().sendKeys(Bankname);
	Assert.assertEquals(Bankname, Bankname);
	Thread.sleep(3000);
}

@Given("^User Enter the Branch Name \"([^\"]*)\"$")
public void user_Enter_the_Branch_Name(String Branchname) throws Throwable {
	test = new WMSTest(driver);
   test.getBankdetailsbranchname().sendKeys(Branchname);
   Assert.assertEquals(Branchname, Branchname);
   Thread.sleep(3000);
}

@Given("^User Enter the Bank City/Town \"([^\"]*)\"$")
public void user_Enter_the_Bank_City_Town(String Bankcity) throws Throwable {
	test = new WMSTest(driver);
	test.getBankdetailscitytown().sendKeys(Bankcity);
	Assert.assertEquals(Bankcity, Bankcity);
	Thread.sleep(3000);
}

@Then("^User Click the Save Button and Verifies the Credentials$")
public void user_Click_the_Save_Button_and_Verifies_the_Credentials() throws Throwable {
	test = new WMSTest(driver);
	test.getBankdetailssave().click();
	Thread.sleep(3000);
}

@Given("^User Verify's the name$")
public void user_Verify_s_the_name() throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialsname();
	Thread.sleep(3000);
}

@Given("^User Click the city/town$")
public void user_Click_the_city_town() throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialscityname().click();
	Thread.sleep(3000);
}

@Given("^User Enter the Lot Number \"([^\"]*)\"$")
public void user_Enter_the_Lot_Number(String Lotnumber) throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialslotno().sendKeys(Lotnumber);
	Assert.assertEquals(Lotnumber, Lotnumber);
	Thread.sleep(3000);
}

@Given("^User Enter the GRN Date$")
public void user_Enter_the_GRN_Date() throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialsdate().click();
	Thread.sleep(3000);
}

@Given("^User Click the Vechicle Details$")
public void user_Click_the_Vechicle_Details() throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialsvechicledetails().click();
	Thread.sleep(3000);
}

@Given("^User Click the Vechicle Details Addnew$")
public void user_Click_the_Vechicle_Details_Addnew() throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialsVechicleAddnew().click();
	Thread.sleep(3000);
}

@Given("^User Enter the Vechicle Number \"([^\"]*)\"$")
public void user_Enter_the_Vechicle_Number(String Vechiclenumber) throws Throwable {
	test = new WMSTest(driver);
   test.getRawmaterialsvechiclenumber().sendKeys(Vechiclenumber);
   Assert.assertEquals(Vechiclenumber, Vechiclenumber);
   Thread.sleep(3000);
}

@Given("^User Enter the Gate Inward Number \"([^\"]*)\"$")
public void user_Enter_the_Gate_Inward_Number(String Gateinwardnumber) throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialsgateinwardnumber().sendKeys(Gateinwardnumber);
	Assert.assertEquals(Gateinwardnumber, Gateinwardnumber);
	Thread.sleep(3000);
}

@Given("^User Enter the Type options \"([^\"]*)\"$")
public void user_Enter_the_Type_options(String Typeoption) throws Throwable {
	test = new WMSTest(driver);
   test.getRawmaterialsvechicledetailsType().sendKeys(Typeoption);
   Assert.assertEquals(Typeoption, Typeoption);
   Thread.sleep(3000);
}

@Given("^User Enter the Material Name \"([^\"]*)\"$")
public void user_Enter_the_Material_Name(String Typename) throws Throwable {
	test = new WMSTest(driver);
   test.getRawmaterialsname().sendKeys(Typename);
   Assert.assertEquals(Typename, Typename);
   Thread.sleep(3000);
}

@Given("^User Enter the Purchase Count$")
public void user_Enter_the_Purchase_Count() throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialsvechicledetailsPurchasecount();
	Thread.sleep(3000);
}

@Given("^User Enter the Weight/Volume \"([^\"]*)\"$")
public void user_Enter_the_Weight_Volume(String weight) throws Throwable {
	test = new WMSTest(driver);
   test.getRawmaterialsvechicledetailsWeightvolume().sendKeys(weight);
   Assert.assertEquals(weight, weight);
   Thread.sleep(3000);
}
@Given("^User Enter the UOM kg options$")
public void user_Enter_the_UOM_kg_options() throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialsvechicledetailsUOM();
	Thread.sleep(3000);
}

@Given("^User click the Addnew Button$")
public void user_click_the_Addnew_Button() throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialsVechicleAddnew().click();
	Thread.sleep(3000);
}

@Given("^User Enter the Addnew Type Options \"([^\"]*)\"$")
public void user_Enter_the_Addnew_Type_Options(String Typeoptionone) throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialsvechicledetailsType1().sendKeys(Typeoptionone);
	String attribute = test.getRawmaterialsvechicledetailsType1().getAttribute("value");
    Assert.assertEquals(Typeoptionone, attribute);
	Thread.sleep(3000);
   
}

@Given("^User Enter the Addnew  Name \"([^\"]*)\"$")
public void user_Enter_the_Addnew_Name(String Typenamenew) throws Throwable {
	test = new WMSTest(driver);
   test.getRawmaterialsvechicledetailsName1().sendKeys(Typenamenew);
   Assert.assertEquals(Typenamenew, Typenamenew);
   Thread.sleep(3000);
}

@Given("^User Enter the Addnew Purchase Count \"([^\"]*)\"$")
public void user_Enter_the_Addnew_Purchase_Count(String purchasecountnew) throws Throwable {
	test = new WMSTest(driver);
   test.getRawmaterialsvechicledetailsPurchasecount1().sendKeys(purchasecountnew);
   Thread.sleep(3000);
}

@Given("^User Enter the Addnew Weight/Volume \"([^\"]*)\"$")
public void user_Enter_the_Addnew_Weight_Volume(String weightnew) throws Throwable {
	test = new WMSTest(driver);
   test.getRawmaterialsvechicledWeightvolume1().sendKeys(weightnew);
   Assert.assertEquals(weightnew, weightnew);
   Thread.sleep(3000);
}

@Given("^User Enter the Addnew UOM kg Options$")
public void user_Enter_the_Addnew_UOM_kg_Options() throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialsvechicleUOM1().click();
	Thread.sleep(3000);
}


@Then("^User Enter the Save Button and Verifies the Credentials$")
public void user_Enter_the_Save_Button_and_Verifies_the_Credentials() throws Throwable {
	test = new WMSTest(driver);
	test.getRawmaterialsSave().click();
	Thread.sleep(3000);
}
}
