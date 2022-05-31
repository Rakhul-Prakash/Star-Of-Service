package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMClass {
	
	public static void jvmGenerate(String json) {
		File f = new File("D:\\Eclipse\\StarService\\JVM Report");
		Configuration c = new Configuration(f, "Star Of Service");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("OS", "Windows");
		c.addClassifications("Programming Language","Java");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
		
		

	}

}
