package br.com.rsinet.hub_bdd.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// Localiza meu pacote com as features
		features = "C:\\Users\\caique.oliveira\\git\\ProjetoHub_TDD\\ProjetoHub_BDD\\Feature\\CadastroUsuario.feature"
		//Informa o pacote onde está adicionado as classes a serem executadas
		,glue = "br.com.rsinet.HUB_BDD.stepDefinition"
		// Plugin do Extend Report, tipo de relatório utilizado com informações dos testes executados.
		//,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)
	
public class CadastroUsuarioRunner {
//	@AfterClass
//	public static void writeExtentReport() {
//		/* Informa o caminho onde está minhas configurações em XML do Extend Report */
//		Reporter.loadXMLConfig(new File("C:\\Users\\caique.oliveira\\git\\ProjetoHub_TDD\\ProjetoHub_BDD\\src\\main\\java\\br\\com\\rsinet\\HUB_BDD\\suporte\\extensionConfig.xml"));
//		
//		/* Informa o nome do testador no relatório */
//		Reporter.setSystemInfo("Tester Name", "Caique");
		
//	}
}

