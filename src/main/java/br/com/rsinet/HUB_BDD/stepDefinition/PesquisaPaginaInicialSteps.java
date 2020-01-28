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

	@Quando("^seleciono o produto$")
	public void seleciono_o_produto() throws Throwable {
		PesquisaPaginaInicialPageFactory produto = new PesquisaPaginaInicialPageFactory(driver);
		produto.Produto();

	}

	@Quando("^estou no produto desejado$")
	public void estou_no_produto_desejado() throws Throwable {
		PesquisaPaginaInicialPageFactory produtoEscolhido =	new PesquisaPaginaInicialPageFactory(driver);
		produtoEscolhido.ProdutoEscolhido();
	}

	@Então("^eu valido o produto$")
	public void eu_valido_o_produto() throws Throwable {
		PesquisaPaginaInicialPageFactory testePossitivo = new PesquisaPaginaInicialPageFactory(driver);
		testePossitivo.ProdutoEscolhido();
	}

	@Dado("^escolhe produto na tela inicial$")
	public void escolhe_produto_na_tela_inicial() throws Throwable {
		PesquisaPaginaInicialPageFactory notebook = new PesquisaPaginaInicialPageFactory(driver);
		notebook.NotebookClick();
	}

	@Dado("^abre produto diferente do que consta na  tela inicial$")
	public void abre_produto_diferente_do_que_consta_na_tela_inicial() throws Throwable {
		
	}

	@Então("^eu comparo o produto$")
	public void eu_comparo_o_produto() throws Throwable {
		PesquisaPaginaInicialPageFactory testeNegativo = new PesquisaPaginaInicialPageFactory(driver);
		testeNegativo.Comparar();
	}
	
}
