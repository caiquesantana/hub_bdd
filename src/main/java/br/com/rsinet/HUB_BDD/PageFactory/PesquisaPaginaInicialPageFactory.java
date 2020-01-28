package br.com.rsinet.HUB_BDD.PageFactory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.HUB_BDD.suporte.Driver;


public class PesquisaPaginaInicialPageFactory {
	WebDriver driver;
	public PesquisaPaginaInicialPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Teste Possitivo ↓
	@FindBy(how = How.ID, using = "laptopsImg")
	private WebElement ClicarLaptop;

	@FindBy(how = How.ID, using = "8")
	private WebElement EscolheProduto;
	
	@FindBy(how = How.ID, using = "Description")
	private WebElement notebookEscolhido;
	
	//Teste Negativo ↓
	@FindBy(how = How.ID, using = "details_10" )
	private WebElement NotebookTelaInicial;
	
	@FindBy(how = How.ID, using = "mobileDescription" )
	private WebElement NotebookEncontrado;
	
	//Teste possitivo ↓
	public void Categoria() {
		ClicarLaptop.click();
	}
	public void Produto() {
		EscolheProduto.click();
	}
	public void ProdutoEscolhido() {
		notebookEscolhido.isDisplayed();
	}
	public void validarProduto() {
		String produtoEncontrado = EscolheProduto.getText();
		Assert.assertTrue(produtoEncontrado.equals("HP ZBOOK 17 G2 MOBILE WORKSTATION"));
	}
	
	//Teste negativo ↓
	public void NotebookClick() {
		NotebookTelaInicial.click();
	}
	public void NotebookEncontrado() {
		NotebookEncontrado.isDisplayed();
	}
	
	
	//Teste negativo
	public void Comparar() {
		String notebookEncontrado = NotebookEncontrado.getText();
		Assert.assertFalse(notebookEncontrado.equals("\"HP ELITEBOOK FOLIO\""));
	}
}