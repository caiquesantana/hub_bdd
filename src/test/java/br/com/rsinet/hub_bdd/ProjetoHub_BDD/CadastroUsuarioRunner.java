package br.com.rsinet.hub_bdd.ProjetoHub_BDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "Feature\\CadastroUsuario.feature"
		 ,glue={"br.com.rsinet.HUB_BDD.stepDefinition"}
		 )

public class CadastroUsuarioRunner {

}
