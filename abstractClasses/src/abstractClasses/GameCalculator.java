package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	
//GameCalculatorý kim kullanýyorsa gameOver ý olduðu gibi kullanmak zorunda
//hesapla da kim inherit ediyorsa hesaplayý içermek zorunda fakat hesaplayý override etmek zorunda yani kendi metodunu yazacak
}
