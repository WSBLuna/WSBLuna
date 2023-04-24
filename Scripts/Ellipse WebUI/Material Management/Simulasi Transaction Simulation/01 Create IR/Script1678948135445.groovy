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

int A

A = 26

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ellipse-demo.ems-elltst.ems.co.id/html/ui#!/ome')

WebUI.setText(findTestObject('Object Repository/Page_/input_Username_username'), GlobalVariable.User)

WebUI.click(findTestObject('Object Repository/Page_/div_Login'))

WebUI.setText(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), 'mserql')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_01 Create IR_MSERQL_Authorizer By'), 
    '0000000171')

WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_01 Create IR_MSERQL_Authorizer Position'), 
    '11')

WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_01 Create IR_MSERQL_Requester Position'), 
    '19')

WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/span_01 Create IR_MSERQL _Warehouse'))

WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/div_MAIN - MAIN WAREHOUSE'))

WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/span_01 Create IR_MSERQL_Add'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input__01 Create IR_MSERQL_Add_Stock Code'), 
    Stockcode)

WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_01 Create IR_MSERQL_Add_Quantity'), 
    Quantity)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_01 Create IR_MSERQL_Add_Warehouse'), 
    'MAIN')

WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_01 Create IR_MSERQL_Add_District'), 
    'SERV')

WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_01 Create IR_MSERQL_Add_WO'), '26')

WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/span_01 Create IR_Add_OK'))

WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/li_General'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_01 Create IR_MSERQL_Transaction Type'), 
    'UM')

WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/li_Costing'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/span_01 Create IR_MSERQL_District'))

WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/div_SERV - PT DEMO SERVICES'))

WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_01 Create IR_MSERQL_WO'), '' + A)

WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/span_01 Create IR_MSERQL_Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/span_01 Create IR_MSERQL_Confirm'))

