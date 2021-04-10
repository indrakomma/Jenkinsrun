package runners;

import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "stedef","src/main/java/utils/browserfact.java" },format = {"pretty" ,"json:target/chrome/json/output.json","html:target/chrome/html"},
features = {"src/test/resources/Features" }, tags = { "@t" } )
public class runnerclasstest {

}
