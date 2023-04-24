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

WebUI.navigateToUrl('https://ellipse-demo.ems-elltst.ems.co.id/html/ui#!/ome')

WebUI.setText(findTestObject('Object Repository/Page_/input_Username_username'), '0000000027')

WebUI.click(findTestObject('Object Repository/Page_/div_Login'))

for (int a = 0; a < 100; a = (a + 10)) {
    int Price

    Price = (((Math.random() * 500000) * a) + 100000)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), 'mserql')

    WebUI.sendKeys(findTestObject('Object Repository/Page_/input_ELLIPSE 9 EMS TEST_quicklaunch'), Keys.chord(Keys.ENTER))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_02 Create PR_MSERQL_Requester Position'), 
        '19')

    WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_02 Create PR_MSERQL_Authorized By'), 
        '0000000171')

    WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_02 Create PR_MSERQL_Authorizer Position'), 
        '11')

    WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/span_02 Create PR_MSERQL_Add'))

    WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/div_Item Type_v-filterselect-button'))

    WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/td_Goods'))

    WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_02 Create PR_MSERQL_Add_Quantity Required'), 
        '10.00')

    WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_02 Create PR_MSERQL_Estimated Price'), 
        '' + Price)

    WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_02 Create PR_MSERQL_Purchase Item Description'), 
        'Barang Coba Coba')

    WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/span_02 Create PR_MSERQL_Add_Unit of Measure'))

    WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_02 Create PR_MSERQL_Add_Unit of Measure'), 
        'EA')

    WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/div_EA - Each'))

    WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/span_02 Create PR_MSERQL_Add_OK'))

    WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/li_General'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_02 Create PR_MSERQL_Issue Transaction Type'), 
        'UM')

    WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/li_Costing'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_02 Create PR_MSERQL_District'), 
        'SERV')

    WebUI.setText(findTestObject('Object Repository/Page_MSERQL - Update Requisition/input_02 Create PR_MSERQL_WorkOrder'), 
        '26')

    WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/span_02 Create PR_MSERQL_Submit'))

    WebUI.click(findTestObject('Object Repository/Page_MSERQL - Update Requisition/span_02 Create PR_MSERQL_Confirm'))

    WebUI.delay(5)
}

