package library.inventory; // package to store all the different types of animals

/**
 * The base class (parent class / super class) for all types of inventory in the Library. 
 * 
 * @author Caden Cruise
 * @version 1.0
 * @since 2021.03.23
 *
 */
public class Inventory {
	
	/*
	 * member fields (attributes) each inventory instance (object) stores its own
	 * values unless it's a static field, then it's shared by all instances
	 * (objects) of the class.  Static fields can also be called class variables. 
	 */
	
	/**
	 * auto incremented counter each time a new inventory is created, this field
	 * is only updated by the default constructor.
	 */
	private static int counter = 0;

	/**
	 * Default inventory type is Inventory, but this should always get changes
	 * in the subclasses (child class / derived class).  It's final so it 
	 * can't be internally changed.
	 */
	protected final String type = "Inventory"; 
	
	/**
	 * The inventory ID, which is auto generated by a static Class counter.
	 */
	protected int id = 0;
	
	/**
	 * The library inventory location.
	 */
	protected int location;
	
	/**
	 * The inventory's inventoryStatus; enum InventoryStatus values are CIRCULATING,
	 * REFRENCE, or RESERVE.
	 */
	protected InventoryStatus inventoryStatus;
	
	/**
	 * The animal's weight in pounds.
	 */
	protected double weight;
	
	/**
	 * Default constructor will automatically runs when an object is created
	 * using the new keyword, and no arguments are passed to the constructor.
	 * 
	 * The Java compiler will create an empty default constructor if the 
	 * programmer doesn't write one. 
	 * 
	 * Typically the default constructor is used to handle housekeeping items when
	 * a object is first created. 
	 */
	public Inventory(){
		
		/*
		 * There are no setters for the animal's id because it can only be 
		 * set once in the default constructor, based on the Zoo animal count.
		 */
		Inventory.counter++;
		this.id = Inventory.counter;
		
		this.location = 0;
		this.inventoryStatus = null;
		this.weight = 0.0;
	}
	
	/**
	 * Overload constructor that allows setting the object's default fields (attributes).
	 * 
	 * @param age Default age in years is 0.
	 * @param inventoryStatus Default inventoryStatus is null.
	 * @param weight Default weight in pounds is 0.0.
	 */
	public Inventory(int age, InventoryStatus inventoryStatus, double weight){
		
		this();
		
		this.setAge(age);
		this.setGender(inventoryStatus);
		this.setWeight(weight);
	}
	
	/* 
	 * The meaning of Encapsulation, is to make sure that "sensitive" data 
	 * is hidden from users.
	 * 
	 * class fields (attributes) should typically be declared as private 
	 * and then provide public get (getters or accessors) and set methods (setters or mutators) 
	 * to access and update the value of a private variable.
	 */

	/**
	 * Get the animal's ID. There is no setter because this can't be changed
	 * after it's been set by the constructor. 
	 * 
	 * @return The animal unique ID.
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * Set the animals age in years.
	 * The animal age can not be negative, and if it is set it to zero.
	 * 
	 * @param location The animals age in years.
	 */
	public int getAge() {
		return this.location;
	}

	/**
	 * Get the animal's age in years.
	 * 
	 * @return The animal's age in years.
	 */
	public void setAge(int age) {
		if (age >= 0)
			this.location = age;
		else
			this.location = 0;
	}
	
	/**
	 * Get the animal's InventoryStatus.
	 * 
	 * @return The animal's InventoryStatus (enum CIRCULATING or REFRENCE).
	 */
	public InventoryStatus getGender() {
		return this.inventoryStatus;
	}

	/**
	 * Set the animal's InventoryStatus.
	 * 
	 * @param inventoryStatus The animal's InventoryStatus (enum CIRCULATING or REFRENCE).
	 */
	public void setGender(InventoryStatus inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}

	/**
	 * Get the animal's weight in pounds.
	 * 
	 * @return The animal's weight in pounds.
	 */
	public double getWeight() {
		return this.weight;
	}

	/**
	 * Set the animals weight in pounds.
	 * The animal weight can not be negative, and if it is set it to zero.
	 * 
	 * @param weight The animal's weight in pounds.
	 */
	public void setWeight(double weight) {
		if (weight >= 0)
			this.weight = weight;
		else
			this.weight = 0.0;
	}

	/**
	 * Get the animal's type.  This is a final field that can't be
	 * changed once set by the animal class or subclass.  There is
	 * no setter since it can't be changed. 
	 * 
	 * @return The animal's type.
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * All animals can eat (behavior). 
	 */
 	public void eat() {
		System.out.println(this.type + " is eating....");
	}
	
 	/**
 	 * All animals can sleep (behavior).
 	 */
	public void sleep() {
		System.out.println(this.type + " is sleeping...");
	}
	
}
