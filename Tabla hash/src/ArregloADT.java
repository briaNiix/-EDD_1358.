import java.util.ArrayList;

public class ArregloADT<T>  {
	 int tama�o;
	  ArrayList<T> L;

	    public ArregloADT(int tam) {
	        this.tama�o = tam;
	        L = new ArrayList(this.tama�o);
	        for (int i = 0; i < this.tama�o; i++) {
	            this.L.add(null);
	        }
	    }

	    public T getElemento(int indice) {
	        if (comprobacion(indice)) {
	            return this.L.get(indice);
	        } else {
	            System.out.println("Fuera del rango");
	        }
	        return null;
	    }

	    private boolean comprobacion(int indice) {
	        return indice >= 0 && indice < this.tama�o;
	    }

	    public void setElemento(int indice, T dato) {
	        if (comprobacion(indice)) {
	            this.L.set(indice, dato);
	        } else {
	            System.out.println("Fuera del rango");
	        }
	    }

	    public int getLongitud() {
	        return this.tama�o;
	    }

	    public void limpiar(T dat) {
	        for (int i = 0; i < this.tama�o; i++) {
	            this.L.set(i, dat);
	        }
	    }
	    
	    public String toString(){
	        String estado = "-/-/-/-/-/ "+"Lugares disponibles: "+this.tama�o+" -/-/-/-/-/\n";
	        for (T dat : L) {
	            if(dat != null){
	                estado += dat.toString()+"\n";
	            }
	        }
	        return estado;
	    }
}
