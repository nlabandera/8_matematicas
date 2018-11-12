
public class E83 {

	public static void main(String[] args) {
		
		int[][] matriz= new int[5][5];
		
		  int x=0; 	//Filas
		  int y=0;	//Col
		 
		  for (x=0; x < matriz.length; x++) { 
		        
		    	// j son las columnas
		    	for ( y=0; y < matriz[x].length; y++) 
		  
		    		if (x == y) 
		    			
		                matriz[x][y]= 2;
		                		
		            
		    		else 
		                matriz[x][y] = 0;
		  }
		  
		 for ( x=0; y< matriz.length; x++) {
		    	
		        for ( y=0; y < matriz[x].length; x++) 
		            System.out.print(matriz[x][y]+"\t");
		       
		        System.out.println("");
		 }

	}

}
