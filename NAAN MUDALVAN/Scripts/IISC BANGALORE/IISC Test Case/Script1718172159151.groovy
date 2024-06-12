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

WebUI.navigateToUrl('https://www.iisc.ac.in/')

WebUI.click(findTestObject('Object Repository/IISC/Page_Indian Institute of Science/a_Three Faculty Members have been elected a_64b8b0'))

WebUI.click(findTestObject('Object Repository/IISC/Page_Indian Institute of Science/strong_Dr Awadhesh Narayan'))

WebUI.switchToWindowTitle('Awadhesh Narayan | The Solid State and Structural Chemistry Unit')

WebUI.click(findTestObject('Object Repository/IISC/Page_Awadhesh Narayan  The Solid State and _b458eb/i_Menu_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/IISC/Page_Awadhesh Narayan  The Solid State and _b458eb/span_Home'))

WebUI.click(findTestObject('Object Repository/IISC/Page_The Solid State and Structural Chemist_aeacc5/a_Research'))

WebUI.click(findTestObject('Object Repository/IISC/Page_Research  The Solid State and Structur_4d7971/img_Naga Phani Aetukuri_wp-image-33768'))

WebUI.closeBrowser()

