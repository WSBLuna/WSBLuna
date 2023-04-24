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

WebUI.setText(findTestObject('Object Repository/Page_/input_00 Login_Username'), 'admin')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_00 Login_Username'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), 'MSE025')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Search Modify Menu/span_01 Create Menu_MSE025_New'))

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Create Modify Menu/textarea_01 Create Menu_MSE025_Text Displayed_localisedDescription'), 
    'Menu Testing')

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Create Modify Menu/span_01 Create Menu_MSE025_Addition'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Create Modify Menu/textarea_01 Create Menu_MSE025_Text Displayed_localisedDescription'), 
    'Material Management')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Create Modify Menu/span_01 Create Menu_MSE025_Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Addition2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/textarea_01 Create Menu_MSE025_Text Displayed_localisedDescription'), 
    'Human Resource')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Submit2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Menu Testing'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Addition2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/textarea_01 Create Menu_MSE025_Text Displayed_localisedDescription'), 
    'Work and Asset')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Submit2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Menu Testing_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Addition2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/textarea_01 Create Menu_MSE025_Text Displayed_localisedDescription'), 
    'Finance and Accounting')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Submit2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Finance and Accounting'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Addition2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Add Child Node'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/textarea_01 Create Menu_MSE025_Text Displayed_localisedDescription'), 
    'Order Invoice')

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/input_01 Create Menu_MSE025_Application Code_1'), 
    'MSO260')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Submit2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Work and Asset'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Addition2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Add Child Node_1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/textarea_01 Create Menu_MSE025_Text Displayed_localisedDescription'), 
    'Work Order')

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/input_01 Create Menu_MSE025_Application Code_1'), 
    'MSEWOT')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Submit2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Finance and Accounting_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Addition2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Add Child Node'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/textarea_01 Create Menu_MSE025_Text Displayed_localisedDescription'), 
    'Non - Order Invoice ')

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/input_01 Create Menu_MSE025_Application Code_1'), 
    'MSO265')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Submit2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Human Resource'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Addition2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Add Child Node_1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/textarea_01 Create Menu_MSE025_Text Displayed_localisedDescription'), 
    'Personnel Administration')

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/input_01 Create Menu_MSE025_Application Code_1'), 
    'MSE81S')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Submit2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Material Management'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Addition2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Add Child Node'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/textarea_01 Create Menu_MSE025_Text Displayed_localisedDescription'), 
    'Catalogue')

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/input_01 Create Menu_MSE025_Application Code_1'), 
    'MSE100')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Submit2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span__01 Create Menu_MSE025_Promode to Global Menu1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_Promote Node To Global Menu'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/input_01 Create Menu_MSE025_Menu Name_'), 
    'TST003')

WebUI.click(findTestObject('Object Repository/Page_MSE025 - Update Modify Menu/span_01 Create Menu_MSE025_OK'))

