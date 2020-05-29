package com.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="C:\\Users\\Muthukumar\\eclipse-workspace\\SampleBDD\\src\\main\\java\\com\\feature\\scenario1.feature"
			,glue={"com/stepdefinition"}
			,plugin={"pretty","html:test-output","junit:junitOutput/cucumber.xml"
			}
			,monochrome=true
			//dryRun=true
	)
	
			
public class TestRUNNER {  /* This class is used when to use both cucumber and testNG */
		
		    private TestNGCucumberRunner testNGCucumberRunner;
		 
		    @BeforeClass(alwaysRun = true)
		    public void setUpClass() throws Exception {
		        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		    }
		 
		    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
		    public void feature(CucumberFeatureWrapper cucumberFeature) {
		        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		    }
		 
		    @DataProvider
		    public Object[][] features() {
		        return testNGCucumberRunner.provideFeatures();
		    }
		 
		    @AfterClass(alwaysRun = true)
		    public void tearDownClass() throws Exception {
		        testNGCucumberRunner.finish();
		    }
		}