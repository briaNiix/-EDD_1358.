import java.util.ArrayList;

public class Tablahash<T> {
	
	 int key;
	    int tam;
	    T dato;
	    ArregloADT<T> Tabla;
	    ArrayList<T> array;


	    public Tablahash() {
	    }

	    public Tablahash(int tam) {
	        this.tam = tam;
	        Tabla = new ArregloADT(tam);
	    }
	   
	    public void add(int key, T dato){
	     int colocador = key%tam;
	     Tabla.setElemento(colocador, dato);
	    }

	    public T valueOf(int key){
	     int colocador = key%tam;   
	     return Tabla.getElemento(colocador) ; 
	    }
	 
	    public void remove(int key){
	     int colocador = key%tam; 
	     Tabla.limpiar(dato);
	    }

	    @Override
	    public String toString() {
	        return "-/-/-/"+Tabla+"-/-/-/"; 
	    }
	
}
