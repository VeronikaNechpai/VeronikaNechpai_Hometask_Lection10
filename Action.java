package by.epam.lesson10.hometask;

import java.util.ArrayList;
import java.util.List;

public class Action {
	private List<Book> books = new ArrayList<Book>();

	public Action() {
	}

	public List<Book> getBooks() {
		return books;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public boolean deleteBook(Book book) {
		return books.remove(book);
	}

	public Book findByContent1(String content1) {
		for (Book book : books) {
			if (book.getBook().equals(content1)) {
				return book;
			}
		}
		return null;
	}

	public Book findByContent2(String content2) {
		for (Book book : books) {
			if (book.getBook().equals(content2)) {
				return book;
			}
		}
		return null;
	}

	public Book findByContent3(String content3) {
		for (Book book : books) {
			if (book.getBook().equals(content3)) {
				return book;
			}
		}
		return null;
	}

}
