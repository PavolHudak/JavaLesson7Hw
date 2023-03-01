package books;

public class ScientificBook extends Book {

	public ScientificBook(String name, String author, int numberOfPages, String scientificArea) {
		super(name, author, numberOfPages);
		this.scientificArea = scientificArea;
	}
	
	private String scientificArea;

}
