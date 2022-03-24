package library.inventory;

/**
 * Enum is a special "class" that represents a group of constants 
 * Only three valid InventoryStatuses are CIRCULATING, REFRENCE, and RESERVE
 * 
 * @author Caden Cruise
 * @version 1.0
 * @since 2021.03.23
 *
 */
public enum InventoryStatus {
	/**
	 * InventoryStatus for circulating inventory.
	 */
	CIRCULATING,
	
	/**
	 * InventoryStatus for reference inventory.
	 */
	REFRENCE,
	
	/**
	 * InventoryStatus for reserved inventory.
	 */
	RESERVE
}
