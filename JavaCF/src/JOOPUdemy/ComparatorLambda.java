package JOOPUdemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import JOOPUdemy.model.entities.Product;

public class ComparatorLambda {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 500.0));
		list.add(new Product("Note", 1100.0));
		list.add(new Product("Test", 5200.0));
		
		String sum = filteredSum(list, p -> p.getValue() < 600);
		System.out.println(sum);
	}
	
	public static String filteredSum(List<Product> p, Predicate<Product> criteria) {
		String sum = null;
		for(Product x : p) {
			if(criteria.test(x)) {
				sum = x.getName();
			}
		}
		return sum;
	}
}


