package br.com.rsinet.HUB_BDD.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PesquisaPaginaInicialPageFactory {
	public PesquisaPaginaInicialPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "laptopsImg")
	private WebElement ClicarLaptop;

	@FindBy(how = How.ID, using = "8")
	private WebElement EscolheProduto;

	public void Categoria() {
		ClicarLaptop.click();
	}

	public void Produto() {
		EscolheProduto.click();
	}

}
