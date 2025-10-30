package RunnerTrip;

import org.junit.BeforeClass;

import org.junit.runner.RunWith;

import BaseTrip.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOption;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue= {"StepDefinitions"},monochrome=true)

public class RunnerClass extends BaseClass{
	
	@BeforeClass
	public static void start() {
		Bowserlaunch();
		Maximize();

}
}
