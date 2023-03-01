package library;

import java.time.LocalDate;

import books.Book;

public class Borrowing {

	public Borrowing(Book book, Subscriber subscriber, LocalDate dateOfBorrowing) {
		this.book = book;
		this.subscriber = subscriber;
		this.dateOfBorrowing = dateOfBorrowing;
	}
	
	public Borrowing(Book book, Subscriber subscriber, LocalDate dateOfBorrowing, LocalDate dateOfReturn) {
		this(book,subscriber,dateOfBorrowing);
		this.dateOfReturn = dateOfReturn;
	}
	
	private Book book;
	private Subscriber subscriber;
	private LocalDate dateOfBorrowing;
	private LocalDate dateOfReturn;
	
	
	public void setReturnDate(LocalDate date) {
		this.dateOfReturn = date;
	}
	
}
