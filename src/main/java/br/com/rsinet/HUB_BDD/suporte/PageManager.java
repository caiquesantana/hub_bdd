package br.com.rsinet.HUB_BDD.suporte;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.PageFactory.FormCadastroUsuarioFactory;

public class PageManager {
	private WebDriver driver;
	private FormCadastroUsuarioFactory formCadastro;


public PageManager (WebDriver driver){
this.driver = driver;

}

public FormCadastroUsuarioFactory getFormCadastro() {
	return (formCadastro==null) ? formCadastro = new FormCadastroUsuarioFactory(driver) : formCadastro;

}

}