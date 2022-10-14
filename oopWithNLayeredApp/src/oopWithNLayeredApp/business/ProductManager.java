package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;

//Bu sınıf ürünler ile Database arasında yer alır, eğer ürünler 
//önceden belirlenmiş şartları yerine getirirse Database'e aktarılır getiremezse olumsuz feedback verilir

import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

// ***** Özellik(Entiteis) Dışında bir Katman Başka Bir Katmanın Class'ını
// kullanırken sadece Interface Üzerinden
// Erişim Kurmalıdır.

//ProductDao Interface'ından productDao isimli değişken oluşturmamızın sebebi, ProductManager içerisine hangi DB yazım türü
//ile devam edileceğini belirtmek istememizdir



public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// iş kuralları
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}

		// ProductDao productDao = new JdbcProductDao();
		productDao.add(product);

		for (Logger logger : loggers) { // [db,file]
			logger.log(product.getName());
		}

	}
}