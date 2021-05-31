package JOOPUdemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import JOOPUdemy.model.entities.Product;

public class ComparatorLambda {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 500.0));
		list.add(new Product("Note", 1100.0));
		list.add(new Product("Test", 5200.0));
		
		List<String> lstring = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		lstring.forEach(t -> System.out.println(t));
	}
}
