
public class LibraryInterfaceDemo {

	public static void main(String[] args) {

		KidUsers amber = new KidUsers(10, "Kids");
		KidUsers fred = new KidUsers(18, "Fiction");

		AdultUser barb = new AdultUser(5, "Kids");
		AdultUser derrick = new AdultUser(23, "Fiction");

		amber.registerAccount();
		amber.requestBook();
		System.out.println();

		fred.registerAccount();
		fred.requestBook();
		System.out.println();

		barb.registerAccount();
		barb.requestBook();
		System.out.println();

		derrick.registerAccount();
		derrick.requestBook();
		System.out.println();

	}

}
