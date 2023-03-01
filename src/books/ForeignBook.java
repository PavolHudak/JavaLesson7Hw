package books;

public class ForeignBook extends Book {
	
	public ForeignBook(String name, String author, int numberOfPages, String language) {
		super(name, author, numberOfPages);
		this.language = language;
	}
	
	public ForeignBook(String name, String author, int numberOfPages) {
		this(name,author,numberOfPages, "English");
	}

	private String language;

}
