package java8;

import java.util.*;
import java.util.stream.Collectors;

class Products {
	int id;
	String name;
	float price;

	public Products(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class StreamWith_WithOut_Filter {
	public static void main(String[] args) {
		List<Products> productsList = new ArrayList<Products>();
		// Adding Products
		productsList.add(new Products(1, "HP Laptop", 25000f));
		productsList.add(new Products(2, "Dell Laptop", 30000f));
		productsList.add(new Products(3, "Lenevo Laptop", 28000f));
		productsList.add(new Products(4, "Sony Laptop", 28000f));
		productsList.add(new Products(5, "Apple Laptop", 90000f));
		List<Float> productPriceList = new ArrayList<Float>();

		for (Products product : productsList) {

			// filtering data of list
			if (product.price < 30000) {
				productPriceList.add(product.price); // adding price to a productPriceList
			}
		}

		List<Float> productPriceList2 = productsList.stream()
				.filter(p -> p.price < 30000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		
		System.out.println("List2"+productPriceList2);
		System.out.println(productsList);
		System.out.println("List1"+productPriceList); // displaying data
	}
}
