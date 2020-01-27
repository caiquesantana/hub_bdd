package br.com.rsinet.HUB_BDD.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.PageFactory.PesquisaPaginaInicialPageFactory;
import br.com.rsinet.HUB_BDD.suporte.Driver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PesquisaPaginaInicialSteps {
	WebDriver driver;
	
	@Dado("^que estou na tela home$")
	public void que_estou_na_tela_home() throws Throwable {
		driver = Driver.createChrome();
	    
	}

	@Quando("^clico na categoria LAPTOPS$")
	public void clico_na_categoria_LAPTOPS() throws Throwable {
		PesquisaPaginaInicialPageFactory categoria = new PesquisaPaginaInicialPageFactory(driver);
		categoria.Categoria();
	  
	}

	@Quando("^clico no produto$")
	public void clico_no_produto() throws Throwable {
		PesquisaPaginaInicialPageFactory produto = new PesquisaPaginaInicialPageFactory(driver);
		produto.Produto();
	    
	}

	@Então("^estou na especificação do produto$")
	public void estou_na_especificação_do_produto() throws Throwable {
	    
	}

	@Dado("^escolhe produto na tela inicial$")
	public void escolhe_produto_na_tela_inicial() throws Throwable {

	}

	@Entao("^abre produto diferente do que consta na  tela inicial$")
	public void abre_produto_diferente_do_que_consta_na_tela_inicial() throws Throwable {
	    
	}

}
