package br.com.rsinet.HUB_BDD.PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuscaProdutoLupaPageFactory {
	public BuscaProdutoLupaPageFactory (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using = "menuSearch")
	private  WebElement ClicarLupa;
	
	@FindBy(how = How.ID, using = "autoComplete")
	private  WebElement CampoPesquisa;
	
	@FindBy(how = How.ID, using = "3")
	private  WebElement Produto;

	
	private void Lupa() {
		ClicarLupa.click();
	}
	
	private void CampoPesquisa() {
		CampoPesquisa.sendKeys("" + Keys.ENTER);
	}
	
	private void SelecionaProduto() {
		Produto.click();
	}

}