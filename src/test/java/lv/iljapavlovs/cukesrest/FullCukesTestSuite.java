package lv.iljapavlovs.cukesrest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // NOTE - html and json reporter should reference separate folder for each runner classes
        format = {"pretty", "html:target/cucumber/my", "json:target/cucumber/my.json"},
        features = {"src/test/resources/features"},
        tags = {"@my"},
        glue = {"lv.iljapavlovs.cukesrest.steps", "lv.ctco.cukesrest.api"}
)
public class FullCukesTestSuite {
}