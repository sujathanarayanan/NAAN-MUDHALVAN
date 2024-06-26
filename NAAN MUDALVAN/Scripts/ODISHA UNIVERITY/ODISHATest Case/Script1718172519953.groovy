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

WebUI.navigateToUrl('https://www.cet.edu.in/')

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO ODISHA UNIVERSITY OF TECHNO_7408cf/img'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/a_Architecture'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/img'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/img_1'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/img_1_2'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/img_1_2_3'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/a_Admission'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/a_Academics'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/a_TEQIP'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/td_Facilities'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/a_Facilities'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/td_Tenders RFQ EOI'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/a_Placement'))

WebUI.click(findTestObject('Object Repository/ODISHA/Page_WELCOME TO THE COLLEGE OF ENGINEERING _3c0bc8/a_Careers'))

