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
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li")
	private  WebElement Produto;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article/div[3]/div/label/span")
	private WebElement produtoNaoEncontrado;
	
	public void Lupa() {
		ClicarLupa.click();
	}
	
	public void CampoPesquisa() {
		CampoPesquisa.sendKeys("Iphone" + Keys.ENTER);
	}
	
	public void SelecionaProduto() {
		Produto.click();
	}
	
	public void ProdutoIndosponivel () {
		produtoNaoEncontrado.getText();
	}
	
	
}