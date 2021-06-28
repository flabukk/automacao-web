package br.com.viaVarejo.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


/**
 * @author Flavio Pacheco
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src/resources/features/PesquisarQA.feature"},
		features = {"src/resources/features/"},
		glue = {"br.com.viaVarejo.steps"}, 
		monochrome = false, 
			plugin = {"html:target/cucumber-html-report",
					"json:target/cucumber-reports/cucumber.json",
				  "junit:target/cucumber-reports/cucumber.xml"},
		tags = {"@PesquisarQA"},
		snippets = SnippetType.CAMELCASE, 
		dryRun = false,
		strict = false)

public class RunCucumberTest {

}