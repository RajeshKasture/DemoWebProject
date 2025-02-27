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

WebUI.delay(2)

WebUI.navigateToUrl('https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe')

WebUI.delay(2)

WebUI.switchToFrame(findTestObject('iFrame/Page_W3Schools Tryit Editor/iframe__iframeResult'), 0)

WebUI.delay(2)

WebUI.rightClick(findTestObject('Object Repository/iFrame1/Page_W3Schools Tryit Editor/h1_The iframe element'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/iFrame1/Page_W3Schools Tryit Editor/h1_The iframe element_1'), 
    'The iframe element')

WebUI.delay(2)

WebUI.switchToFrame(findTestObject('iFrame/Page_W3Schools Tryit Editor/iframe'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/iFrame1/Page_W3Schools Tryit Editor/a_HTML'))

WebUI.delay(2)

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/iFrame1/Page_W3Schools Tryit Editor/a_Run_tryhome'))

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

