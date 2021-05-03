package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String appUrl, String descricaoPasso) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void esperar() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void cadastrarConta(By escreverNomeUsuario, String nome, By escreverEmail, String email, By escreverSenha,
			String senha, By escreverConfirmaSenha, String confirmasenha) {
		driver.findElement(escreverNomeUsuario).sendKeys(nome);
		driver.findElement(escreverEmail).sendKeys(email);
		driver.findElement(escreverSenha).sendKeys(senha);
		driver.findElement(escreverConfirmaSenha).sendKeys(confirmasenha);
	}

	public void cadastraDados(By escreverNome, String nome, By escreverSegundoNome, String segundoNome,
			By escreverNumeroTelefone, String numero) {
		driver.findElement(escreverNome).sendKeys(nome);
		driver.findElement(escreverSegundoNome).sendKeys(segundoNome);
		driver.findElement(escreverNumeroTelefone).sendKeys(numero);
	}

	public void cadastraEndereço(By escreverPais, String pais, By escreverCidade, String cidade, By escreverRua,
			String rua, By escreverEstado, String estado, By escreverCep, String cep, By btnAceitarTermos,
			By btnConfirmaCadastro) {
		driver.findElement(escreverPais).sendKeys(pais);
		driver.findElement(escreverCidade).sendKeys(cidade);
		driver.findElement(escreverRua).sendKeys(rua);
		driver.findElement(escreverEstado).sendKeys(estado);
		driver.findElement(escreverCep).sendKeys(cep);
		driver.findElement(btnAceitarTermos).click();
		driver.findElement(btnConfirmaCadastro).click();
	}

	public void screnShot(String nome) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);

	}

	public void preencherLogin(By escreverLoginUsuario, String nome, By escreverSenhaLogin, String senha,
			By efetuarLogin) {
		driver.findElement(escreverLoginUsuario).sendKeys(nome);
		driver.findElement(escreverSenhaLogin).sendKeys(senha);
		driver.findElement(efetuarLogin).click();
	}

}