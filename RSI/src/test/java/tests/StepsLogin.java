package tests;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class StepsLogin {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu esteja em {string}")
	public void que_eu_esteja_em(String appUrl) throws InterruptedException {
		metodos.abrirNavegador(appUrl, "acessando o site");
		metodos.esperar();
	}

	@And("apertar no botao do utilizador")
	public void apertar_no_botao_do_utilizador() throws InterruptedException {
		metodos.clicar(el.getUser());
		metodos.esperar();
	}

	@When("preencher os campos de login")
	public void preencher_os_campos_de_login()  {
		metodos.preencherLogin(el.getEscreverUsuarioLogin(), "BenjaminSilva", el.getEscreverSenhaLogin(), "Benjamin123", el.getEfetuarLogin());  
	}

	@Then("entao efetuar login")
	public void entao_efetuar_login() throws InterruptedException, IOException  {
		metodos.clicar(el.getEfetuarLogin());
		metodos.esperar();
		metodos.screnShot("Login");
	}

}