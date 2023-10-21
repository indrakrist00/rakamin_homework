package Saucedemo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/Saucedemo/features",
            glue = "Saucedemo.stepdef",
            plugin ={"html:target/HTML_report.html"}
            //tags = "@TDD"
    )

    public class run {
    }

