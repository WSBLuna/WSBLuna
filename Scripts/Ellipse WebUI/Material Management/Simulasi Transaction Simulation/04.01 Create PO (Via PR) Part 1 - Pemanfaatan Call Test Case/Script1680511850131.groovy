import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ellipse-demo.ems-elltst.ems.co.id/html/ui#!/ome')

WebUI.setText(findTestObject('Object Repository/Page_/input_Username_username'), '0000000027')

WebUI.click(findTestObject('Object Repository/Page_/div_Login'))

WebUI.setText(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), 'mso230')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_MSM230A - MAINTAIN PURCHASE REQUISITIONS/input_04 Create PO_MSO230_Purchase Requisition'), 
    PONumber)

WebUI.click(findTestObject('Object Repository/Page_MSM230A - MAINTAIN PURCHASE REQUISITIONS/span_04 Create PO_MSO230_Submit'))

WebUI.click(findTestObject('Object Repository/Page_/04 Create PO_MSO230_button__v-datefield-button'))

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_ Date_31'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Purchasing Instruction'), 
    2)

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Purchasing Instruction'))

WebUI.click(findTestObject('Object Repository/Page_/div_N - No'))

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Costing Allocation'))

WebUI.click(findTestObject('Object Repository/Page_/div_04 Create PO_MSO230_Costing Allocation_Y - Yes_1'))

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Submit2'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_/input_Forecast To Go_COST_CEN_ACCT1I'), 2)

WebUI.setText(findTestObject('Object Repository/Page_/input_Forecast To Go_COST_CEN_ACCT1I'), '20001')

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Submit2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Submit2'))

WebUI.delay(2)

if (POType != 'G') {
    WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Type'), POType)
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Type'), 10) != 'S') {
    WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Quantity'), Quantity)
}

WebUI.click(findTestObject('Object Repository/Page_/span__04 Create PO_MSO230_UOM'))

WebUI.click(findTestObject('Object Repository/Page_/div_04 Create PO_MSO230_EA - Each'))

WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Estimated Price'), '')

WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Estimated Price'), Anggaran)

WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Description'), 'Jasa Konsultasi')

WebUI.click(findTestObject('Object Repository/Page_/div_Purchasing Terms'))

WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Supplier'), Supplier)

WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Gross Price'), Anggaran)

WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Assign to Purchase Officer'), '0000000027')

WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Price Code'), 'RT')

WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Lead Time'), '7')

WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Currency'), 'IDR')

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Delivery'))

WebUI.click(findTestObject('Object Repository/Page_/div_MW - Main Warehouse'))

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_VAT'))

WebUI.click(findTestObject('Object Repository/Page_/div_V1 - VAT-10'))

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Freight'))

WebUI.click(findTestObject('Object Repository/Page_/div_FI - Free into Store'))

WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSO230_Warehouse'), 'MAIN')

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Submit2'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Confirm'), 2)

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Confirm'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_Log Out'))

WebUI.click(findTestObject('Object Repository/Page_/span_Logout'))

