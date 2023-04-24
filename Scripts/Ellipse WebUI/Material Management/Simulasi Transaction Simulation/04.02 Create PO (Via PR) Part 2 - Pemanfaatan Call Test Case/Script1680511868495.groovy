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

WebUI.callTestCase(findTestCase('Ellipse Web UI Test/Material Management/Simulasi Transaction Simulation/04.01 Create PO (Via PR) Part 1 - Pemanfaatan Call Test Case'), 
    [('Supplier') : Supplier, ('Anggaran') : Anggaran, ('Quantity') : Quantity, ('POType') : POType, ('PONumber') : PONumber], 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_/input_Username_username'), 'Admin')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_Username_username'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), 'mseapm')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/input__04 Create PO_MSEAPM_Employee'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/input_04 Create PO_MSEAPM_Transaction Type'), 
    'PR')

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/button__v-datefield-button'))

WebUI.setText(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/input_04 Create PO_MSEAPM_Purchase Requisition'), 
    PONumber)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_Search'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/label_MSEAPM1'), 
    10)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/label_MSEAPM1'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_Endorse'), 10)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_Endorse'))

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_OK'))

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_Search'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/label_MSEAPM1'), 
    10)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/label_MSEAPM1'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_Endorse'), 10)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_Endorse'))

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_OK'))

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_Search'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/label_MSEAPM1'), 
    10)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/label_MSEAPM1'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_Approve'), 10)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_Approve'))

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_Confirm'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/input_ELLIPSE 9 EMS TEST_quicklaunch'), 
    'mso230')

WebUI.sendKeys(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/input_ELLIPSE 9 EMS TEST_quicklaunch'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSM230A - MAINTAIN PURCHASE REQUISITIONS/div_Option_v-filterselect-button'))

WebUI.click(findTestObject('Object Repository/Page_MSM230A - MAINTAIN PURCHASE REQUISITIONS/td_3. ModifyProcess Purchase Requisition'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_MSM230A - MAINTAIN PURCHASE REQUISITIONS/input_04 Create PO_MSO230_Purchase Requisition No'), 
    PONumber)

WebUI.click(findTestObject('Object Repository/Page_MSM230A - MAINTAIN PURCHASE REQUISITIONS/span_04 Create PO_MSO230_Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Submit2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO_MSEAPM_Process Item'), 'L')

WebUI.click(findTestObject('Object Repository/Page_/div_L - Finalise into a Live Purchase Order'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Submit2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/div_04 Create PO Part 3_MSO230_Option Action'))

WebUI.click(findTestObject('Object Repository/Page_/td_04 Create PO Part 3_MSO230_3. ModifyProcess Purchase Requisition'))

WebUI.setText(findTestObject('Object Repository/Page_/input_04 Create PO Part 3_MSO230_Purchase Requisition'), PONumber)

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_04 Create PO Part 3_MSO230_Purchase Requisition'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Submit2'))

Result = WebUI.getText(findTestObject('Object Repository/Page_/input_04 Create PO Part 3_MSO230_Order Number'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_/span_04 Create PO_MSO230_Submit2'))

WebUI.setText(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), 'MSEAPM')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/input__04 Create PO_MSEAPM_Employee'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/input_04 Create PO_MSEAPM_Transaction Type'), 
    'PO')

WebUI.setText(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/input_04 Create PO_MSEAPM_Purchase Requisition'), 
    Result)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/04 Create PO Part 3_MSO230_label'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO Part 3_MSO230_Endorse'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/04 Create PO Part 3_MSO230_label_1'))

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO Part 3_MSO230_Endorse'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_Search'))

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/label_04 Create PO Part 3_MSO230_MSEAPM1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO Part 3_MSO230_Approve'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_MSEAPM - Search Approvals Manager/span_04 Create PO_MSEAPM_Confirm'))

