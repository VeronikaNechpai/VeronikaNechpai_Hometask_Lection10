package by.epam.lesson10.hometask;

public class Book {
private String book;
public Book() {
	this("");
}
public Book(String book) {
	this.book=book;
}
public String getBook() {
	return book;
}
public void setBook(String book) {
	this.book=book;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((book == null) ? 0 : book.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (book == null) {
		if (other.book != null)
			return false;
	} else if (!book.equals(other.book))
		return false;
	return true;
}
@Override
public String toString() {
	return "" + book + "";
}

}
