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

WebUI.click(findTestObject('IMO Class/Click_CleaningProcess'))

WebUI.delay(2)

WebUI.click(findTestObject('Cleaning Method/Click_Cleaning Method'))

WebUI.delay(2)

WebUI.click(findTestObject('Cleaning Method/Click_New Cleaning Method Plus'))

WebUI.delay(2)

WebUI.setText(findTestObject('Cleaning Method/SetText_Cleaning Method'), findTestData('Cleaning Method/Cleaning Method').getValue(
        2, 1))

WebUI.setText(findTestObject('Cleaning Method/SetText_CleaningMethodDescription'), findTestData('Cleaning Method/Cleaning Method').getValue(
        3, 1))

WebUI.delay(2)

WebUI.click(findTestObject('Cleaning Method/Click_Cleaning Type'))

WebUI.sendKeys(findTestObject('Cleaning Method/Click_Cleaning Type'), findTestData('Cleaning Method/Cleaning Method').getValue(
        4, 1))

WebUI.sendKeys(findTestObject('Cleaning Method/Click_Cleaning Type'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Cleaning Method/SetText_Cleaning Procedure'), findTestData('Cleaning Method/Cleaning Method').getValue(
        5, 1))

WebUI.delay(2)

WebUI.click(findTestObject('Cleaning Method/Click_Add Entry'))

WebUI.delay(2)

WebUI.click(findTestObject('Cleaning Method/Click_SaveButton'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Cleaning Method/Click_Backto list'))

WebUI.delay(2)

WebUI.setText(findTestObject('Cleaning Method/SetText_Serach'), findTestData('Cleaning Method/Cleaning Method').getValue(
        2, 1))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Login ITankdepo/Log_Out_Button'))

WebUI.closeBrowser()

