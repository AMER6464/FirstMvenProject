package day11_frameWork_driver_Utilities;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class Java_concepts {

	
	// Java concept recap
	
	   public static void main(String[] args) {
			System.out.println(concatinatedStrings("Hello ",  "World"));
			
		}
		
		// create a method that accepts a webElement and returns the text of the webElement as a String
		public static String textOfElement(WebElement element) {
			return element.getText();
		}
		
		
		// create a method that accepts a webElement and a input string, that sendKeys the string to the webElement
		public static void typeTheString(WebElement element, String input) {
			element.sendKeys(input);
		}
		
		// create a function that accepts a webElement and clicks on the webElement
		public static void clickOnit(WebElement element) {
			element.click();
		}
		
		// create a method that accepts a string and prints the string out
		public static void printString(String x) {
			System.out.println(x);
		}
		
		
		 // create a function that accepts two strings and returns a concatinated string of those two
		  public static String concatinatedStrings(String x, String y) {
		    //return x+y;
		    return x.concat(y);
		}








}