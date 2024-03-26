package org.example.suites;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Regression Suite")
@SelectPackages("org.example.tests.jsonplaceholdermodule")
public class RegressionSuite {

}
