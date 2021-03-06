//Wolfram SDET Challenge
//Hannah Carl

package com.wolfram.sdetchallenge.testng;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import com.wolfram.sdetchallenge.main.Driver;
import com.wolfram.sdetchallenge.main.WolframInputPage;

import java.io.IOException;

public class InputPageButtonCheck extends Driver{
	
	
	//Test will verify browse examples button works by comparing resulting URL
	@Parameters({ "browseExamplesURL"})
	@Test
	public void verifyBrowseExamplesButton(String browseExamplesURL) throws IOException, InterruptedException  {
		
		//Create web driver for wolfram alpha
		webDriver.get("https://www.wolframalpha.com");
		WolframInputPage wolframInputPage = new WolframInputPage(webDriver);
	
		//Click browse examples' button
		wolframInputPage.browseExamples();
	
		//Get URL of new page
		String actualURL = webDriver.getCurrentUrl();
	
		//Delay
		Thread.sleep(10);
	
		//Verify browse examples was clicked by comparing page URL
		assertEquals(browseExamplesURL,actualURL);
	  
	}
  
	//Test will verify Mathematics button works by comparing resulting URL
	@Parameters({ "mathematicsURL"})
	@Test
	public void verifyMathematicsButton(String mathematicsURL) throws IOException, InterruptedException  {
		
		//Create web driver for wolfram alpha
		webDriver.get("https://www.wolframalpha.com");
		WolframInputPage wolframInputPage = new WolframInputPage(webDriver);
	
		//Click mathematics button
		wolframInputPage.mathematics();
	
		//Get URL of new page
		String actualURL = webDriver.getCurrentUrl();
		
		//Delay
		Thread.sleep(10);
	
		//Verify mathematics was clicked by comparing page URL
		assertEquals(mathematicsURL,actualURL);
	  
  }
	
	//Test will verify Science & Technology button works by comparing resulting URL
		@Parameters({ "scienceTechURL"})
		@Test
		public void verifyScienceTechButton(String scienceTechURL) throws IOException, InterruptedException  {
			
			//Create web driver for wolfram alpha
			webDriver.get("https://www.wolframalpha.com");
			WolframInputPage wolframInputPage = new WolframInputPage(webDriver);
		
			//Click science & technology button
			wolframInputPage.scienceTech();
		
			//Get URL of new page
			String actualURL = webDriver.getCurrentUrl();
			
			//Delay
			Thread.sleep(10);
		
			//Verify science & technology was clicked by comparing page URL
			assertEquals(scienceTechURL,actualURL);
		  
	  }
		
		//Test will verify Society & Culture button works by comparing resulting URL
		@Parameters({ "socCultureURL"})
		@Test
		public void verifySocCultureButton(String socCultureURL) throws IOException, InterruptedException  {
			
			//Create web driver for wolfram alpha
			webDriver.get("https://www.wolframalpha.com");
			WolframInputPage wolframInputPage = new WolframInputPage(webDriver);
		
			//Click society & culture button
			wolframInputPage.socCulture();
		
			//Get URL of new page
			String actualURL = webDriver.getCurrentUrl();
			
			//Delay
			Thread.sleep(10);
		
			//Verify society & culture was clicked by comparing page URL
			assertEquals(socCultureURL,actualURL);
		  
	  }
		
		//Test will verify Everyday Life button works by comparing resulting URL
		@Parameters({ "everydayLifeURL"})
		@Test
		public void verifyEverydayLifeButton(String everydayLifeURL) throws IOException, InterruptedException  {
			
			//Create web driver for wolfram alpha
			webDriver.get("https://www.wolframalpha.com");
			WolframInputPage wolframInputPage = new WolframInputPage(webDriver);
		
			//Click everyday life button
			wolframInputPage.everydayLife();
		
			//Get URL of new page
			String actualURL = webDriver.getCurrentUrl();
			
			//Delay
			Thread.sleep(10);
		
			//Verify everyday life was clicked by comparing page URL
			assertEquals(everydayLifeURL,actualURL);
		  
	  }
}
