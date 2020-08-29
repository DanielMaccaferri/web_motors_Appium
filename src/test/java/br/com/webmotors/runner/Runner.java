package br.com.webmotors.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(features = "src/main/resources/br/com/webmotors/feature", tags = "@geral", glue = "br.com.webmotors.steps",strict=true)
@RunWith(Cucumber.class)

//@CucumberOptions (features = "src/main/resources/br/com/webmotors/feature",
//		glue = { "br.com.webmotors.steps"},  //"br.com.webmotors.core"},
//		tags = { "@geral" },
//		monochrome = true,
//		dryRun = false,
//		strict= true)
public class Runner {

}



