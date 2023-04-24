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

WebUI.setText(findTestObject('Object Repository/Page_/input_Username_username'), 'Admin')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_Username_username'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), 'mso200')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_MSM200A - MAINTAIN SUPPLIER INFORMATION/input_01 Create Supplier_MSO200_Supplier Code'), 
    '000073')

WebUI.setText(findTestObject('Object Repository/Page_MSM200A - MAINTAIN SUPPLIER INFORMATION/input_01 Create Supplier_MSO200_Supplier Status'), 
    'N')

WebUI.setText(findTestObject('Object Repository/Page_MSM200A - MAINTAIN SUPPLIER INFORMATION/input_01 Create Supplier_MSO200_District'), 
    'SERV')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSM200A - MAINTAIN SUPPLIER INFORMATION/span_01 Create Supplier_MSO200_Submit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Name'), 'WSBL')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Address1'), 'Jalan Batu Dinding')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Address2'), 'Kec. Bayangan Hitam')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Address3'), 'Kota. Bintang')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Post Code1'), '82635')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Contact'), 'Will')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Phone'), '08552534121')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Email'), 'wilsb670@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Supplier_MSO200_Submit2'))

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Payment Name'), 'Will')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Payment Address1'), 'Jalan Batu Dinding')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Payment Address2'), 'Kec. Bayangan Hitam')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Payment Address'), 'Kota. Bintang')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Payment Post Code'), '83982')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Payment Contact'), 'Will')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Payment Phone'), '89128393892')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Payment Email'), 'wilsb670@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Supplier_MSO200_Submit2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Return Name'), 'Will')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Return Address1_RETURNS_ADDR_14I_5'), 
    'Jalan Batu Dinding')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Return Address2'), 'Kec. Bayangan Hitam')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Return Post Code'), '89389')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Return Address3 Post Code'), 
    'Kota. Bintang')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Return Contact'), 'Will')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Return Phone'), '823787283')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Return Email'), 'wilsb670@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Supplier_MSO200_Submit2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Supplier_MSO200_Domestic Supplier'))

WebUI.click(findTestObject('Object Repository/Page_/div_01 Create Supplier_MSO200_Supplier Domestic DM - DOMESTIC'))

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Name'), 'Will')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Address1'), 'Jalan Batu Dinding')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Address2'), 'Kec. Bayangan Hitam')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Post Code'), '83928')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Address3'), 'Kota. Bintang')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Contact'), 'Will')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Phone'), '82387328738')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Email'), 'wilsb670@gmail.com')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Supplier_MSO200_Submit2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Supplier_MSO200_Submit2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_Submit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Closed For Christmas Status'), 
    'N')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span__01 Create Supplier_MSO200_Supplier Domestic Item Per Order'))

WebUI.click(findTestObject('Object Repository/Page_/div_01 Create Supplier_MSO200_Supplier Domestic_S - Single Item Per Purchase Order'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Supplier_MSO200_Submit2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Supplier_MSO200_Submit2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Supplier_MSO200_Submit2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Number of Days to Pay'), 
    '7')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Days To Pay From'), 
    'I')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Supplier_MSO200_Submit2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Orders Allowed'), 
    'Y')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Payments Allowed'), 
    'Y')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Payment Method'), 
    'D')

WebUI.setText(findTestObject('Object Repository/Page_/input_01 Create Supplier_MSO200_Supplier Domestic Reconcile'), 'N')

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Supplier_MSO200_Submit2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_01 Create Supplier_MSO200_Submit2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_MSM200A - MAINTAIN SUPPLIER INFORMATION/input_ELLIPSE 9 EMS TEST_quicklaunch'), 
    'mso203')

WebUI.sendKeys(findTestObject('Object Repository/Page_MSM200A - MAINTAIN SUPPLIER INFORMATION/input_ELLIPSE 9 EMS TEST_quicklaunch'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_MSM203A - APPROVE SUPPLIER MODIFICATIONS/01 Create Supplier_MSO200_Supplier Domestic label'))

WebUI.click(findTestObject('Object Repository/Page_MSM203A - APPROVE SUPPLIER MODIFICATIONS/01 Create Supplier_MSO200_Supplier Domestic label1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSM203A - APPROVE SUPPLIER MODIFICATIONS/span_01 Create Supplier_MSO200_Supplier Domestic Approve this Entry'))

