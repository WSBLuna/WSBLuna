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

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_Username_username'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), 'mse389')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_MSE389 - Search Valuations/span_New'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_MSE389 - Create Valuations/input__contractNo'), 'ctyn02')

WebUI.setText(findTestObject('Object Repository/Page_MSE389 - Create Valuations/input_Claim Amount_cntrctrRefAmt'), '5,000,000.00')

WebUI.click(findTestObject('Object Repository/Page_MSE389 - Create Valuations/button__v-datefield-button'))

WebUI.click(findTestObject('Object Repository/Page_MSE389 - Create Valuations/span_28'))

WebUI.click(findTestObject('Object Repository/Page_MSE389 - Create Valuations/span_Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSE389 - Update Valuations/li_Contract Items'))

WebUI.click(findTestObject('Object Repository/Page_MSE389 - Update Valuations/div_'))

WebUI.setText(findTestObject('Object Repository/Page_MSE389 - Update Valuations/input_Calc Method_v-filterselect-input'), 
    'Value')

WebUI.sendKeys(findTestObject('Page_MSE389 - Update Valuations/input_Calc Method_v-filterselect-input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Page_MSE389 - Update Valuations/input_Calc Type_v-filterselect-input'), 'Actual')

WebUI.sendKeys(findTestObject('Page_MSE389 - Update Valuations/input_Calc Type_v-filterselect-input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_MSE389 - Update Valuations/input_Actual Price_itemsActualValue'), '5,000,000.00')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSE389 - Update Valuations/span_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSE389 - Update Valuations/span_Submit'))

