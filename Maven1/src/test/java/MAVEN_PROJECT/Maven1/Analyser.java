package MAVEN_PROJECT.Maven1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Analyser implements IRetryAnalyzer {
	int count = 0;
	int maximum_limit = 5;
	
	public boolean retry(ITestResult result) {
		if(count < maximum_limit) {
			count++;
			return true;
		}
		return false;
	}
	

}
