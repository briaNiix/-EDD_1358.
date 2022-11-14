import java.util.ArrayList;

public class Colas<T> {
	
	int elem;
	private ArrayList<T> cola;
	
	public Colas(){
		cola = new ArrayList<T>();
	}
	
	public boolean is_empty() {
		return cola.isEmpty();
	}
	
	public int length() {
		return cola.size();
	}
	
	
	public void enqueue(T dato) {
		cola.add(dato);
	}
	
	public void dequeue() {
		
		T dato;
		
		if(is_empty()) {
			dato = null;
		}else {
			dato = cola.get(0);
			cola.remove(0);
		}
		
	}
	
	public String toString() {
		return "Cola -/-/" + this.cola + "-/-/";
	}
	
}
