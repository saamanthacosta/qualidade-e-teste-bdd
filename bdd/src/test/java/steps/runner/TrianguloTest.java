package steps.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/triangulo.feature"},
        glue = "steps.stepDefinition",
        plugin = {"pretty", "html:target/cucumber"}
)
public class TrianguloTest {
}