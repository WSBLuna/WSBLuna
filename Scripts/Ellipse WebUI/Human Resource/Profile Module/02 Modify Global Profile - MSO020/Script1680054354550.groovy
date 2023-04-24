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

WebUI.callTestCase(findTestCase('Ellipse Web UI Test/Human Resource/00 Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), 'MSO020')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_MSM020A - MAINTAIN SECURITY PROFILE/div_02 Modify Global Profile_MSO020_Option_v-filterselect-button'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSM020A - MAINTAIN SECURITY PROFILE/span_02 Modify Global Profile_MSO020_3. Modify Profile'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_MSM020A - MAINTAIN SECURITY PROFILE/input_02 Modify Global Profile_MSO020_Profile type'), 
    'G')

WebUI.setText(findTestObject('Object Repository/Page_MSM020A - MAINTAIN SECURITY PROFILE/input_02 Modify Global Profile_MSO020_Profile name'), 
    GlobalVariable.ProfileName)

WebUI.click(findTestObject('Object Repository/Page_MSM020A - MAINTAIN SECURITY PROFILE/span_Submit'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_/input_02 Modify Global Profile_MSO020_Val1'), '1111111111111111111111111111111111111111111111111111111111111111111111')

WebUI.click(findTestObject('Object Repository/Page_/span_Submit'))

