package org.jointheleague.syntaxhunter.cci.chapter1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bookshelf {

	private List<Book> books;
	private HashMap<Book, Integer> bookCounts;
	
	public Bookshelf() {
		books = new ArrayList<>();
		bookCounts = new HashMap<Book, Integer>();
	}
	
	public void addBook(Book b) {
		books.add(b);
		int count = bookCounts.getOrDefault(b, 0);
		bookCounts.put(b, count + 1);
	}
	
	public void removeBook(Book b) {
		books.remove(b);
		int count = bookCounts.getOrDefault(b , 1);
		if(count == 1) {
			bookCounts.remove(b);
		} else {
			bookCounts.put(b, count - 1);
		}
	}
	
	public List<Book> getBooks(){
		return new ArrayList<>(books);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bookshelf other = (Bookshelf) obj;
		if (!bookCounts.equals(other.bookCounts))
			return false;
		return true;
	}

}
