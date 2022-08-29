import java.util.ArrayList;

public class ArrayADT {
		int tamanio;
		ArrayList listaObj= new ArrayList(this.tamanio);
		
		public ArrayADT(int tamanio) {
			this.tamanio= tamanio;
				System.out.println("Arreglo con éxito, tamaño de" + tamanio);
				
				for(int i=0; i < tamanio; i++) {
					listaObj.add(null);
				}
				System.out.println(listaObj);
			
		}
		public int gettamanio() {
			return listaObj.size();
		}
		
		public void setElemento(int indice, Object item) {
			listaObj.set(indice, item);
		}
		
		
		public void getelemento(int indice) {
			listaObj.get(indice);
		}
		
		public void limpiar() {
			for(int i=0; i< tamanio; i++) {
				listaObj.set(i, null);
			}
		}
		public String toString() {
			return listaObj.toString();
		}
}
