package br.com.rsinet.HUB_BDD.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.PageFactory.BuscaProdutoLupaPageFactory;
import br.com.rsinet.HUB_BDD.suporte.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class BuscaProdutoLupaSteps {
	
	WebDriver driver;
	
	@Dado("^que estou na tela home$")
public void que_estou_na_tela_home() throws Throwable {
		driver = Driver.createChrome();

}

@Quando("^clico na lupa de pesquisa$")
public void clico_na_lupa_de_pesquisa() throws Throwable {
	BuscaProdutoLupaPageFactory lupa = new BuscaProdutoLupaPageFactory(driver);
	lupa.Lupa();
}

@Quando("^digito o nome do produto desejado$")
public void digito_o_nome_do_produto_desejado() throws Throwable {
	BuscaProdutoLupaPageFactory pesquisa = new BuscaProdutoLupaPageFactory(driver);
	pesquisa.CampoPesquisa();
}

@Quando("^clico no produto$")
public void clico_no_produto() throws Throwable {
	BuscaProdutoLupaPageFactory produto = new BuscaProdutoLupaPageFactory(driver);
    produto.SelecionaProduto();
}

@Então("^estarei na tela do produto pesquisado$")
public void estarei_na_tela_do_produto_pesquisado() throws Throwable {
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("scrollBy(0,600)","");
}

@Quando("^digitar um produto inexistente no site$")
public void digitar_um_produto_inexistente_no_site() throws Throwable {
	BuscaProdutoLupaPageFactory produtoPesquisado = new BuscaProdutoLupaPageFactory(driver);
	produtoPesquisado.CampoPesquisa();
}

@Entao("^constata que o produto nao existe$")
public void constata_que_o_produto_nao_existe() throws Throwable {
	BuscaProdutoLupaPageFactory produtoNaoEncontrado = new BuscaProdutoLupaPageFactory(driver);
	produtoNaoEncontrado.ProdutoIndosponivel();
}

}
