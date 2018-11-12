import java.util.*;

public class E82 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int nAdivinar =( (int)(Math.random()*100+1));
		//System.out.println(nAdivinar);
		
		int i;
		int nUsuario=0;
		
		for (i=1; i<=6; i++) {
		
			System.out.println("Intento " +i);
			System.out.println("Adivine el número del 1 al 100:");
			nUsuario=teclado.nextInt();
			
			
			if(nUsuario!=nAdivinar) {
				
				if(nUsuario<nAdivinar) 
					System.out.println("Pista: el número es mayor. \n");
				if(nUsuario>nAdivinar) 
					System.out.println("Pista: el número es menor. \n");
			}
			else break;
			
			
		}
		
		if (nUsuario==nAdivinar)
			System.out.println("Acertaste!");
		
		else {
			System.out.println("Te has pasado de intentos");
			System.out.println("El número era " +nAdivinar+".");
		}
	}

}
