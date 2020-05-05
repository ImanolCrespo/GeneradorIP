package ed20_JUnit02_DireccionesIP;

import java.util.Random;

public class GeneradorIP {
	
	Random rnd = new Random();
	
	public int generarNumero(int min, int max) {
		
		int numero = rnd.nextInt(max);
		return numero;
	}
	
	public String generarIP() {
		
		String iP="";
		
		for (int i = 0; i < 3; i++) {
			int numero;
			if (i==0) {
				numero = generarNumero(1, 255);
			}else {
				numero = generarNumero(0, 255);
			}
			
			if (iP.length()==0) {
				iP = (iP+numero);
			}else {
				iP= (iP+"."+numero);
			}
		}
		return iP;
	}

}
