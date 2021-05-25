package JOOPUdemy;

import java.util.ArrayList;
import java.util.List;

import JOOPUdemy.model.entities.Product;

public class ComparatorLambda {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 500.0));
		list.add(new Product("Note", 1100.0));
		list.add(new Product("Test", 5200.0));
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product x : list) {
			System.out.println(x);
		}
		
		
	}
}
