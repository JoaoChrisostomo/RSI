package tests;

import java.io.IOException;

import org.junit.Assert;

import elementos.ElementosWeb;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class NaoPreencherEmailObrigatorio<searchButton> {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	
	
	@Given("que eu esteja em {string} quatro")
	public void que_eu_esteja_em_quatro(String appUrl) throws InterruptedException {
		metodos.abrirNavegador(appUrl, "acessando o site");
		metodos.esperar();
	}

	@And("apertar no botao do utilizador  quatro")
	public void apertar_no_botao_do_utilizador_quatro() throws InterruptedException {
		metodos.clicar(el.getUser());
		metodos.esperar();
		metodos.clicar(el.getCreateNewAccount());
		metodos.esperar();
	}

	@When("preencher os campos obrigatorios menos o email  quatro")
	public void preencher_os_campos_obrigatorios_menos_o_email_quatro() throws IOException {
		metodos.cadastrarContaSemEmail(el.getEscreverNomeUsuario(), "BenjaminSilva", el.getEscreverSenha(), "Benjamin123", el.getEscreverConfirmaSenha(), "Benjamin123");
		metodos.clicar(el.getBtnAceitarTermos());
		metodos.screnShot("Nao Preencher Email");
	}

	@Then("entao nao efetuar cadastro  quatro")
	public void entao_nao_efetuar_cadastro_quatro() throws IOException {
		metodos.clicar(el.getBtnConfirmaCadastro());
	Assert.assertFalse(metodos.btnEstaClicado(el.getBtnConfirmaCadastro()));
		metodos.fecharNavegador();		
	}
}

