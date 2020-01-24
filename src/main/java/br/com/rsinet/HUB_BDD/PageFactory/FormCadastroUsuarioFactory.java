package br.com.rsinet.HUB_BDD.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormCadastroUsuarioFactory {

	public FormCadastroUsuarioFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement usuario = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")));

	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement Home;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement CriarNovaConta;

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement Login;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement Email;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement Senha;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement ConfirmarSenha;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement Nome;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement Sobrenome;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement Contato;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement Pais;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement Cidade;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement Rua;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement Estado;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement Cep;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement TermoDeUso;

	@FindBy(how = How.NAME, using = "register_btnundefined")
	private WebElement EnvioFormulario;

	public void HomePage() throws InterruptedException {
		Home.click();
		Thread.sleep(50000);
	}

	public void CriaNovaConta() {
		CriarNovaConta.click();

	}

	public void FormCadastro() {
		Login.sendKeys();
		Email.sendKeys();
		Senha.sendKeys();
		ConfirmarSenha.sendKeys();
		Nome.sendKeys();
		Sobrenome.sendKeys();
		Contato.sendKeys();
		Select pais = new Select(Pais);
		pais.selectByVisibleText("Brazil");
		Cidade.sendKeys();
		Rua.sendKeys();
		Estado.sendKeys();
		Cep.sendKeys();
		TermoDeUso.click();
	}

	public void Submit() {
		EnvioFormulario.click();
	}

}
