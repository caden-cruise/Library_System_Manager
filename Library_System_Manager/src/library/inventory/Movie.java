package library.inventory;

/*  
 * The Book class is a subclass, deriving from it's parent/base class Inventory.
 * The Book extends the Inventory class. 
*/
public class Movie extends Inventory {

	protected final String type = "Book";
	
	protected MovieGenre movieType;
	protected String director;
	protected String title;
	
	
	// default constructor
	public Movie(){
		/* Default location is null.
		 * Default inventoryStatus is null.
		 * Default value in dollars is 0.00.
		 */
		this(null, null, 0.00); // age, inventoryStatus, value
	}
	
	/**
	 * Overload constructor that allows setting the object's default fields (attributes).
	 * 
	 * @param location Default location is null.
	 * @param inventoryStatus Default inventoryStatus is null.
	 * @param value Default value in pounds is 0.00.
	 */
	public Movie(String location, InventoryStatus inventoryStatus, double value) {
		super(location, inventoryStatus, value);
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
	 * Get's the movie's director name
	 * 
	 * @return The director of the movie
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * Sets the movie's director name
	 * 
	 * @param director The director of the movie
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * Gets the movie title
	 * 
	 * @return The title of the movie 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the movie title 
	 * 
	 * @param title The title of the movie
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
}
