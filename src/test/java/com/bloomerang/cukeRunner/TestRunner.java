package com.bloomerang.cukeRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/features" ,
        glue = "com/bloomerang/steps" ,
        publish = true, // it will give you public link of your local html report
        plugin = {"pretty", "html:target/cucumber.html" ,
                "rerun:target/rerun.txt" ,  // store the failed scenario into rerun.txt
                "me.jvt.cucumber.report.PrettyReports:target"
        } ,
        dryRun = false
       // tags = "@ui" //"@regression"
)


public class TestRunner {


}
