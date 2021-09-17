package com.sapient.trg.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

class MessageBuilderTest {

	@Test
	void testGetMessage() {
		MessageBuilder messageBuilder = new MessageBuilder();
		assertEquals("Hello Ajay",messageBuilder.getMessage("Ajay"));
	}
	@Test
	void testGetMessageForInValidName() {
		MessageBuilder messageBuilder= new MessageBuilder();
		assertNotEquals("Hello Admin",messageBuilder.getMessage("Srini"));
	}


}

