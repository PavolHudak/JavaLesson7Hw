package library;

public class Subscriber {

	public Subscriber(String firstName, String lastName, SubscriberAddress subscriberAddress, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.subscriberAddress =subscriberAddress;
		this.email = email;
	}
	
	public Subscriber(String firstName, String lastName, SubscriberAddress subscriberAddress, String email, int age) {
		this(firstName, lastName, subscriberAddress, email);
		this.age = age;
	}
	
	private String firstName;
	private String lastName;
	private SubscriberAddress subscriberAddress;
	private String email;
	private int age;
	

}
