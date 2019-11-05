package business;

public class User {	
	
	// Define instance variables
	protected static int id;
	protected String userName;
	protected String firstName;
	protected String lastName;
	protected String phoneNumber;
	protected String email;
	
	// Generate Constructors for POJOs
	public User(int id, String userName, String firstName, String lastName, String phoneNumber, String email) {
		User.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	
	// Generate getters & setters for POJOs
	public static int getId(Object object) {
		return id;
	}
	public void setId(int id) {
		User.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	// Generate toString() for POJOs
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}

	}


