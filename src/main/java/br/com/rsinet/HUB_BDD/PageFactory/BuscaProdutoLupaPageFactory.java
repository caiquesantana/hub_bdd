package br.com.rsinet.HUB_BDD.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuscaProdutoLupaPageFactory {
	WebDriver driver;
	public BuscaProdutoLupaPageFactory (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using = "menuSearch")
	private  WebElement ClicarLupa;
	
	@FindBy(how = How.ID, using = "autoComplete")
	private  WebElement CampoPesquisa;
	
	@FindBy(how = How.ID, using = "3")
	private  WebElement Produto;
	
	public void Lupa() {
		ClicarLupa.click();
	}
	
	public void CampoPesquisa() {
		CampoPesquisa.sendKeys("" + Keys.ENTER);
	}
	
	public void SelecionaProduto() {
		Produto.click();
	}
	
}