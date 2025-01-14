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

WebUI.navigateToUrl('https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=2609440535228289599&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062111&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Example4/Page_Online Shopping site in India Shop Onl_10c5f3/select_All Categories        Alexa Skills  _a62561'), 
    'search-alias=digital-text', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Example4/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_nav-search-submit-button'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Example4/Page_Kindle Store Buy Kindle Store Online a_c890ff/span_Data Analytics using Python'), 
    0)

WebUI.click(findTestObject('Object Repository/Example4/Page_Kindle Store Buy Kindle Store Online a_c890ff/span_Data Analytics using Python'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Data Analytics using Python eBook : Bharti Motwani: Amazon.in: Kindle Store')

WebUI.delay(2)

WebUI.rightClick(findTestObject('Object Repository/Example4/Page_Data Analytics using Python eBook  Bha_b6ddfb/span_Added to eBook cart'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Example4/Page_Data Analytics using Python eBook  Bha_b6ddfb/div_Added to eBook cart    Subtotal   (1 eB_35bbbc'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Object Repository/Example4/Page_Data Analytics using Python eBook  Bha_b6ddfb/span_Added to eBook cart'))

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.delay(2)

WebUI.navigateToUrl('https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=2609440535228289599&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062111&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Example5/Page_Online Shopping site in India Shop Onl_10c5f3/select_All Categories        Alexa Skills  _a62561'), 
    'search-alias=digital-text', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Example5/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_nav-search-submit-button'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Example5/Page_Kindle Store Buy Kindle Store Online a_c890ff/span_Data Analytics using Python'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Data Analytics using Python eBook : Bharti Motwani: Amazon.in: Kindle Store')

WebUI.delay(2)

WebUI.rightClick(findTestObject('Object Repository/Example4/Page_Data Analytics using Python eBook  Bha_b6ddfb/span_Added to eBook cart'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Example4/Page_Data Analytics using Python eBook  Bha_b6ddfb/div_Added to eBook cart    Subtotal   (1 eB_35bbbc'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Object Repository/Example4/Page_Data Analytics using Python eBook  Bha_b6ddfb/span_Added to eBook cart'))

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=2609440535228289599&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062111&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Example5/Page_Online Shopping site in India Shop Onl_10c5f3/select_All Categories        Alexa Skills  _a62561'), 
    'search-alias=digital-text', true)

WebUI.click(findTestObject('Object Repository/Example5/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Example5/Page_Kindle Store Buy Kindle Store Online a_c890ff/i_Kindle Unlimited_a-icon a-icon-checkbox'))

WebUI.click(findTestObject('Object Repository/Example5/Page_Amazon.in/span_White Horses Dark Shadows A Modern Day_8ea88f'))

WebUI.switchToWindowTitle('White Horses Dark Shadows: A Modern Day Intense Romance | A story about finding True Love eBook : Gupta, Namrata: Amazon.in: Kindle Store')

WebUI.click(findTestObject('Object Repository/Example5/Page_White Horses Dark Shadows A Modern Day_aaab93/button_Add to eBook cart'))

WebUI.click(findTestObject('Object Repository/Example5/Page_White Horses Dark Shadows A Modern Day_aaab93/div_Added to eBook cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Example5/Page_White Horses Dark Shadows A Modern Day_aaab93/div_Added to eBook cart'), 
    0)

