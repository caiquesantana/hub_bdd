package br.com.rsinet.hub_bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
				 features = "C:\\Users\\caique.oliveira\\git\\ProjetoHub_TDD\\ProjetoHub_BDD\\Feature\\CadastroUsuarioFalha.feature"
				 ,glue="br.com.rsinet.HUB_BDD.stepDefinition"
				 
				 )
	public class CadastroUsuarioFalhaRunner {

}
