package br.com.rsinet.HUB_BDD.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.PageFactory.BuscaProdutoLupaPageFactory;
import br.com.rsinet.HUB_BDD.suporte.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class BuscaLupaStepDefinition {
	WebDriver driver;
	
	
	@Dado("^na pagina inicial clico no campo busca$")
	public void na_pagina_inicial_clico_no_campo_busca() throws Throwable {
		driver = Driver.createChrome();
		BuscaProdutoLupaPageFactory busca = new BuscaProdutoLupaPageFactory(driver);
		busca.Lupa();

	}

	@Quando("^insiro o nome do produto$")
	public void insiro_o_nome_do_produto() throws Throwable {
		BuscaProdutoLupaPageFactory nomeProduto = new BuscaProdutoLupaPageFactory(driver);
		nomeProduto.CampoPesquisa();

	}

	@Quando("^clico no produto desejado$")
	public void clico_no_produto_desejado() throws Throwable {
		BuscaProdutoLupaPageFactory selecionar = new BuscaProdutoLupaPageFactory(driver);
		selecionar.SelecionaProduto();
	}

}
