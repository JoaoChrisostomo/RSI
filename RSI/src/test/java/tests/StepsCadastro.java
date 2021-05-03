package tests;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class StepsCadastro {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String appUrl) throws InterruptedException {
		metodos.abrirNavegador(appUrl, "acessando o site");
		metodos.esperar();
	}

	@And("clique no botao do utilizador")
	public void clique_no_botao_do_utilizador() throws InterruptedException {
		metodos.clicar(el.getUser());
		metodos.esperar();
	}

	@And("clique em criar nova conta")
	public void clique_em_criar_nova_conta() {
		metodos.clicar(el.getCreateNewAccount());
	}

	@When("preencher todos os campos obrigatorio")
	public void preencher_todos_os_campos_obrigatorio() throws InterruptedException, IOException {
		metodos.esperar();
		metodos.cadastrarConta(el.getEscreverNomeUsuario(), "BenjaminSilva", el.getEscreverEmail(), "Benjamin.si@gmail.com", el.getEscreverSenha(), "Benjamin123",
		el.getEscreverConfirmaSenha(), "Benjamin123");	
		metodos.screnShot("cadastroUp");
		metodos.cadastraDados(el.getEscreverNome(), "Benjamin", el.getEscreverSegundoNome(), "Silva", el.getEscreverNumeroTelefone(), "11 968634561");
		metodos.cadastraEndereço(el.getEscreverPais(), "Brazil", el.getEscreverCidade(), "Manaus", el.getEscreverRua(),"Rua Travessa dos Anjos 876",
		el.getEscreverEstado(),"AM", el.getEscreverCep(), "69080275", el.getBtnAceitarTermos(), el.getBtnConfirmaCadastro());
		metodos.screnShot("cadastroDown");
	}

	@Then("cadastro realizado com sucesso")
	public void cadastro_realizado_com_sucesso() {
		metodos.clicar(el.getBtnConfirmaCadastro());
	}

}