
public class CircuitBreaker {

	public static void circuitBreaker() {
		for(int ind=0;ind<6;ind++) {
			try {
				if(ind < 2) {
					System.out.println("El coche arranca");
					Thread.sleep(1000);
				}
			
				else if(ind >= 2 && ind < 5) {
					System.out.println("El coche arranca pero tiene poca gasolina");
					Thread.sleep(1000);
					
				}
				else {
					System.err.println("El coche se quedo sin gasolina");
					break;
				}
			}catch (Exception e) {
				
			}
			
			
		}
	}
}
