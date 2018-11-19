package org.jointheleague.syntaxhunter.cci.chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBook {

	@Test
	void testBooksEqual() {
		Book b1 = new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6);
		assertFalse(b1.equals(null));
		
		Book b2 = new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6);
		assertTrue(b1.equals(b2));
		assertTrue(b2.equals(b1));
		
		Book b3 = new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", 1);
		assertFalse(b1.equals(b3));
		assertFalse(b3.equals(b1));		
	}

	@Test
	void testBooksHashCode() {
		Book b1 = new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6);
		Book b2 = new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6);
		assertTrue(b1.hashCode() == b2.hashCode());
		
		Book b3 = new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", 1);
		assertFalse(b1.hashCode() == b3.hashCode());
	}
}
