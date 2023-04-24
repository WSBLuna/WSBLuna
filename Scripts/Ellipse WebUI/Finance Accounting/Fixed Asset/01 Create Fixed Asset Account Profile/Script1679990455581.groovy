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

WebUI.setText(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), 'mso683')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_MSM683A - MAINTAIN FIXED ASSET ACCOUNT_25b7f7/input_01 Create Fixed Asset Account Profile_MSO683_Account Profile'), 
    Account Profile Code)

WebUI.click(findTestObject('Object Repository/Page_MSM683A - MAINTAIN FIXED ASSET ACCOUNT_25b7f7/span_01 Create Fixed Asset Account Profile_MSO683_Submit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Fixed Asset Account Profile_MSO683_Costing District'), 
    Costing District)

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Fixed Asset Account Profile_MSO683_Account Code1'), 
    Account Code 1)

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Fixed Asset Account Profile_MSO683_Account Code2'), 
    Account Code 2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Fixed Asset Account Profile_MSO683_Submit2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Fixed Asset Account Profile_MSO683_Submit2'))

