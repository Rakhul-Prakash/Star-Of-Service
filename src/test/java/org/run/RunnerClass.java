package org.run;

import org.jvm.JVMClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources", glue="org.step", monochrome=true,
dryRun=false, plugin = "json:D:\\Eclipse\\StarService\\Report\\JSON\\JsonReport.json")

@Test
public class RunnerClass extends AbstractTestNGCucumberTests{

	@AfterClass
	private void reporting() {
		JVMClass.jvmGenerate("json:D:\\\\Eclipse\\\\StarService\\\\Report\\\\JSON\\\\JsonReport.json");

	}
}
