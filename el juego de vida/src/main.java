
public class main {

	 public static void main(String[] args) {
		 
	        Tablero t = new Tablero();
	       
	       
	        System.out.println("------------------------");
	        
	        System.out.println(t.getTablero());
	       //ingresa las generaciones en el indice.
	        for(int i=0; i<7;i++){
	            t.reglas();
	            t.contarVecinos();
	            System.out.println("Generacion: " + i + "\n" + t.getTablero());
	        }
	        System.out.println("------------------------");    
	    }
}
