package TestNG;

import org.testng.annotations.Test;

public class Basics {
	@Test(enabled = true)
	private void data() {
		System.out.println("Data analyst");
	}

	@Test(enabled = false)
	private void driven() {
		System.out.println("Frame work");
	}

	@Test
	private void chemist() {
		System.out.println("Chemical Engg");
	}
}
