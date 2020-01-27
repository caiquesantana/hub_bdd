package br.com.rsinet.hub_bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			 features = "C:\\Users\\caique.oliveira\\git\\ProjetoHub_TDD\\ProjetoHub_BDD\\Feature\\BuscaProdutoLupa.feature"
			 ,glue={"br.com.rsinet.HUB_BDD.stepDefinition"}
			 ,tags= {"@PesquisaPelaLupa"}
			 )

	public class BuscaPelaLupaRunner {

}
