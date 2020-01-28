//package br.com.rsinet.HUB_BDD.stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//
//import br.com.rsinet.HUB_BDD.PageFactory.FormCadastroUsuarioFactory;
//import br.com.rsinet.HUB_BDD.suporte.Context;
//import br.com.rsinet.HUB_BDD.suporte.Driver;
//import cucumber.api.java.pt.Dado;
//import cucumber.api.java.pt.Então;
//import cucumber.api.java.pt.Quando;
//import junit.framework.Assert;
//
//public class CadastroUsuarioFalhaSteps {
//	private WebDriver driver;
//
//	@Dado("^que eu esteja no site$")
//	public void que_eu_esteja_no_site() throws Throwable {
//		driver = Driver.createChrome();
//
//	}
//
//	@Dado("^quando clico em criar nova conta$")
//	public void quando_clico_em_criar_nova_conta() throws Throwable {
//		FormCadastroUsuarioFactory cadastroForm = new FormCadastroUsuarioFactory(driver);
//		cadastroForm.HomePage();
//		cadastroForm.CriaNovaConta();
//
//	}
//
//	@Dado("^e insiro todas as informções do usuário$")
//	public void e_insiro_todas_as_informções_do_usuário() throws Throwable {
//		FormCadastroUsuarioFactory formulario = new FormCadastroUsuarioFactory(driver);
//		formulario.FormCadastro();
//	}
//
//	@Quando("^clico no botão de registra$")
//	public void clico_no_botão_de_registra() throws Throwable {
//		FormCadastroUsuarioFactory enviar = new FormCadastroUsuarioFactory(driver);
//		enviar.Submit();
//
//	}
//
//	@Então("^apresenta o erro de login invalido$")
//	public void apresenta_o_erro_de_login_invalido() throws Throwable {
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		String mensagem = driver.findElement(By.xpath(
//				"/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[1]/div[1]/sec-view[1]/div/label"))
//				.getText();
//		System.out.println(mensagem);
//		Assert.assertTrue(mensagem.contains("Use maximum 15 character"));
//
//	}
//}
