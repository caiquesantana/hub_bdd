package br.com.rsinet.HUB_BDD.stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.PageFactory.FormCadastroUsuarioFactory;
import br.com.rsinet.HUB_BDD.suporte.Context;
import br.com.rsinet.HUB_BDD.suporte.Driver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import junit.framework.Assert;

public class CadastroUsuarioSteps {
	private WebDriver driver;
	FormCadastroUsuarioFactory cadastroForm;
	Context context;
	
	public CadastroUsuarioSteps (Context chama1) {
		context = chama1;
		cadastroForm = context.getManager().getFormCadastro();
	}
	
	@Dado("que eu esteja no site")
	public void que_eu_esteja_no_site() throws InterruptedException {
		driver = Driver.createChrome();

	}

	@Dado("clico em criar nova conta")
	public void clico_em_criar_nova_conta() throws InterruptedException {
		cadastroForm.HomePage();
		cadastroForm.CriaNovaConta();
		
	}

	@Quando("e insiro todas as informções do usuário")
	public void e_insiro_todas_as_informções_do_usuário() {
		cadastroForm.FormCadastro();
		cadastroForm.TermoDeUso();

	}

	@Quando("clico no botão de registra")
	public void clico_no_botão_de_registra() {
		cadastroForm.Submit();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 4000);");

	}

	@Então("o usuario é cadastrado com sucesso")
	public void o_usuario_é_cadastrado_com_sucesso() {
		String usuarioLogado = driver.getPageSource();
		
		Assert.assertTrue(usuarioLogado.contains("Ronaldinho"));

	}


}
