
public class Tablero {

	 private Arreglo2DADT tablero;

	    public Tablero() {
	    //ingresa el tamaño de tu mapa.
	    	tablero = new Arreglo2DADT(10, 10);
	        for (int col = 0; col < 10; col++)
	        {
	            for (int ren = 0; ren < 10; ren++)
	            {
	                tablero.setElemento(ren, col, new Celula(ren, col));
	            }
	        }
	       //ingresa el numero de celular que quieres dar vida.
	        Celula var;
	        var = (Celula) tablero.getElemento(1, 1);
	        var.setVida(true);
	        var = (Celula) tablero.getElemento(2, 2);
	        var.setVida(true);
	        var = (Celula) tablero.getElemento(2, 8);
	        var.setVida(true);
	        var = (Celula) tablero.getElemento(2, 1);
	        var.setVida(true);
	        var = (Celula) tablero.getElemento(3, 6);
	        var.setVida(true);
	        ;
	        

	        contarVecinos();
	    }

	    public void contarVecinos() {

	        for (int col = 0; col < 10; col++)
	        {
	            for (int ren = 0; ren < 10; ren++)
	            {
	                Celula actual = (Celula) tablero.getElemento(ren, col);
	                if (col > 0 && col < 9 && ren > 0 && ren < 9)
	                {

	                    for (int c = col - 1; c <= col + 1; c++)
	                    {
	                        for (int r = ren - 1; r <= ren + 1; r++)
	                        {
	                            Celula t = (Celula) tablero.getElemento(r, c);
	                            if (t.conVida() && !(c == col && r == ren))
	                            {
	                                actual.setNumVecinosVivos(actual.getNumVecinosVivos() + 1);
	                            }
	                        }
	                    }

	                } else
	                {

	                    int cCol, cRen, mxCol,mxRen;
	                    
	                    if(col==0){
	                    	cCol = 0;
	                    	mxCol = 2;
	                    }else if(col==9){
	                    	cCol = 8;
	                    	mxCol = 10;
	                    }else{
	                    	cCol = col-1;
	                    	mxCol = col+2;
	                    }
	                    
	                    if(ren==0){
	                    	cRen = 0;
	                    	mxRen = 2;
	                    }else if(ren==9){
	                    	cRen = 8;
	                    	mxRen = 10;
	                    }else{
	                    	cRen = ren-1;
	                    	mxRen = ren+2;
	                    }
	                    
	                    for(int i = cCol;i<mxCol;i++){
	                        for(int j = cRen; j<mxRen;j++){
	                            Celula t = (Celula) tablero.getElemento(j, i);
	                            if (t.conVida() && !(i == col && j == ren))
	                            {
	                                actual.setNumVecinosVivos(actual.getNumVecinosVivos() + 1);
	                            }
	                        }
	                    }
	                    
	                    
	                    
	                }
	            }
	        }
	    }

	    public void reglas() {

	        for (int col = 0; col < 10; col++)
	        {
	            for (int ren = 0; ren < 10; ren++)
	            {
	                Celula t = (Celula) tablero.getElemento(ren, col);
	                if (t.conVida())
	                {

	                    if (t.getNumVecinosVivos() >= 4)
	                    {
	                        t.setVida(false);
	                    } else if (t.getNumVecinosVivos() <= 1)
	                    {
	                        t.setVida(false);
	                    }

	                } else
	                {
	                    if (t.getNumVecinosVivos() == 3)
	                    {

	                        t.setVida(true);
	                    }
	                }
	            }
	        }
	    }

	    public Arreglo2DADT getTablero() {
	        return tablero;
	    }
	
}
