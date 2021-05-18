package tests;

import org.junit.Assert;

import elementos.ElementosWeb;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class PreencherLoginESenhaIncorretos {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu esteja em {string} tres")
	public void que_eu_esteja_em_tres(String appUrl) throws InterruptedException {
		metodos.abrirNavegador(appUrl, "acessando o site");
		metodos.esperar();
	}

	@And("apertar no botao do utilizador  tres")
	public void apertar_no_botao_do_utilizador_tres() throws InterruptedException {
		metodos.clicar(el.getUser());
		metodos.esperar();
	}

	@When("preencher o campo de login e senha incorretos tres")
	public void preencher_o_campo_de_login_e_senha_incorretos_tres() {
		metodos.preencherLogin(el.getEscreverUsuarioLogin(), "BenjaminSilva", el.getEscreverSenhaLogin(), "pep967", el.getEfetuarLogin());
	}
	
	@Then("entao nao efetuar cadastro tres")
	public void entao_nao_efetuar_cadastro_tres() {
		metodos.clicar(el.getEfetuarLogin());
		Assert.assertTrue(metodos.btnExiste(el.getEfetuarLogin()));
		metodos.fecharNavegador();
	}
}
