package library.testing; 

import java.util.ArrayList;
import java.util.List;

import library.inventory.*;

public class TestBench {
	
	private static List<Inventory> libraryInventory = new ArrayList<>();
	
	TestBench(){
	}
	
	private static void unitTest1_Inventory_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();

		Inventory inventory = new Inventory();
		libraryInventory.add(inventory);
		TestBench.displayInfo(inventory);
		
		inventory.setLocation("A-10");
		inventory.setInventoryStatus(InventoryStatus.CIRCULATING);
		inventory.setValue(5.5);
		displayInfo(inventory);	
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}
	
	private static void unitTest2_Inventory_Overload() {	
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Inventory inventory = new Inventory("B-10", InventoryStatus.CIRCULATING, 4.99);
		libraryInventory.add(inventory);
		displayInfo(inventory);

		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}

	private static void unitTest3_Movie_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Movie movie = new Movie();
		libraryInventory.add(movie);
		displayInfo(movie);
		
		movie.setLocation("C-15");
		movie.setInventoryStatus(InventoryStatus.REFRENCE);
		movie.setValue(4.50);
		displayInfo(movie);
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}

	private static void unitTest4_Book_Overload() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Book book = new Book("D-85", InventoryStatus.RESERVE, 10.50);
		libraryInventory.add(book);
		displayInfo(book);
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}
	
	private static void unitTest5_Invalid_Data() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Movie movie = new Movie("", InventoryStatus.REFRENCE, -1);	
		TestBench.displayInfo(movie);
		
		movie.setTitle("The Temple of Doom");
		System.out.println("This movie is a " + movie.getMovieType() + " movie.");
		movie.setMovieType(MovieGenre.ACTION);
		System.out.println("This movie's title is " + movie.getTitle());
		System.out.println();
		
		Book book = new Book("", InventoryStatus.CIRCULATING, -10.5);	
		TestBench.displayInfo(book);
		book.setTitle("Animal Farm");
		System.out.println("the book's title is " + book.getTitle());
		book.setBookType(BookGenre.NONFICTION);
		System.out.println("This book is a " + book.getBookType() + " book");

		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}
		
	private static void displayInfo(Inventory inventory) {
		System.out.printf("ID: %-3d  Type: %-10s Inventory Status: %-18s Location: %10s   Value: %8.2f\n",
				inventory.getId(), inventory.getType(), inventory.getInventoryStatus(), inventory.getLocation(), inventory.getValue());
	} 

	private static void displayReport() {
		
		System.out.println();
		System.out.println("================== Inventory REPORT ==================");
		System.out.println("ID  Type       Inventory Status    Location   Value");
		System.out.println("=== ========== ==================  ========== ========");
		
		for (Inventory inventory : libraryInventory) {
			System.out.printf("%-3d %-10s %-18s %10s %8.2f\n",
					inventory.getId(), inventory.getType(), inventory.getInventoryStatus(), inventory.getLocation(), inventory.getValue());
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		TestBench.unitTest1_Inventory_Default();
		TestBench.unitTest2_Inventory_Overload();
		TestBench.unitTest3_Movie_Default();
		TestBench.unitTest4_Book_Overload();
		TestBench.unitTest5_Invalid_Data();
		
		TestBench.displayReport();
		
	}

}
