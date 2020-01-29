package br.com.rsinet.hub_bdd.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
				 features = "C:\\Users\\caique.oliveira\\git\\ProjetoHub_TDD\\ProjetoHub_BDD\\Feature\\CadastroUsuario.feature"
				 ,glue="br.com.rsinet.HUB_BDD.stepDefinition"
				 ,plugin ="com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\caique.oliveira\\Pictures\\BDD\\ReportsBDD\\CadastroFalha.html"
				 ,tags= {"@CadastroFalha"}
				 
				 )
	public class CadastroUsuarioFalhaRunner {
		@AfterClass
	    public static void writeExtentReport() {
	    Reporter.loadXMLConfig(new File("C:\\Users\\caique.oliveira\\git\\ProjetoHub_TDD\\ProjetoHub_BDD\\src\\main\\java\\br\\com\\rsinet\\HUB_BDD\\suporte\\extensionConfig.xml"));
		}

}
