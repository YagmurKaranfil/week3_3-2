package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	
//GameCalculator� kim kullan�yorsa gameOver � oldu�u gibi kullanmak zorunda
//hesapla da kim inherit ediyorsa hesaplay� i�ermek zorunda fakat hesaplay� override etmek zorunda yani kendi metodunu yazacak
}
