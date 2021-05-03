package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// Elementos Web

	private By user = By.id("menuUser");
	private By createNewAccount = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");

	// Elementos cadastro

	private By escreverNomeUsuario = By.name("usernameRegisterPage");
	private By escreverEmail = By.name("emailRegisterPage");
	private By escreverSenha = By.name("passwordRegisterPage");
	private By escreverConfirmaSenha = By.name("confirm_passwordRegisterPage");
	private By escreverNome = By.name("first_nameRegisterPage");
	private By escreverSegundoNome = By.name("last_nameRegisterPage");
	private By escreverNumeroTelefone = By.name("phone_numberRegisterPage");
	private By escreverPais = By.name("countryListboxRegisterPage");
	private By escreverCidade = By.name("cityRegisterPage");
	private By escreverRua = By.name("addressRegisterPage");
	private By escreverEstado = By.name("state_/_province_/_regionRegisterPage");
	private By escreverCep = By.name("postal_codeRegisterPage");
	private By btnAceitarTermos = By.name("i_agree");
	private By btnConfirmaCadastro = By.id("register_btnundefined");

	// Elementos Login
	private By escreverUsuarioLogin = By.name("username");
	private By escreverSenhaLogin = By.name("password");
	private By efetuarLogin = By.id("sign_in_btnundefined");
	// Métodos publicos dos elementos

	public By getEscreverUsuarioLogin() {
		return escreverUsuarioLogin;
	}


	public By getEscreverSenhaLogin() {
		return escreverSenhaLogin;
	}


	public By getEfetuarLogin() {
		return efetuarLogin;
	}

	public By getBtnConfirmaCadastro() {
		return btnConfirmaCadastro;
	}

	public By getCreateNewAccount() {
		return createNewAccount;
	}

	public By getBtnAceitarTermos() {
		return btnAceitarTermos;
	}

	public By getEscreverNomeUsuario() {
		return escreverNomeUsuario;
	}

	public By getEscreverEmail() {
		return escreverEmail;
	}

	public By getEscreverSenha() {
		return escreverSenha;
	}

	public By getEscreverConfirmaSenha() {
		return escreverConfirmaSenha;
	}

	public By getEscreverNome() {
		return escreverNome;
	}

	public By getEscreverSegundoNome() {
		return escreverSegundoNome;
	}

	public By getEscreverNumeroTelefone() {
		return escreverNumeroTelefone;
	}

	public By getEscreverPais() {
		return escreverPais;
	}

	public By getEscreverCidade() {
		return escreverCidade;
	}

	public By getEscreverRua() {
		return escreverRua;
	}

	public By getEscreverEstado() {
		return escreverEstado;
	}

	public By getEscreverCep() {
		return escreverCep;
	}

	public By getUser() {
		return user;
	}

}