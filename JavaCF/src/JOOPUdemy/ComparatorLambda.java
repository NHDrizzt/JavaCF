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
		
		list.forEach(p -> p.setValue(p.getValue() * 1.1));
		list.forEach(t -> System.out.println(t));
	}
}
