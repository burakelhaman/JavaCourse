package oop1;

public class Main {
	// oop = Object Oriented Programming
	public static void main(String[] args) {

		Product product1 = new Product();
		// set value
		product1.setName("Delonghi Kahve Makinası");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.img");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinası");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image2.img");

		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinası");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image3.img");

		// products dizisine ürünler eklendi
		Product[] products = { product1, product2, product3 };

		// products dizisinin içinde product ismi ile dön
		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCostumer individualCostumer = new IndividualCostumer();
		individualCostumer.setId(1);
		individualCostumer.setPhone("05366656565");
		individualCostumer.setCostumerNumber("12345");
		individualCostumer.setFirstName("Burak");
		individualCostumer.setLastName("Elhaman");

		CorporateCostumer corporateCostumer = new CorporateCostumer();
		corporateCostumer.setId(2);
		corporateCostumer.setCompanyName("Kodlama.io");
		corporateCostumer.setPhone("03656656556");
		corporateCostumer.setTaxNumber("1111111111");
		corporateCostumer.setCostumerNumber("54321");

		Costumer[] costumers = { individualCostumer, corporateCostumer };

	}

}
