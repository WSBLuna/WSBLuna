import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.concurrent.locks.Condition as Condition
import javax.xml.ws.Response as Response
import com.github.kklisura.cdt.protocol.types.fetch.RequestStage as RequestStage
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.authorization.RequestAuthorization as RequestAuthorization
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import sun.security.provider.certpath.OCSPResponse.ResponseStatus as ResponseStatus
import org.glassfish.grizzly.http.HttpHeader as HttpHeader
import org.jsoup.helper.HttpConnection.Request as Request
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty

//Request Authentikasi untuk dapat mengakses API lain
Test = WS.sendRequest(findTestObject('Ellipse API/Ellipse Authenticate', 
	[("username"): "0000000171",("password"): ""]))

token = WS.getElementText(Test, 'data.token')

println('Token : ' + token)

//Retrieve all Transaction untuk melakukan tindakan 
RequestObject RetrieveTransaction = findTestObject(NamaObjek)

ArrayList HTTPHeader = new ArrayList()

HTTPHeader.add(new TestObjectProperty('Authorization', ConditionType.EQUALS, 'Bearer ' + token))

RetrieveTransaction.setHttpHeaderProperties(HTTPHeader)

print(HTTPHeader)


