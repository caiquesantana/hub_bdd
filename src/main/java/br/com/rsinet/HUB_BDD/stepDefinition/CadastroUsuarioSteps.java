package br.com.rsinet.HUB_BDD.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.PageFactory.FormCadastroUsuarioFactory;
import br.com.rsinet.HUB_BDD.suporte.Context;
import br.com.rsinet.HUB_BDD.suporte.Driver;
import br.com.rsinet.HUB_BDD.suporte.Screenshot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastroUsuarioSteps {
	private WebDriver driver;
	
	FormCadastroUsuarioFactory cadastroForm;
	Context context;

	public CadastroUsuarioSteps(Context chama1) {
		context = chama1;
		cadastroForm = context.getManager().getFormCadastro();
	}

	@Dado("^que eu esteja no site$")
	public void que_eu_esteja_no_site() throws Throwable {
		driver = Driver.createChrome();


	}

	@Dado("^clico em criar nova conta$")
	public void clico_em_criar_nova_conta() throws Throwable {
		cadastroForm.HomePage();
		cadastroForm.CriaNovaConta();

	}

	@Quando("^insiro todas as informções do usuário$")
	public void insiro_todas_as_informções_do_usuário() throws Throwable {
		cadastroForm.FormCadastro();
		cadastroForm.TermoDeUso();

	}

	@Quando("^clico no botão de registra$")
	public void clico_no_botão_de_registra() throws Throwable {
		cadastroForm.Submit();
	}

	@Então("^eu valido se o usuário foi cadastrado$")
	public void eu_valido_se_o_usuário_foi_cadastrado() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 4000);");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, -250);");
		Screenshot.tirarPrint("Cadastro com sucesso", driver);
		Driver.fecharDriver();
	}

	@Quando("^insiro as informções do usuário e tento enviar o formulario$")
	public void insiro_as_informções_do_usuário_e_tento_enviar_o_formulario() throws Throwable {
		cadastroForm.FormCadastro();
	}

	@Então("^apresenta o erro de login invalido$")
	public void apresenta_o_erro_de_login_invalido() throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, -250);");
		cadastroForm.LoginInvalido();
		Screenshot.tirarPrint("Erro ao efetuar o cadastro ", driver);
		Driver.fecharDriver();

	}
}
