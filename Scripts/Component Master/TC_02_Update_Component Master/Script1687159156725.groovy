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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login ITankdepo/SetText_Admin'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Login ITankdepo/SetText_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('Login ITankdepo/Click_ButtonSignIn'))

WebUI.delay(2)

WebUI.click(findTestObject('IMO Class/Click_Master'))

WebUI.delay(2)

WebUI.click(findTestObject('Component Master/Click_Mnr'))

WebUI.delay(2)

WebUI.click(findTestObject('Component Master/Click_Component Master'))

WebUI.delay(2)

WebUI.setText(findTestObject('Component Master/Set Text_Search'), findTestData('Component Master/Component').getValue(2, 
        1))

WebUI.click(findTestObject('Component Master/Click_Selected Record'))

WebUI.setText(findTestObject('Component Master/setText_Code'), findTestData('Component Master/Component').getValue(2, 2))

WebUI.setText(findTestObject('Component Master/SetText_Description'), findTestData('Component Master/Component').getValue(
        3, 2))

WebUI.click(findTestObject('Component Master/Click_Alias Code'))

WebUI.setText(findTestObject('Component Master/Set Text_Alias_Code'), findTestData('Component Master/Component').getValue(
        6, 1))

WebUI.setText(findTestObject('Component Master/SetText_Remarks'), findTestData('Component Master/Component').getValue(7, 
        1))

WebUI.click(findTestObject('Component Master/Click_Add Alias Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Component Master/Click_Save Component'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Component Master/Click_Back To list'))

WebUI.delay(2)

WebUI.setText(findTestObject('Component Master/Set Text_Search'), findTestData('Component Master/Component').getValue(2, 
        2))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Component Master/Click_SignOut'))

WebUI.closeBrowser()

