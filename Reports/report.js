$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WMScucumber.feature");
formatter.feature({
  "line": 1,
  "name": "WareHouseManagement(WMS) Application is under test",
  "description": "",
  "id": "warehousemanagement(wms)-application-is-under-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User Verifies the Login Functionality of the Application",
  "description": "",
  "id": "warehousemanagement(wms)-application-is-under-test;user-verifies-the-login-functionality-of-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User hit the WMS application",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter the Username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Enter the Password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Click the Login Functionality",
  "keyword": "Then "
});
formatter.match({
  "location": "WmsStepdefinition.user_Launch_the_Chrome_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WmsStepdefinition.user_hit_the_WMS_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WmsStepdefinition.user_Enter_the_Username()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WmsStepdefinition.user_Enter_the_Password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WmsStepdefinition.user_Click_the_Login_Functionality()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "User Verifies the Purchase Menu",
  "description": "",
  "id": "warehousemanagement(wms)-application-is-under-test;user-verifies-the-purchase-menu",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@purchasemenu"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User Click the Purchase Menu",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User Click the Raw Materials Goods Recepit Notes",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User Click the Add New Button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User Enter the Farmer Supplier Details Add New Menu",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Click the Check box Farmer",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Contact Details Enter the Name \"\u003cName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User Contact Details Enter the code \"\u003ccode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Contact Details Enter the Address Line one \"\u003cAddresslineone\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Contact Details Enter the  Address Line two \"\u003cAddresslinetwo\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User Contact Details Enter the City/Town \"\u003ccity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Contact Details Enter the Postal code \"\u003cpostalcode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Contact Details Enter the Landline code \"\u003clandlinecode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Contact Details Enter the Landline Number \"\u003clandlinenumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User Contact Details Enter the Mobile Number \"\u003cmobilenumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Contact Details Enter the EmailID \"\u003cemailid\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User Contact Details Enter the GSTIN number \"\u003cgstin\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User Contact Details  Click the Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User Verifies the credentials",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "warehousemanagement(wms)-application-is-under-test;user-verifies-the-purchase-menu;",
  "rows": [
    {
      "cells": [
        "Name",
        "code",
        "Addresslineone",
        "Addresslinetwo",
        "city",
        "postalcode",
        "landlinecode",
        "landlinenumber",
        "mobilenumber",
        "emailid",
        "gstin"
      ],
      "line": 34,
      "id": "warehousemanagement(wms)-application-is-under-test;user-verifies-the-purchase-menu;;1"
    },
    {
      "cells": [
        "Test123",
        "F1543",
        "Testaddress",
        "Testaddress2",
        "Erode Tamilnadu India",
        "638402",
        "044",
        "4364325",
        "7474747747",
        "testsys@gmail.com",
        "35agd32548421s"
      ],
      "line": 35,
      "id": "warehousemanagement(wms)-application-is-under-test;user-verifies-the-purchase-menu;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "User Verifies the Purchase Menu",
  "description": "",
  "id": "warehousemanagement(wms)-application-is-under-test;user-verifies-the-purchase-menu;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@purchasemenu"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User Click the Purchase Menu",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User Click the Raw Materials Goods Recepit Notes",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User Click the Add New Button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User Enter the Farmer Supplier Details Add New Menu",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Click the Check box Farmer",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Contact Details Enter the Name \"Test123\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User Contact Details Enter the code \"F1543\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Contact Details Enter the Address Line one \"Testaddress\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Contact Details Enter the  Address Line two \"Testaddress2\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User Contact Details Enter the City/Town \"Erode Tamilnadu India\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Contact Details Enter the Postal code \"638402\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Contact Details Enter the Landline code \"044\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Contact Details Enter the Landline Number \"4364325\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User Contact Details Enter the Mobile Number \"7474747747\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Contact Details Enter the EmailID \"testsys@gmail.com\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User Contact Details Enter the GSTIN number \"35agd32548421s\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User Contact Details  Click the Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User Verifies the credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "WmsStepdefinition.user_Click_the_Purchase_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WmsStepdefinition.user_Click_the_Raw_Materials_Goods_Recepit_Notes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WmsStepdefinition.user_Click_the_Add_New_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WmsStepdefinition.user_Enter_the_Farmer_Supplier_Details_Add_New_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WmsStepdefinition.user_Click_the_Check_box_Farmer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test123",
      "offset": 37
    }
  ],
  "location": "WmsStepdefinition.user_Contact_Details_Enter_the_Name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "F1543",
      "offset": 37
    }
  ],
  "location": "WmsStepdefinition.user_Contact_Details_Enter_the_code(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Testaddress",
      "offset": 49
    }
  ],
  "location": "WmsStepdefinition.user_Contact_Details_Enter_the_Address_Line_one(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Testaddress2",
      "offset": 50
    }
  ],
  "location": "WmsStepdefinition.user_Contact_Details_Enter_the_Address_Line_two(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Erode Tamilnadu India",
      "offset": 42
    }
  ],
  "location": "WmsStepdefinition.user_Contact_Details_Enter_the_City_Town(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "638402",
      "offset": 44
    }
  ],
  "location": "WmsStepdefinition.user_Contact_Details_Enter_the_Postal_code(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "044",
      "offset": 46
    }
  ],
  "location": "WmsStepdefinition.user_Contact_Details_Enter_the_Landline_code(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4364325",
      "offset": 48
    }
  ],
  "location": "WmsStepdefinition.user_Contact_Details_Enter_the_Landline_Number(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "7474747747",
      "offset": 46
    }
  ],
  "location": "WmsStepdefinition.user_Contact_Details_Enter_the_Mobile_Number(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "testsys@gmail.com",
      "offset": 40
    }
  ],
  "location": "WmsStepdefinition.user_Contact_Details_Enter_the_EmailID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "35agd32548421s",
      "offset": 45
    }
  ],
  "location": "WmsStepdefinition.user_Contact_Details_Enter_the_GSTIN_number(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WmsStepdefinition.user_Contact_Details_Click_the_Next_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WmsStepdefinition.user_Verifies_the_credentials()"
});
formatter.result({
  "status": "skipped"
});
});