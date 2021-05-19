package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.gherkin.Main;

public class Metodos extends Main {
	WebDriver driver;
	

	public void abrirNavegador(String appUrl, String descricaoPasso) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

		
	
	public void fecharNavegador() {
	driver.close();

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
	public void cadastrarContaSemEmail(By escreverNomeUsuario, String nome, By escreverSenha,
			String senha, By escreverConfirmaSenha, String confirmasenha) {
		driver.findElement(escreverNomeUsuario).sendKeys(nome);
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
			String rua, By escreverEstado, String estado, By escreverCep, String cep) {
		driver.findElement(escreverPais).sendKeys(pais);
		driver.findElement(escreverCidade).sendKeys(cidade);
		driver.findElement(escreverRua).sendKeys(rua);
		driver.findElement(escreverEstado).sendKeys(estado);
		driver.findElement(escreverCep).sendKeys(cep);
		
	}
	
	public void aceitarTermosECadastro(By btnAceitarTermos, By btnConfirmaCadastro) {
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
	

	public void descerBarra() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
	}
	
	public String getText(By elemento) {
	return	driver.findElement(elemento).getText();
	}
	
	
	public boolean btnEstaClicado(By elemento) {
		return driver.findElement(elemento).isEnabled();
	}
	
	public boolean btnExiste(By elemento) {
		return driver.findElement(elemento).isDisplayed();
	}

}





