package tests;

import java.io.IOException;

import org.junit.Assert;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class InserirLoginESenhaCorretos {
	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	
	@Given("que eu esteja em {string} cinco")
	public void que_eu_esteja_em_cinco(String appUrl) throws InterruptedException {
		metodos.abrirNavegador(appUrl, "acessando o site");
		metodos.esperar();
	}

	@Given("apertar no botao do utilizador cinco")
	public void apertar_no_botao_do_utilizador_cinco() throws InterruptedException {
		metodos.clicar(el.getUser());
		metodos.esperar();
	}

	@When("preencher os campos de login e senha cinco")
	public void preencher_os_campos_de_login_e_senha_cinco() {
		metodos.preencherLogin(el.getEscreverUsuarioLogin(), "BenjaminSilva", el.getEscreverSenhaLogin(), "Benjamin123",
				el.getEfetuarLogin());
	}

	@Then("entao efetuar login  cinco")
	public void entao_efetuar_login_cinco() throws InterruptedException, IOException {
		metodos.clicar(el.getEfetuarLogin());
		metodos.screnShot("Login");
		Assert.assertTrue(metodos.btnEstaClicado(el.getEfetuarLogin()));
		metodos.fecharNavegador();
	}
	
}
