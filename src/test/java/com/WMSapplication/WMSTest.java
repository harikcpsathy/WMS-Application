package com.WMSapplication;

import java.util.List;

import org.hamcrest.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WMSTest {

	public static WebDriver driver;
	public WMSTest(WebDriver Idriver){
		this.driver = Idriver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement Emailid;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	private WebElement SigninPassword;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]")
	private WebElement Signinbutton;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[2]")
	private WebElement purchase;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/span[1]/a[1]")
	private WebElement GoodsReceiptnotes;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[3]/input[1]")
	private WebElement RawmaterialsGRNAddnew;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[2]/a[1]")
	private WebElement farmersupplierAddnew;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[1]/span[1]/label[1]")
	private WebElement farmerradio1;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")
	private WebElement contactdetailsname;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement contactdetailscode;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/div[3]/div[1]/input[1]")
	private WebElement contactdetailsaddressline1;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/div[4]/div[1]/input[1]")
	private WebElement contactdetailsaddressline2;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[1]/input[1]")
    private WebElement contactdetailscountry;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[1]/input[1]")
	private WebElement contactdetailsstate;
	
	@FindBy(css = "#ctl00_cphBody_addfarmerpopupcontrol_AutoSuggestFarmerOrVendorCity")
	private WebElement contactdetailscitytown;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/div[8]/div[1]/input[1]")
	private WebElement contactdetailspostalcode;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
	private WebElement contactdetailsLandlinecode;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/div[1]/div[2]/div[1]/div[1]/div[3]/input[1]")
	private WebElement contactdetailsLandlinenumber;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]")
	private WebElement contactdetailsmobileno;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	private WebElement contactdetailsemailid;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/div[1]/div[2]/div[4]/div[1]/input[1]")
	private WebElement contactdetailsGSTIN;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[1]/input[1]")
	private WebElement contactdetailsnextbutton;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[2]/div[1]/div[5]/div[1]/div[1]/div[3]/div[1]/input[1]")
	private WebElement farmdetailsfarmname;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[2]/div[1]/div[5]/div[1]/div[1]/div[4]/div[1]/input[1]")
	private WebElement farmdetailsCAARegno;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[2]/div[1]/div[5]/div[1]/div[1]/div[5]/div[1]/input[1]")
	private WebElement farmdetailspoundcount;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[2]/input[2]")
	private WebElement farmdetailsnext;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[3]/div[1]/div[3]/div[2]/span[1]/label[1]")
	private WebElement radiobuttonnational;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[3]/div[1]/div[2]/a[1]")
	private WebElement addbankdetails;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[3]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/input[1]")
	private WebElement bankdetailsaccountname;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[3]/div[1]/div[3]/div[3]/div[1]/div[2]/div[1]/input[1]")
	private WebElement bankdetailsaccountnumber;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[3]/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/input[1]")
	private WebElement bankdetailsbankname;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[3]/div[1]/div[3]/div[3]/div[1]/div[4]/div[1]/div[1]/input[1]")
	private WebElement bankdetailsbranchname;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[3]/div[1]/div[3]/div[3]/div[1]/div[7]/div[1]/ul[1]/li[1]/input[1]")
	private WebElement bankdetailscitytown;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[3]/div[2]/div[1]/fieldset[3]/div[2]/input[1]")
	private WebElement bankdetailssave;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")
	private WebElement Rawmaterialsname;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/select[1]")
	private WebElement Rawmaterialscityname;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement Rawmaterialslotno;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement Rawmaterialsdate;
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[5]/td[4]/a[1]")
	private WebElement Rawmaterialswebtabledate;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[1]/div[4]/div[1]/h3[1]")
	private WebElement Rawmaterialsvechicledetails;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[1]/div[4]/div[2]/div[3]/a[1]")
	private WebElement RawmaterialsVechicleAddnew;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement Rawmaterialsvechiclenumber;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")
	private WebElement Rawmaterialsgateinwardnumber;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/select[1]")
	private WebElement RawmaterialsvechicledetailsType;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[1]/input[1]")
	private WebElement RawmaterialsvechicledetailsName;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[4]/input[1]")
	private WebElement RawmaterialsvechicledetailsPurchasecount;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[5]/input[1]")
	private WebElement RawmaterialsvechicledetailsWeightvolume;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[6]/select[1]")
	private WebElement RawmaterialsvechicledetailsUOM;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[3]/a[1]")
	private WebElement RawmaterialslastAddnew;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[2]/div[2]/select[1]")
	private WebElement RawmaterialsvechicledetailsType1;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[2]/div[3]/ul[1]/li[1]/ul[1]/li[1]/input[1]")
	private WebElement RawmaterialsvechicledetailsName1;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[2]/div[5]/input[1]")
	private WebElement RawmaterialsvechicledetailsPurchasecount1;
	
	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[2]/div[6]/input[1]")
	private WebElement RawmaterialsvechicledWeightvolume1;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[2]/div[7]/select[1]")
	private WebElement RawmaterialsvechicleUOM1;
	
    @FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[6]/div[1]/input[1]")	
    private WebElement RawmaterialsSave;
    
    @FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[1]") 
    private WebElement RawmaterialsHeading;
    
        
    public WebElement getRawmaterialswebtabledate() {
		return Rawmaterialswebtabledate;
	}

	public void setRawmaterialswebtabledate(WebElement rawmaterialswebtabledate) {
		Rawmaterialswebtabledate = rawmaterialswebtabledate;
	}
  
	
	public WebElement getRawmaterialsHeading() {
		return RawmaterialsHeading;
	}

	public void setRawmaterialsHeading(WebElement rawmaterialsHeading) {
		RawmaterialsHeading = rawmaterialsHeading;
	}


	public WebElement getRawmaterialsVechicleAddnew() {
		return RawmaterialsVechicleAddnew;
	}

	public void setRawmaterialsVechicleAddnew(WebElement rawmaterialsVechicleAddnew) {
		RawmaterialsVechicleAddnew = rawmaterialsVechicleAddnew;
	}
	
	public WebElement getRawmaterialsSave() {
		return RawmaterialsSave;
	}

	public void setRawmaterialsSave(WebElement rawmaterialsSave) {
		RawmaterialsSave = rawmaterialsSave;
	}

	public WebElement getEmailid() {
		return Emailid;
	}

	public void setEmailid(WebElement emailid) {
		Emailid = emailid;
	}

	public WebElement getSigninPassword() {
		return SigninPassword;
	}

	public void setSigninPassword(WebElement signinPassword) {
		SigninPassword = signinPassword;
	}

	public WebElement getSigninbutton() {
		return Signinbutton;
	}

	public void setSigninbutton(WebElement signinbutton) {
		Signinbutton = signinbutton;
	}

	public WebElement getPurchase() {
		return purchase;
	}

	public void setPurchase(WebElement purchase) {
		this.purchase = purchase;
	}

	public WebElement getGoodsReceiptnotes() {
		return GoodsReceiptnotes;
	}

	public void setGoodsReceiptnotes(WebElement goodsReceiptnotes) {
		GoodsReceiptnotes = goodsReceiptnotes;
	}

	public WebElement getRawmaterialsGRNAddnew() {
		return RawmaterialsGRNAddnew;
	}

	public void setRawmaterialsGRNAddnew(WebElement rawmaterialsGRNAddnew) {
		RawmaterialsGRNAddnew = rawmaterialsGRNAddnew;
	}

	public WebElement getFarmersupplierAddnew() {
		return farmersupplierAddnew;
	}

	public void setFarmersupplierAddnew(WebElement farmersupplierAddnew) {
		this.farmersupplierAddnew = farmersupplierAddnew;
	}

	public WebElement getFarmerradio1() {
		return farmerradio1;
	}

	public void setFarmerradio1(WebElement farmerradio1) {
		this.farmerradio1 = farmerradio1;
	}

	public WebElement getContactdetailsname() {
		return contactdetailsname;
	}

	public void setContactdetailsname(WebElement contactdetailsname) {
		this.contactdetailsname = contactdetailsname;
	}

	public WebElement getContactdetailscode() {
		return contactdetailscode;
	}

	public void setContactdetailscode(WebElement contactdetailscode) {
		this.contactdetailscode = contactdetailscode;
	}

	public WebElement getContactdetailsaddressline1() {
		return contactdetailsaddressline1;
	}

	public void setContactdetailsaddressline1(WebElement contactdetailsaddressline1) {
		this.contactdetailsaddressline1 = contactdetailsaddressline1;
	}

	public WebElement getContactdetailsaddressline2() {
		return contactdetailsaddressline2;
	}

	public void setContactdetailsaddressline2(WebElement contactdetailsaddressline2) {
		this.contactdetailsaddressline2 = contactdetailsaddressline2;
	}

	public WebElement getContactdetailscitytown() {
		return contactdetailscitytown;
	}

	public void setContactdetailscitytown(WebElement contactdetailscitytown) {
		this.contactdetailscitytown = contactdetailscitytown;
	}

	public WebElement getContactdetailspostalcode() {
		return contactdetailspostalcode;
	}

	public void setContactdetailspostalcode(WebElement contactdetailspostalcode) {
		this.contactdetailspostalcode = contactdetailspostalcode;
	}

	public WebElement getContactdetailsLandlinecode() {
		return contactdetailsLandlinecode;
	}

	public void setContactdetailsLandlinecode(WebElement contactdetailsLandlinecode) {
		this.contactdetailsLandlinecode = contactdetailsLandlinecode;
	}

	public WebElement getContactdetailsLandlinenumber() {
		return contactdetailsLandlinenumber;
	}

	public void setContactdetailsLandlinenumber(WebElement contactdetailsLandlinenumber) {
		this.contactdetailsLandlinenumber = contactdetailsLandlinenumber;
	}

	public WebElement getContactdetailsmobileno() {
		return contactdetailsmobileno;
	}

	public void setContactdetailsmobileno(WebElement contactdetailsmobileno) {
		this.contactdetailsmobileno = contactdetailsmobileno;
	}

	public WebElement getContactdetailsemailid() {
		return contactdetailsemailid;
	}

	public void setContactdetailsemailid(WebElement contactdetailsemailid) {
		this.contactdetailsemailid = contactdetailsemailid;
	}

	public WebElement getContactdetailsGSTIN() {
		return contactdetailsGSTIN;
	}

	public void setContactdetailsGSTIN(WebElement contactdetailsGSTIN) {
		this.contactdetailsGSTIN = contactdetailsGSTIN;
	}

	public WebElement getContactdetailsnextbutton() {
		return contactdetailsnextbutton;
	}

	public void setContactdetailsnextbutton(WebElement contactdetailsnextbutton) {
		this.contactdetailsnextbutton = contactdetailsnextbutton;
	}

	public WebElement getFarmdetailsfarmname() {
		return farmdetailsfarmname;
	}

	public void setFarmdetailsfarmname(WebElement farmdetailsfarmname) {
		this.farmdetailsfarmname = farmdetailsfarmname;
	}

	public WebElement getFarmdetailsCAARegno() {
		return farmdetailsCAARegno;
	}

	public void setFarmdetailsCAARegno(WebElement farmdetailsCAARegno) {
		this.farmdetailsCAARegno = farmdetailsCAARegno;
	}

	public WebElement getFarmdetailspoundcount() {
		return farmdetailspoundcount;
	}

	public void setFarmdetailspoundcount(WebElement farmdetailspoundcount) {
		this.farmdetailspoundcount = farmdetailspoundcount;
	}

	public WebElement getFarmdetailsnext() {
		return farmdetailsnext;
	}

	public void setFarmdetailsnext(WebElement farmdetailsnext) {
		this.farmdetailsnext = farmdetailsnext;
	}

	public WebElement getRadiobuttonnational() {
		return radiobuttonnational;
	}

	public void setRadiobuttonnational(WebElement radiobuttonnational) {
		this.radiobuttonnational = radiobuttonnational;
	}

	public WebElement getAddbankdetails() {
		return addbankdetails;
	}

	public void setAddbankdetails(WebElement addbankdetails) {
		this.addbankdetails = addbankdetails;
	}

	public WebElement getBankdetailsaccountname() {
		return bankdetailsaccountname;
	}

	public void setBankdetailsaccountname(WebElement bankdetailsaccountname) {
		this.bankdetailsaccountname = bankdetailsaccountname;
	}

	public WebElement getBankdetailsaccountnumber() {
		return bankdetailsaccountnumber;
	}

	public void setBankdetailsaccountnumber(WebElement bankdetailsaccountnumber) {
		this.bankdetailsaccountnumber = bankdetailsaccountnumber;
	}

	public WebElement getBankdetailsbankname() {
		return bankdetailsbankname;
	}

	public void setBankdetailsbankname(WebElement bankdetailsbankname) {
		this.bankdetailsbankname = bankdetailsbankname;
	}

	public WebElement getBankdetailsbranchname() {
		return bankdetailsbranchname;
	}

	public void setBankdetailsbranchname(WebElement bankdetailsbranchname) {
		this.bankdetailsbranchname = bankdetailsbranchname;
	}

	public WebElement getBankdetailscitytown() {
		return bankdetailscitytown;
	}

	public void setBankdetailscitytown(WebElement bankdetailscitytown) {
		this.bankdetailscitytown = bankdetailscitytown;
	}

	public WebElement getBankdetailssave() {
		return bankdetailssave;
	}

	public void setBankdetailssave(WebElement bankdetailssave) {
		this.bankdetailssave = bankdetailssave;
	}
	
	public WebElement getRawmaterialsname() {
		return Rawmaterialsname;
	}

	public void setRawmaterialsname(WebElement rawmaterialsname) {
		Rawmaterialsname = rawmaterialsname;
	}

	public WebElement getRawmaterialscityname() {
		return Rawmaterialscityname;
	}

	public void setRawmaterialscityname(WebElement rawmaterialscityname) {
		Rawmaterialscityname = rawmaterialscityname;
	}

	public WebElement getRawmaterialslotno() {
		return Rawmaterialslotno;
	}

	public void setRawmaterialslotno(WebElement rawmaterialslotno) {
		Rawmaterialslotno = rawmaterialslotno;
	}

	public WebElement getRawmaterialsdate() {
		return Rawmaterialsdate;
	}

	public void setRawmaterialsdate(WebElement rawmaterialsdate) {
		Rawmaterialsdate = rawmaterialsdate;
	}

	public WebElement getRawmaterialsvechicledetails() {
		return Rawmaterialsvechicledetails;
	}

	public void setRawmaterialsvechicledetails(WebElement rawmaterialsvechicledetails) {
		Rawmaterialsvechicledetails = rawmaterialsvechicledetails;
	}

	public WebElement getRawmaterialsvechiclenumber() {
		return Rawmaterialsvechiclenumber;
	}

	public void setRawmaterialsvechiclenumber(WebElement rawmaterialsvechiclenumber) {
		Rawmaterialsvechiclenumber = rawmaterialsvechiclenumber;
	}

	public WebElement getRawmaterialsgateinwardnumber() {
		return Rawmaterialsgateinwardnumber;
	}

	public void setRawmaterialsgateinwardnumber(WebElement rawmaterialsgateinwardnumber) {
		Rawmaterialsgateinwardnumber = rawmaterialsgateinwardnumber;
	}

	public WebElement getRawmaterialsvechicledetailsType() {
		return RawmaterialsvechicledetailsType;
	}

	public void setRawmaterialsvechicledetailsType(WebElement rawmaterialsvechicledetailsType) {
		RawmaterialsvechicledetailsType = rawmaterialsvechicledetailsType;
	}

	public WebElement getRawmaterialsvechicledetailsName() {
		return RawmaterialsvechicledetailsName;
	}

	public void setRawmaterialsvechicledetailsName(WebElement rawmaterialsvechicledetailsName) {
		RawmaterialsvechicledetailsName = rawmaterialsvechicledetailsName;
	}

	public WebElement getRawmaterialsvechicledetailsPurchasecount() {
		return RawmaterialsvechicledetailsPurchasecount;
	}

	public void setRawmaterialsvechicledetailsPurchasecount(WebElement rawmaterialsvechicledetailsPurchasecount) {
		RawmaterialsvechicledetailsPurchasecount = rawmaterialsvechicledetailsPurchasecount;
	}

	public WebElement getRawmaterialsvechicledetailsWeightvolume() {
		return RawmaterialsvechicledetailsWeightvolume;
	}

	public void setRawmaterialsvechicledetailsWeightvolume(WebElement rawmaterialsvechicledetailsWeightvolume) {
		RawmaterialsvechicledetailsWeightvolume = rawmaterialsvechicledetailsWeightvolume;
	}

	public WebElement getRawmaterialsvechicledetailsUOM() {
		return RawmaterialsvechicledetailsUOM;
	}

	public void setRawmaterialsvechicledetailsUOM(WebElement rawmaterialsvechicledetailsUOM) {
		RawmaterialsvechicledetailsUOM = rawmaterialsvechicledetailsUOM;
	}

	public WebElement getRawmaterialslastAddnew() {
		return RawmaterialslastAddnew;
	}

	public void setRawmaterialslastAddnew(WebElement rawmaterialslastAddnew) {
		RawmaterialslastAddnew = rawmaterialslastAddnew;
	}

	public WebElement getRawmaterialsvechicledetailsType1() {
		return RawmaterialsvechicledetailsType1;
	}

	public void setRawmaterialsvechicledetailsType1(WebElement rawmaterialsvechicledetailsType1) {
		RawmaterialsvechicledetailsType1 = rawmaterialsvechicledetailsType1;
	}

	public WebElement getRawmaterialsvechicledetailsName1() {
		return RawmaterialsvechicledetailsName1;
	}

	public void setRawmaterialsvechicledetailsName1(WebElement rawmaterialsvechicledetailsName1) {
		RawmaterialsvechicledetailsName1 = rawmaterialsvechicledetailsName1;
	}

	public WebElement getRawmaterialsvechicledetailsPurchasecount1() {
		return RawmaterialsvechicledetailsPurchasecount1;
	}

	public void setRawmaterialsvechicledetailsPurchasecount1(WebElement rawmaterialsvechicledetailsPurchasecount1) {
		RawmaterialsvechicledetailsPurchasecount1 = rawmaterialsvechicledetailsPurchasecount1;
	}

	public WebElement getRawmaterialsvechicledWeightvolume1() {
		return RawmaterialsvechicledWeightvolume1;
	}

	public void setRawmaterialsvechicledWeightvolume1(WebElement rawmaterialsvechicledWeightvolume1) {
		RawmaterialsvechicledWeightvolume1 = rawmaterialsvechicledWeightvolume1;
	}

	public WebElement getRawmaterialsvechicleUOM1() {
		return RawmaterialsvechicleUOM1;
	}

	public void setRawmaterialsvechicleUOM1(WebElement rawmaterialsvechicleUOM1) {
		RawmaterialsvechicleUOM1 = rawmaterialsvechicleUOM1;
	}

	public WebElement getContactdetailscountry() {
		return contactdetailscountry;
	}

	public void setContactdetailscountry(WebElement contactdetailscountry) {
		this.contactdetailscountry = contactdetailscountry;
	}

	public WebElement getContactdetailsstate() {
		return contactdetailsstate;
	}

	public void setContactdetailsstate(WebElement contactdetailsstate) {
		this.contactdetailsstate = contactdetailsstate;
	}

				
}
