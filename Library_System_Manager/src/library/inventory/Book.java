package library.inventory;

/*  
 * The Book class is a subclass, deriving from it's parent/base class Inventory.
 * The Book extends the Inventory class. 
*/
public class Book extends Inventory {

	protected final String type = "Book";
	
	protected BookGenre bookType;
	
	// default constructor
	public Book(){
		/* Default age in years is 0.
		 * Default inventoryStatus is null.
		 * Default weight in pounds is 0.0.
		 */
		this(0, null, 0.0); // age, inventoryStatus, weight
	}
	
	/**
	 * Overload constructor that allows setting the object's default fields (attributes).
	 * 
	 * @param age Default age in years is 0.
	 * @param inventoryStatus Default inventoryStatus is null.
	 * @param weight Default weight in pounds is 0.0.
	 */
	public Book(int age, InventoryStatus inventoryStatus, double weight) {
		super(age, inventoryStatus, weight);
		this.bookType = null;
	}
	
	/**
	 * Get the Inventory's type.  This parent's class method has to be 
	 * overridden in the subclass otherwise we would only see the parent's 
	 * class type value of Inventory, and instead we want it to return Book.
	 */
	@Override // Whenever you override a method, you should use the @Override annotation so the compile verifies	
	public String getType() {
		return this.type;
	}
	
	/**
	 * Get the book's BookGenre type (enum: FICTION, NONFICTION, or OTHER).
	 * We do not need to validate BookGenre type because we are using an enum
	 * 
	 * @return The book's BookGenre type.
	 */
	public BookGenre getBookType() {
		return this.bookType;
	}

	/**
	 * Set the book's genre type.
	 * 
	 * @param movieType The book BookGenre type (enum: FICTION, NONFICTION, 
	 * or OTHER).
	 */
	public void setBookType(BookGenre bookType) {
		this.bookType = bookType;
	}	

	/**
	 * All books are available (behavior).
	 */
	public void available() {
		System.out.println(this.type + " is available...");
	}
	
}
