package oopWithNLayeredApp.dataAccess;

//ProductDao Interface'i ProductManager ile Database Yazım türleri olan JDBC ve Hibernate arasındadır
//Ve bu Interface sayesinde JDBC ile Hibernate arasında geçiş yapmak kolay olur.

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {
	void add(Product product);

}
