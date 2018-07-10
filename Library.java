package by.epam.lesson10.hometask;
import java.util.List;



public class Library {
	public static void main (String[] args) {
		Action books = new Action();
	
		Book b1 = new Book("Book 1");
		books.addBook(b1);
		
		Book b2= new Book ("Book 2");
		books.addBook(b2);
		
		Book b3 = new Book ("Book 3");
		books.addBook(b3);
		
		Book b4 = new Book ("Book 4");
		books.addBook(b4);
		Book b5 = new Book ("Book 5");
		books.addBook(b5);
		
		Book b6 = new Book ("Book 6");
		books.addBook(b6);
		
		
		Book findBook = books.findByContent1("Book 4");
		if(findBook!=null) {
			System.out.print(findBook+" ");
		}
	Book findBook2 = books.findByContent2("Book 1");
	if(findBook!=null) {
		System.out.print(findBook2+" ");
	} 
	Book findBook3 = books.findByContent3("Book 3");
	if(findBook!=null) {
		System.out.print(findBook3+" ");
	} 
	print (books);
	}

	public static void print (Action action) {
		List<Book> printBooks=action.getBooks();
		System.out.println("\n" + "Library: ");
		for (int i=0; i<printBooks.size();i++) {
			Book book=printBooks.get(i);
			print(book);
		}
	}
	
	
	public static void print(Book book) {
		System.out.println("Book | " +book.getBook() + " |");
		
	}

	}
		
	

