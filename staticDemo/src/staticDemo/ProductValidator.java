package staticDemo;

//iþlemlerin doðruluðunu kontrol etmek için kullanýlýr..
public class ProductValidator {
	static {
		System.out.println(" Static Yapýcý blok çalýþtýrýldý");
	}
	
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtýrýldý");
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
