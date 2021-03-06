package canal.pro;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/features"},
	//	glue= {""},
		plugin= {"pretty","html:target/cucumber-html-report"},
		snippets=SnippetType.CAMELCASE,
		tags= {("@adresse")},
		monochrome=true
		)

public class TestRunner {

}