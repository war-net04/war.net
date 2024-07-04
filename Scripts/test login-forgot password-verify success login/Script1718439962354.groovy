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

WebUI.navigateToUrl('https://app-pos-staging-v2.inovasy.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Azzam POS/input__form-control ng-untouched ng-pristin_3ca2b9'), 'as')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Azzam POS/input__form-control ng-untouched ng-pristin_3ca2b9_1'), 
    'xbXHGMmSqt8=')

WebUI.click(findTestObject('Object Repository/Page_Azzam POS/i_Log In_mdi mdi-login'))

WebUI.click(findTestObject('Object Repository/Page_Azzam POS/span_Tutup'))

WebUI.click(findTestObject('Object Repository/Page_Azzam POS/a_Lupa password'))

WebUI.setText(findTestObject('Object Repository/Page_Azzam POS/input__form-control ng-untouched ng-pristin_3ca2b9'), 'as')

WebUI.click(findTestObject('Object Repository/Page_Azzam POS/button_Kirim link telegram'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Azzam POS/input__form-control ng-untouched ng-dirty ng-valid'), 
    'xbXHGMmSqt8=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Azzam POS/input__form-control ng-untouched ng-pristin_3ca2b9_1_2'), 
    'xbXHGMmSqt8=')

WebUI.click(findTestObject('Object Repository/Page_Azzam POS/span__hide_eye'))

WebUI.click(findTestObject('Object Repository/Page_Azzam POS/span__hide_eye'))

WebUI.click(findTestObject('Object Repository/Page_Azzam POS/button_Ubah Password'))

WebUI.setText(findTestObject('Object Repository/Page_Azzam POS/input__form-control ng-untouched ng-pristin_3ca2b9'), 'as')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Azzam POS/input__form-control ng-untouched ng-pristin_3ca2b9_1'), 
    'xbXHGMmSqt8=')

WebUI.click(findTestObject('Object Repository/Page_Azzam POS/i_Log In_mdi mdi-login ng-star-inserted'))

WebUI.rightClick(findTestObject('Object Repository/Page_Azzam POS/div_verified_userLink login akan dikirimkan_b2d9d3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Azzam POS/div_Login Berhasilverified_userLink login a_89d4a0'), 
    0)

