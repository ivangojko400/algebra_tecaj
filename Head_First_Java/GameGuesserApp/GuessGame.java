class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame(){
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int p1Guess = 0;
		int p2Guess = 0;
		int p3Guess = 0;
		
		boolean p1Right = false;
		boolean p2Right = false;
		boolean p3Right = false;
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Mislim na broj izmedu 0 i 9, probajte pogodit");
		
		while(true){
			p1.guess();
			p2.guess();
			p3.guess();
			p1Guess = p1.getNumber();
			System.out.println("Igrac 1: " + p1Guess);
			p2Guess = p2.getNumber();
			System.out.println("Igrac 2: " + p2Guess);
			p3Guess = p3.getNumber();
			System.out.println("Igrac 3: " + p3Guess);
			
			if (targetNumber == p1Guess) {
				System.out.println("Igrac 1 je pogodio, zamišljeni broj je " + targetNumber);
				p1Right = true;
			}
			if (targetNumber == p2Guess) {
				System.out.println("Igrac 2 je pogodio, zamišljeni broj je " + targetNumber);
				p2Right = true;
			}
			if (targetNumber == p3Guess) {
				System.out.println("Igrac 3 je pogodio, zamišljeni broj je " + targetNumber);
				p3Right = true;
			}
			
			if(p1Right || p2Right || p3Right){
				System.out.println("Hvala Vam na sudjelovanju");
				break;
			} else {
				System.out.println("Nitko nije pogodio, zamišljeni broj je " + targetNumber);
				System.out.println("Idemo ponovno!");
			}
		}
	}
}