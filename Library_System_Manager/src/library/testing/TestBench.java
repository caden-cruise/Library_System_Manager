package library.testing; 

import java.util.ArrayList;
import java.util.List;

import library.inventory.*;

public class TestBench {
	
	private static List<Inventory> libraryInventory = new ArrayList<>();
	
	TestBench(){
	}
	
	private static void unitTest1_Animal_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();

		Inventory inventory = new Inventory();
		libraryInventory.add(inventory);
		TestBench.displayInfo(inventory);
		
		inventory.setLocation("Available");
		inventory.setInventoryStatus(InventoryStatus.CIRCULATING);
		inventory.setValue(5.5);
		displayInfo(inventory);	
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}
	
	private static void unitTest2_Animal_Overload() {	
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Inventory inventory = new Inventory("B-10", InventoryStatus.CIRCULATING, 100.0);
		libraryInventory.add(inventory);
		displayInfo(inventory);

		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}

	private static void unitTest3_Bird_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Movie movie = new Movie();
		libraryInventory.add(movie);
		displayInfo(movie);
		
		movie.setLocation();
		movie.setInventoryStatus(InventoryStatus.REFRENCE);
		movie.setValue(0.5);
		displayInfo(movie);
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}

	private static void unitTest4_Fish_Overload() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Book book = new Book(2, InventoryStatus.REFRENCE, 10.5);
		libraryInventory.add(book);
		displayInfo(book);
		
		book.eat();
		book.sleep();
		book.available();
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}
	
	private static void unitTest5_Invalid_Data() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Movie movie = new Movie(-2, InventoryStatus.REFRENCE, -10.5);	
		TestBench.displayInfo(movie);
		
//		movie.setWingspan(-1);
//		System.out.println("The bird's wingspan is " + movie.getWingspan());
//		System.out.println();
		
		Book book = new Book(-2, InventoryStatus.CIRCULATING, -10.5);	
		TestBench.displayInfo(book);
		book.setBookType(BookGenre.NONFICTION);
		System.out.println("The fish is a " + book.getBookType() + " water fish");

		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}
		
	private static void displayInfo(Inventory inventory) {
		System.out.printf("ID: %-3d  Type: %-10s InventoryStatus: %-10s Age: %3d   Weight: %8.2f\n",
				inventory.getId(), inventory.getType(), inventory.getInventoryStatus(), inventory.getLocation(), inventory.getValue());
	} 

	private static void displayReport() {
		
		System.out.println();
		System.out.println("============== ZOO REPORT ============");
		System.out.println("ID  Type       InventoryStatus     Age   Weight");
		System.out.println("=== ========== ========== === ========");
		
		for (Inventory inventory : libraryInventory) {
			System.out.printf("%-3d %-10s %-10s %3d %8.2f\n",
					inventory.getId(), inventory.getType(), inventory.getInventoryStatus(), inventory.getLocation(), inventory.getValue());
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		TestBench.unitTest1_Animal_Default();
		TestBench.unitTest2_Animal_Overload();
		TestBench.unitTest3_Bird_Default();
		TestBench.unitTest4_Fish_Overload();
		TestBench.unitTest5_Invalid_Data();
		
		TestBench.displayReport();
		
	}

}
