package staticDemo;

public class ProductManager {
	public void add(Product product) {
		ProductValidator validator = new ProductValidator();
		
		if(ProductValidator.isValid(product)) {
		System.out.println("Eklenedi");
		}else {
			System.out.println("Ürün bilgileri geçersiz.");
		}
		
		validator.baskaOperasyon();
	}
}
