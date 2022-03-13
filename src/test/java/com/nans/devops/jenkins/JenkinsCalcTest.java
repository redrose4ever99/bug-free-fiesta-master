package com.nans.devops.jenkins;

import static org.junit.Assert.*;
import org.testng.annotations.Test;
//import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator calc = new JenkinsCalculator();
		assertEquals(10, calc.addNos(5, 5));
	}
	
	@Test
	public void subTest() {
		JenkinsCalculator calc = new JenkinsCalculator();
		assertEquals(0, calc.subNos(5, 5));
	}

}
