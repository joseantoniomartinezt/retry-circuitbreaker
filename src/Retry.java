
public class Retry {

	public static void retry() {
		for(int ind=0;ind<5;ind++) {
			try {
				System.out.println("He fallado" + (ind + 1) + "veces");
				Thread.sleep(1000);
				if(ind==3) {
					System.err.println("Lo he intentado varias veces y no se soluciona");
					break;
				}
			}catch (Exception e) {
				
			}
			
			
		}
	}
}
