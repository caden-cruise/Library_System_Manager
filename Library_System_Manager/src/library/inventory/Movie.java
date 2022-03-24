package library.inventory;

/*  
 * The Book class is a subclass, deriving from it's parent/base class Inventory.
 * The Book extends the Inventory class. 
*/
public class Movie extends Inventory {

	protected final String type = "Book";
	
	protected MovieGenre movieType;
	
	// default constructor
	public Movie(){
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
	public Movie(int age, InventoryStatus inventoryStatus, double weight) {
		super(age, inventoryStatus, weight);
		this.movieType = null;
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
	 * Get the movie's MovieGenre type (enum: ACTION, ADVENTURE, 
	 * COMEDY, or OTHER).
	 * We do not need to validate MovieGenre type because we are using an enum
	 * 
	 * @return The movie's MovieGenre type.
	 */
	public MovieGenre getMovieType() {
		return this.movieType;
	}

	/**
	 * Set the movie's genre type.
	 * 
	 * @param movieType The movie MovieGenre type (enum: ACTION, ADVENTURE, 
	 * COMEDY, or RESERVE).
	 */
	public void setMovieType(MovieGenre movieType) {
		this.movieType = movieType;
	}	

	/**
	 * All movies can be sold (action).
	 */
	public void sold() {
		System.out.println(this.type + " is sold...");
	}
	
}
