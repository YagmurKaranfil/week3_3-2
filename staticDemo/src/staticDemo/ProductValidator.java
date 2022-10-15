package staticDemo;

//i�lemlerin do�rulu�unu kontrol etmek i�in kullan�l�r..
public class ProductValidator {
	static {
		System.out.println(" Static Yap�c� blok �al��t�r�ld�");
	}
	
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�r�ld�");
	}
	
	public static  boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void bisey() {
		
	}
	
	
	

}
