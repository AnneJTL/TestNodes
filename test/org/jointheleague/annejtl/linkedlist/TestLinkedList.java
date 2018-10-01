package org.jointheleague.annejtl.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLinkedList {

	@Test
	void testInit() {
		LinkedList<String> myList = LinkedList.init();
		assertNotNull(myList);
		
	}
	
	@Test
	void testAppend() {
		LinkedList<String> myList = LinkedList.init();
		myList.append("test");
		assertEquals("test", myList.getFirst().getValue());
	}

}
