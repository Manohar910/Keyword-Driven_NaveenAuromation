package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.engine.KeyWordEngine;

public class LoginTest {

	public KeyWordEngine keyWordEngine;

	@Test
	public void loginTest() {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.stratExecution("Sheet1");

	}
}
