package com.openclassrooms.bobapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.fail;

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
