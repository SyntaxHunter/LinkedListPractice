package org.jointheleague.syntaxhunter.cci.chapter1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class TestBookshelf {

	@Test 
	void getBooks() {
		Bookshelf a = new Bookshelf();
		a.addBook(new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6));
		a.addBook(new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", 1));
		
		List<Book> books = a.getBooks();
		books.add(new Book("The Algorithm Design Manual", "Steven S. Skiena", 2));
		
		assertFalse(a.getBooks().equals(books));
	}
	
	@Test
	void addBook() {
		Bookshelf a  = new Bookshelf();
		a.addBook(new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6));
		a.addBook(new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", 1));
		
		assertTrue(a.getBooks().contains(new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6)));
		assertTrue(a.getBooks().contains(new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", 1)));
	}
	
	@Test 
	void removeBook() {
		Bookshelf a = new Bookshelf();
		a.addBook(new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6));
		a.addBook(new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6));
		a.addBook(new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", 1));
		
		assertTrue(a.getBooks().contains(new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", 1)));
		
		a.removeBook(new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", 1));
		
		assertFalse(a.getBooks().contains(new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", 1)));
	}
	
	@Test
	void testEquals() {		
		// Empty
		Bookshelf a = new Bookshelf();
		Bookshelf b = new Bookshelf();
		assertTrue(a.equals(b));
		
		// Reflexivity
		a.addBook(new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6));
		a.addBook(new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6));
		a.addBook(new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", 1));
		
		assertTrue(a.equals(a));
		assertFalse(a.equals(b));

		// Symmetry
		b.addBook(new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6));
		b.addBook(new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", 1));
		b.addBook(new Book("Cracking the Coding Inerview", "Gayle Laakmann McDowell", 6));
		assertTrue(a.equals(b));
		assertTrue(b.equals(a));
		
		// Different Number of Books
		a.addBook(new Book("The Algorithm Design Manual", "Steven S. Skiena", 2));
		assertFalse(a.equals(b));
		
		// Same Number, Different Books
		a.removeBook(new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", 6));
		assertFalse(a.equals(b));
	}
}
