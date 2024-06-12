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

WebUI.navigateToUrl('https://www.iitm.ac.in/')

WebUI.click(findTestObject('Object Repository/IIT/Page_Indian Institute of Technology Madras/span_Eng_navigation__iconBbar'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Indian Institute of Technology Madras/a_Academics'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Indian Institute of Technology Madras/a_Study  IITM'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Indian Institute of Technology Madras/a_Non-campus BS programmes'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Non-campus BS programmes  Indian Insti_386f0a/a_View details here'))

WebUI.switchToWindowTitle('Study at IITM -')

WebUI.click(findTestObject('Object Repository/IIT/Page_Study at IITM -/a_BS in Electronic Systems'))

WebUI.click(findTestObject('Object Repository/IIT/Page_IIT Madras Degree in Electronic Systems/span__navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/IIT/Page_IIT Madras Degree in Electronic Systems/a_Admissions'))

WebUI.click(findTestObject('Object Repository/IIT/Page_IIT Madras Degree in Electronic Systems/a_Mandatory Requirements'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Admissions/span__navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Admissions/a_Testimonials'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Testimonials/img_As shared on Social Media_imgTemplate'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Testimonials/svg'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Testimonials/img_As shared on Social Media_imgTemplate_1'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Testimonials/img_No results found_imprzdModalImageContainer'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Testimonials/div_Anushka Saxena                         _460dd3'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Testimonials/span__navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Testimonials/i_About IITM_fas fa-angle-down'))

WebUI.click(findTestObject('Object Repository/IIT/Page_Testimonials/a_About IIT Madras'))

WebUI.click(findTestObject('Object Repository/IIT/Page_About IIT Madras and Our Experience in_9ccc23/b_Visit website'))

WebUI.closeBrowser()

