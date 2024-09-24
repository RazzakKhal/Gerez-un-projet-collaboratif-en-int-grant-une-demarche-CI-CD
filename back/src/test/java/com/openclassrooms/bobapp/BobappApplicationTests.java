package com.openclassrooms.bobapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BobappApplicationTests {

	@Test
	void contextLoads() {
		
	}

	@Test
    void thisTestWillFail() {
        // Ce test échoue intentionnellement
        fail("Ce test est conçu pour échouer.");
    }

}
