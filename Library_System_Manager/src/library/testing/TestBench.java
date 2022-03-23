package library.testing; 

import java.util.ArrayList;
import java.util.List;

import library.inventory.*;

public class TestBench {
	
	private static List<Inventory> zooAnimals = new ArrayList<>();
	
	TestBench(){
	}
	
	private static void unitTest1_Animal_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();

		Inventory inventory = new Inventory();
		zooAnimals.add(inventory);
		TestBench.displayInfo(inventory);
		
		inventory.setAge(1);
		inventory.setGender(InventoryStatus.FEMALE);
		inventory.setWeight(5.5);
		displayInfo(inventory);	
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}
	
	private static void unitTest2_Animal_Overload() {	
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Inventory inventory = new Inventory(10, InventoryStatus.FEMALE, 100.0);
		zooAnimals.add(inventory);
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
		zooAnimals.add(movie);
		displayInfo(movie);
		
		movie.setAge(1);
		movie.setGender(InventoryStatus.MALE);
		movie.setWeight(0.5);
		displayInfo(movie);
		
		movie.eat();
		movie.sleep();
//		movie.fly();
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}

	private static void unitTest4_Fish_Overload() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Book book = new Book(2, InventoryStatus.MALE, 10.5);
		zooAnimals.add(book);
		displayInfo(book);
		
		book.eat();
		book.sleep();
		book.swim();
		
		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}
	
	private static void unitTest5_Invalid_Data() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Movie movie = new Movie(-2, InventoryStatus.MALE, -10.5);	
		TestBench.displayInfo(movie);
		
//		movie.setWingspan(-1);
//		System.out.println("The bird's wingspan is " + movie.getWingspan());
//		System.out.println();
		
		Book book = new Book(-2, InventoryStatus.FEMALE, -10.5);	
		TestBench.displayInfo(book);
		book.setWaterType(BookGenre.SALT);
		System.out.println("The fish is a " + book.getWaterType() + " water fish");

		System.out.println();
		System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
	}
		
	private static void displayInfo(Inventory inventory) {
		System.out.printf("ID: %-3d  Type: %-10s InventoryStatus: %-10s Age: %3d   Weight: %8.2f\n",
				inventory.getId(), inventory.getType(), inventory.getGender(), inventory.getAge(), inventory.getWeight());
	} 

	private static void displayReport() {
		
		System.out.println();
		System.out.println("============== ZOO REPORT ============");
		System.out.println("ID  Type       InventoryStatus     Age   Weight");
		System.out.println("=== ========== ========== === ========");
		
		for (Inventory inventory : zooAnimals) {
			System.out.printf("%-3d %-10s %-10s %3d %8.2f\n",
					inventory.getId(), inventory.getType(), inventory.getGender(), inventory.getAge(), inventory.getWeight());
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
