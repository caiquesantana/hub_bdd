package br.com.rsinet.hub_bdd.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			 features = "./Feature/PesquisaPaginaInicial.feature"
			 ,glue={"br.com.rsinet.HUB_BDD.stepDefinition"}
			 ,plugin ="com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\caique.oliveira\\Pictures\\BDD\\ReportsBDD\\BuscaComSucesso.html"
			 ,tags= {"@BuscaHomeSucesso"}
			 )


public class BuscaPaginaInicialRunner {
	@AfterClass
    public static void writeExtentReport() {
    Reporter.loadXMLConfig(new File("C:\\Users\\caique.oliveira\\git\\ProjetoHub_TDD\\ProjetoHub_BDD\\src\\main\\java\\br\\com\\rsinet\\HUB_BDD\\suporte\\extensionConfig.xml"));
	}
}
