package br.com.rsinet.HUB_BDD.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.PageFactory.FormCadastroUsuarioFactory;
import br.com.rsinet.HUB_BDD.suporte.Driver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastroUsuarioStepDefinition {
	private WebDriver driver;
	
	@Dado("^que eu tenha acessado o site$")
	public void que_eu_tenha_acessado_o_site() throws Throwable {
		driver = Driver.createChrome();
	}

	@Dado("^eu tenho acesso a parte de Create new accout$")
	public void eu_tenho_acesso_a_parte_de_Create_new_accout() throws Throwable {
		FormCadastroUsuarioFactory PopUpCadastro = new FormCadastroUsuarioFactory (driver);
		PopUpCadastro.HomePage();
	}

	@Dado("^eu estou em criar nova conta de usuário$")
	public void eu_estou_em_criar_nova_conta_de_usuário() throws Throwable {
		FormCadastroUsuarioFactory criarNovaConta = new FormCadastroUsuarioFactory(driver);
		criarNovaConta.CriaNovaConta();
	}

	@Quando("^insiro todas as informções do usuário$")
	public void insiro_todas_as_informções_do_usuário() throws Throwable {
		FormCadastroUsuarioFactory cadastro = new FormCadastroUsuarioFactory(driver);
		cadastro.FormCadastro();
	}

	@Quando("^eu clico no botão de registra$")
	public void eu_clico_no_botão_de_registra() throws Throwable {
		FormCadastroUsuarioFactory submit = new FormCadastroUsuarioFactory(driver);
		submit.Submit();
	}

	@Então("^eu deveria  ver a mensagem de usuário cadastrado$")
	public void eu_deveria_ver_a_mensagem_de_usuário_cadastrado() throws Throwable {

		
	}

}
