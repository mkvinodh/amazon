package MAVEN_PROJECT.Maven1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Technical {
	@Test(retryAnalyzer = Analyser.class)
	private void fullstack() {
		String tam = ("FrontEnd");
		Assert.assertEquals(tam, "Front");
		System.out.println("Code successful");
	}

	@Test(retryAnalyzer = Analyser.class)
	private void data_Science() {
		String tan = ("Python");
		Assert.assertEquals(tan, "Java");
		System.out.println("Data Base");
	}
}
