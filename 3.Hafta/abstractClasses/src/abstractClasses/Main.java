package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
        
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		
		
		
		/*
		GameCalculator gameCalculator = new GameCalculator() {
			
			@Override
			public void hesapla() {						-Kötü Bir Kullaným.
				// TODO Auto-generated method stub
				
			}
		};
		*/
	}

}
