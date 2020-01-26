package br.com.rsinet.HUB_BDD.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.PageFactory.FormCadastroUsuarioFactory;
import br.com.rsinet.HUB_BDD.suporte.Driver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastroUsuarioSteps {
	private WebDriver driver;
	FormCadastroUsuarioFactory cadastro;
	
	@Dado("que eu esteja no site")
	public void que_eu_esteja_no_site() {
		driver = Driver.createChrome();

		throw new cucumber.api.PendingException();
	}

	@Dado("clico em criar nova conta")
	public void clico_em_criar_nova_conta() throws InterruptedException {
		
		cadastro.HomePage();
		cadastro.CriaNovaConta();
		
		
		throw new cucumber.api.PendingException();
	}

	@Quando("e insiro todas as informções do usuário")
	public void e_insiro_todas_as_informções_do_usuário() {
		cadastro.FormCadastro();

		throw new cucumber.api.PendingException();
	}

	@Quando("clico no botão de registra")
	public void clico_no_botão_de_registra() {
		cadastro.Submit();

		throw new cucumber.api.PendingException();
	}

	@Então("o usuario é cadastrado com sucesso")
	public void o_usuario_é_cadastrado_com_sucesso() {
		String usuario = driver.findElement(By.xpath("/html/body/header/nav/ul/li[3]/a/span")).getText();
		

		throw new cucumber.api.PendingException();
	}


}
