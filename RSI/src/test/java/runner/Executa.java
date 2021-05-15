package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
// caminho das features
		features = "src/test/resources/feature/",
		//caminho dos steps de testes
		glue = "tests",
		// tag para indicar qual teste deverá ser executado
		tags = "@executa",
		//pretty deixar o console igual a execução cucumber | html 
		plugin = { "pretty", "html:target/report.html" },
		// não executar o teste, validar se foi incluso algum novo bdd
		//FALSE
		dryRun = false,
		monochrome = true) 




public class Executa {
	
}