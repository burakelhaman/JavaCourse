package oopWithNLayeredApp.dataAccess;

//JDBC türünde database yazımı

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
