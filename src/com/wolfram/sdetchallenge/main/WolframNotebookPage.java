//Wolfram SDET Challenge
//Hannah Carl

package com.wolfram.sdetchallenge.main;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//WolframNotebookPage Class
public class WolframNotebookPage extends PageObject{
	
	@FindBy(linkText="Create a New Notebook")
	private WebElement createNotebookButton;				//create createNotebookButton WebElement
	
	@FindBy(id="notebookcontent")
	private WebElement notebookContent;						//create notebookContent WebElement
	
	@FindBy(linkText="Hyperlink")
	private WebElement hyperlinkInsert;						//create hyperlinkInsert WebElement
	
	@FindBy(name="hyperlinkinput")
	private WebElement hyperlinkLinkInput;					//create hyperlinkLinkInput WebElement
	
	@FindBy(id="hyperlinkinput")
	private WebElement hyperlinkNameInput;					//create hyperlinkNameInput WebElement
	
	@FindBy(linkText="Insert")
	private WebElement insertButton;						//create insertButton WebElement
	
	@FindBy(linkText="Special Characters")
	private WebElement specialCharacters;					//create specialCharacters WebElement
	
	@FindBy(id="IconId-Pi")
	private WebElement piButton;							//create piButton WebElement
	

	public WolframNotebookPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	//method will create new notebook
	public WolframResultPage createNotebook() {
		createNotebookButton.click();
		return new WolframResultPage(webDriver);
		
	}
	
	//method will enter input in notebook
	public void enterInput(String notebookContent) {
		this.notebookContent.clear();
		this.notebookContent.sendKeys(notebookContent);	
	}
	//method will click Insert button
	public void insertButton() {
		this.insertButton.click();
	}
	
	//method will click Hyperlink Insert Button
	public void hyperlinkInsert() {
		hyperlinkInsert.click();		
	}
	
	//method will enter link input for hyperlink
	public void enterHyperlinkLinkInput(String hyperlinkContent) {
		this.hyperlinkLinkInput.clear();
		this.hyperlinkLinkInput.sendKeys(hyperlinkContent);	
	}
	
	//method will enter name input for hyperlink
	public void enterHyperlinkNameInput(String hyperlinkContent) {
		this.hyperlinkNameInput.clear();
		this.hyperlinkNameInput.sendKeys(hyperlinkContent);	
	}
	//method will click special characters button
	public void specialCharactersInsert() {
		specialCharacters.click();
	}
	
	//method will click pi button from special characters
	public void piInsert() {
		piButton.click();
	}
	
	

}