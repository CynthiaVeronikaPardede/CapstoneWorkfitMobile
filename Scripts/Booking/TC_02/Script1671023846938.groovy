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

Mobile.startApplication('E:\\SEMESTER 7\\MBKM\\Capstone Project\\CICD\\Aplikasi\\Terbaru\\app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/Books/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Books/android.widget.EditText - email address'), 0)

Mobile.setText(findTestObject('Object Repository/Books/android.widget.EditText'), 'qe1@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/Books/android.widget.EditText - password'), 0)

Mobile.setText(findTestObject('Object Repository/Books/android.widget.EditText (1)'), '12344321', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Books/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Books/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Books/android.widget.Button (1)'), 0)

Mobile.swipe(-25, -65, -16, -105)

Mobile.tap(findTestObject('Object Repository/Books/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Books/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Books/android.widget.Button (3)'), 0)

Mobile.closeApplication()
