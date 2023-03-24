package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import MAVEN_PROJECT.Maven1.Base_Class1;

public class Data_Provider extends Base_Class1 {
	String[][] data = { { "abc.gmail.com", "232sdad" }, { "def@gmail.com", "3fdsfas" }, { "ghi@gmail.com", "5dfsdd" } };

	@DataProvider(name = "providing_Datas")
	private String[][] data_Initializer() {
		return data;

	}
	@Test(dataProvider = "providing_Datas")
	
	private void providing_Datas(String ids, String password) {
}
}
