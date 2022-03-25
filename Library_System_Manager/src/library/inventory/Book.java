package library.inventory;

/*  
 * The Book class is a subclass, deriving from it's parent/base class Inventory.
 * The Book extends the Inventory class. 
*/
public class Book extends Inventory {

	protected final String type = "Book";
	
	protected BookGenre bookType;
	protected String author;
	protected String title;
	
	// default constructor
	public Book(){
		/* Default location is null.
		 * Default inventoryStatus is null.
		 * Default value in dollars is 0.00.
		 */
		this(null, null, 0.0); // location, inventoryStatus, value
	}
	
	/**
	 * Overload constructor that allows setting the object's default fields (attributes).
	 * 
	 * @param location Default location is null.
	 * @param inventoryStatus Default inventoryStatus is null.
	 * @param value Default value in dollars is 0.00.
	 */
	public Book(String location, InventoryStatus inventoryStatus, double value) {
		super(location, inventoryStatus, value);
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
	 * Gets the book author's name
	 * 
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the book author's name
	 * 
	 * @param author the author of the book 
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the book title.
	 * 
	 * @return the title of the book 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the book title. 
	 * 
	 * @param title the title of the book 
	 */
	public void setTitle(String title) {
		this.title = title;
	}	
	
	
	
}
