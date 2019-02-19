Feature: WareHouseManagement(WMS) Application is under test

@login
Scenario Outline: User Verifies the Login Functionality of the Application
Given User Launch the Chrome Browser
When User hit the WMS application
And User Enter the Username"<Username>"
And User Enter the Password "<Password>"
And User Click the Login Functionality
Then User verify the userName "Sysmixadmin" in the header

Examples:
|Username   |Password   |
|sysmixadmin|SysmixAdmin|

@Purchasemenu
Scenario Outline: User Verifies the Purchase Menu
Given User Click the Purchase Menu
Given User Click the Raw Materials Goods Recepit Notes
When User Click the Add New Button
And User Enter the Farmer Supplier Details Add New Menu
And User Click the Check box Farmer
And User Contact Details Enter the Name "<Name>"
And User Contact Details Enter the code "<code>"
And User Contact Details Enter the Address Line one "<Addresslineone>"
And User Contact Details Enter the  Address Line two "<Addresslinetwo>"
And User Contact Details Enter the City/Town "<city>"
And User Contact Details Enter the Postal code "<postalcode>"
And User Contact Details Enter the Landline code "<landlinecode>"
And User Contact Details Enter the Landline Number "<landlinenumber>"
And User Contact Details Enter the Mobile Number "<mobilenumber>"
And User Contact Details Enter the EmailID "<emailid>"
And User Contact Details Enter the GSTIN number "<gstin>"
Then User Contact Details Click the Next Button and Verifies the credentials

Examples:
|Name   |code |Addresslineone|Addresslinetwo|city                 |postalcode|landlinecode|landlinenumber|mobilenumber|emailid          |gstin         |
|Test123|F1543|Testaddress   |Testaddress2  |Erode Tamilnadu India|638402    |044		  |4364325       |7474747747  |testsys@gmail.com|35agd32548421s|

@Farmdetails
Scenario Outline: User Verifies the Farm Details 
And User Enter the Farm Name "<Farmname>"
And User Enter the CAA Reg No "<CAAregno>"
And User Enter the Pound Count "<PoundCount>"
Then User Click the Farm Next Button and Verifies the Credentials

Examples:
|Farmname|CAAregno |PoundCount |
|Webtest |1414     |05         |

@Bankdetails
Scenario Outline: User Verifies the Bank Details
Given User click the Add Bank Button
And User Click the Radio button National
And User Enter the Account Name "<Bankaccountname>"
And User Enter the Account No "<Bankaccountno>"
And User Enter the Bank Name "<Bankname>"
And User Enter the Branch Name "<Branchname>"
And User Enter the Bank City/Town "<Bankcity>"
Then User Click the Save Button and Verifies the Credentials

Examples:
|Bankaccountname|Bankaccountno|Bankname       |Branchname|Bankcity               |
|Testers        |124512451    |city union bank|chennai   |Chennai TamilNadu India|

@RawmaterialsGRN
Scenario Outline: User Verifies the Lot/Raw materials Details
Given User Verify's the name
And User Click the city/town
And User Enter the Lot Number "<Lotnumber>"
And User Enter the GRN Date
And User Click the Vechicle Details 
And User Click the Vechicle Details Addnew
And User Enter the Vechicle Number "<Vechiclenumber>"
And User Enter the Gate Inward Number "<Gateinwardnumber>"
And User Enter the Type options "<Typeoption>"
And User Enter the Material Name "<Typename>"
And User Enter the Purchase Count
And User Enter the Weight/Volume "<weight>"
And User Enter the UOM kg options 
And User click the Addnew Button
And User Enter the Addnew Type Options "<Typeoptionone>"
And User Enter the Addnew  Name "<Typenamenew>"
And User Enter the Addnew Purchase Count "<purchasecountnew>"
And User Enter the Addnew Weight/Volume "<weightnew>"
And User Enter the Addnew UOM kg Options
Then User Enter the Save Button and Verifies the Credentials

Examples:
|Lotnumber|Vechiclenumber|Gateinwardnumber|Typeoption|Typename|weight|Typeoptionone|Typenamenew|purchasecountnew|weightnew|
|1245     |TN01D1111     |124             |Fish      |Bonito  |5     |Shrimp       |Vannamei   |5.0             |5.0      |

@RawmaterialFinalizedrates
Scenario Outline: User Verify's the Finalized Rates
Given User Click the Purchase Menu
Then User Click the Finalized Rates
Then User Verify the Finalized Rate H/ON Grades to click the View button
And User Click the Finalized Rate Finalized Price Update Price
And User Click the Finalized Rate Edit option
And User Enter the Finalized Rate Purchase Price "<FRpurchaseprice>"
And user Enter the Finalized Rate Discount "<FRDiscount>"
Then User Enter the Save Button and Verifies the Credentials


Examples:
|FRpurchaseprice|FRDiscount|
|5000           |500       |


@RawmaterialItemregistered
Scenario Outline: User Verify's the Item Registered
Given User Enter the Item Registered Options "<IRegisteredOptions>"
And User Enter the Item Registered Type "<IRType>"
And User Click the Item Registered From Date
And User Click the Item Registered To Date
And User Click the Go Button
And User Enter the Item Registered Options One "<IROptionsOne>"
And User Enter the Item Registered Type One "<IRTypeOne>"
And User Click the Item Registered From Date One
And User Click the Item Registered To Date One
And User Click the Go Button

Examples:
|IRegisteredOptions|IRType|IROptionsOne|IRTypeOne|


@RawmaterialStocksummary
Scenario Outline: User Verify's the Stock Summary
Given User Enter the Stock Summary Options "<SSOptions>"
And User Enter the Stock Summary Type "<SSType>"
And User Click the Stock Summary From Date
And User Click the Stock Summary To Date
And User Click the Go Button
And User Enter the Stock Summary Options One "<SSOptionsOne>"
And User Enter the Stock Summary Type One "<SSTypeOne>"
And User Click the Stock Summary From Date One
And User Click the Stock Summary To Date One
And User Click the Go Button

Examples:
|SSOptions|SSType|SSOptionsOne|SSTypeOne|


@RawmaterialInstock
Scenario: User Verify's the InStock
Given User Verify's and Analysis the Instock
And User Enter the Search Options
Then User Click the Instock GRNID


