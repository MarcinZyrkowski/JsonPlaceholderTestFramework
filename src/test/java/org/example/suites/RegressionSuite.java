package org.example.suites;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("org.example.tests.jsonplaceholdermodule")
public class RegressionSuite {

}
