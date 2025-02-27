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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Amezon/Page_Online Shopping site in India Shop Onl_10c5f3/a_Mobiles'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Amezon/Page_Mobile Phones Buy New Mobiles Online a_11ca6d/i_Delivery Day_a-icon a-icon-checkbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Amezon/Page_Amazon.in/h2_Samsung Galaxy M05 (Mint Green, 4GB RAM,_a1ed84'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Samsung Galaxy M05 (Mint Green, 4GB RAM, 64 GB Storage) | 50MP Dual Camera | Bigger 6.7" HD+ Display | 5000mAh Battery | 25W Fast Charging | 2 Gen OS Upgrade & 4 Year Security Update | Without Charger : Amazon.in: Electronics')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Amezon/Page_Samsung Galaxy M05 (Mint Green, 4GB RA_e33b96/input_Shipping cost, delivery date and orde_362d1e'))

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

