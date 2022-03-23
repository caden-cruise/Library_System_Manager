package library.inventory;

/*  
 * The Book class is a subclass, deriving from it's parent/base class Inventory.
 * The Book extends the Inventory class. 
*/
public class Movie extends Inventory {

	protected final String type = "Book";
	
	protected MovieGenre waterType;
	
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
		this.waterType = null;
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
	 * Get the fish's BookGenre type (enum: FRESH or SALT).
	 * We do not need to validate BookGenre type because we are using an enum
	 * 
	 * @return The fish's BookGenre type.
	 */
	public MovieGenre getWaterType() {
		return this.waterType;
	}

	/**
	 * Set the fish's water type.
	 * 
	 * @param waterType The fish BookGenre type (enum: FRESH or SALT).
	 */
	public void setWaterType(MovieGenre waterType) {
		this.waterType = waterType;
	}	

	/**
	 * All fish can swim (behavior).
	 */
	public void swim() {
		System.out.println(this.type + " is swimming...");
	}
	
}
