package br.com.ZeDelivery.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src/resources/features/ConsultarClima.feature"},
		features = {"src/resources/features/"},
		glue = {"br.com.ZeDelivery.steps"}, 
		monochrome = false, 
			plugin = {"html:target/cucumber-html-report",
					"json:target/cucumber-reports/cucumber.json",
				  "junit:target/cucumber-reports/cucumber.xml"},
		tags = {"@Regressivo"},
		snippets = SnippetType.CAMELCASE, 
		dryRun = false,
		strict = false)

public class RunCucumberTest {

}