package tests;

import java.io.IOException;

import org.junit.Assert;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class PreencherTodosOsCampos {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String appUrl) throws InterruptedException {
		metodos.abrirNavegador(appUrl, "acessando o site");
		metodos.esperar();
	}

	@Given("clique no botao do utilizador")
	public void clique_no_botao_do_utilizador() throws InterruptedException {
		metodos.clicar(el.getUser());
		metodos.esperar();
	}

	@Given("clique em criar nova conta")
	public void clique_em_criar_nova_conta() throws InterruptedException {
		metodos.clicar(el.getCreateNewAccount());
		metodos.esperar();
	}

	@When("preencher todos os campos")
	public void preencher_todos_os_campos() throws IOException {
		metodos.cadastrarConta(el.getEscreverNomeUsuario(), "BenjaminSiiilva", el.getEscreverEmail(),
				"Benjamin.siiii@gmail.com", el.getEscreverSenha(), "Benjamin123", el.getEscreverConfirmaSenha(),
				"Benjamin123");
		metodos.screnShot("cadastroUp");
		metodos.cadastraDados(el.getEscreverNome(), "Benjamin", el.getEscreverSegundoNome(), "Silva",
				el.getEscreverNumeroTelefone(), "11 968634561");
		metodos.cadastraEndereço(el.getEscreverPais(), "Brazil", el.getEscreverCidade(), "Manaus", el.getEscreverRua(),
				"Rua Travessa dos Anjos 876", el.getEscreverEstado(), "AM", el.getEscreverCep(), "69080275");
		metodos.screnShot("Todos os Campos Preenchidos");
	}

	@Then("cadastro realizado com sucesso")
	public void cadastro_realizado_com_sucesso() throws IOException, InterruptedException {
		metodos.aceitarTermosECadastro(el.getBtnAceitarTermos(), el.getBtnConfirmaCadastro());
		Assert.assertEquals(metodos.getText(el.getEscreverNomeUsuario()), metodos.getText(el.getLoginEfetuado()));
		metodos.screnShot("Todos Os Campos Preenchidos Com Sucesso");
		metodos.esperar();
		metodos.fecharNavegador();
	}
}
