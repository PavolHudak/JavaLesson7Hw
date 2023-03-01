package books;

public class Book {
	
	public Book(String name, String author, int numberOfPages) {
		this.name = name;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	
	private String name;
	private String author;
	private int numberOfPages;
	
	
	
	@Override
	public String toString() {
	return "Name: " + name + "\n" +
		   "Author: " + author + "\n" + 
		   "Pages: " + numberOfPages + "\n";
	}
}
