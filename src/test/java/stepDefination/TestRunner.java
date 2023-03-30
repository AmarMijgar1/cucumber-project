package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature", glue= {"stepDefination"},
							// Path of Feature File									// Path of StepDefination File
//dryRun = true, //to check the mapping is proper between feature file and stepDefination file
//monochrome = true,
//plugin = {"pretty","html:target/HtmlReports"}

//plugin = {"pretty","json:target/JSONReports/report.json"}
plugin = {"pretty","junit:target/JunitReports/report.xml",
					"json:target/JSONReports/report.json",
					"html:target/HtmlReports/HtmlReports"},
tags = "@smoketest"
)
public class TestRunner {

}
