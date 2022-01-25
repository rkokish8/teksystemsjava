
public class KidUsers implements ILibraryUser {
	int age;
	String bookType;

	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if (this.age > 12) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		} else {
			System.out.println("You have successfully registered under an Kids Account");
		}
		ILibraryUser.super.registerAccount();
	}

	@Override
	public void requestBook() {
		if (this.bookType == "Kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		ILibraryUser.super.requestBook();
	}

	@Override
	public String toString() {
		return "KidUsers [age=" + this.age + ", bookType=" + this.bookType + "]";
	}
	

}
