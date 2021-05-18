package tests;

import org.junit.Assert;

import elementos.ElementosWeb;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class ApenasCamposObrigatorios {
	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu esteja no {string} dois")
	public void que_eu_esteja_no_dois(String appUrl) throws InterruptedException {
		metodos.abrirNavegador(appUrl, "acessando o site");
		metodos.esperar();
	}

	@And("clique no botao do utilizador  dois")
	public void clique_no_botao_do_utilizador_dois() throws InterruptedException {
		metodos.clicar(el.getUser());
		metodos.esperar();
	}

	@And("clique em criar nova conta  dois")
	public void clique_em_criar_nova_conta_dois() throws InterruptedException {
		metodos.clicar(el.getCreateNewAccount());
		metodos.esperar();
	}

	@When("preencher apenas os campos obrigatorios dois")
	public void preencher_apenas_os_campos_obrigatorios_dois() {
		metodos.cadastrarConta(el.getEscreverNomeUsuario(), "PetrosSSS", el.getEscreverEmail(), "Petrosss.juca@gmail.com",
				el.getEscreverSenha(), "Pepe123", el.getEscreverConfirmaSenha(), "Pepe123");

	}

	@Then("cadastro realizado com sucesso  dois")
	public void cadastro_realizado_com_sucesso_dois() throws InterruptedException {
		metodos.esperar();
		metodos.clicar(el.getBtnAceitarTermos());
		metodos.clicar(el.getBtnConfirmaCadastro());
		Assert.assertEquals(metodos.getText(el.getEscreverNomeUsuario()), metodos.getText(el.getLoginEfetuado()));
		metodos.fecharNavegador();
	}
}
