
public class main {

	public static void main(String[] args) {
			
		ArrayADT arregloADT = new ArrayADT(5);
		
		System.out.println("imprimir arreglo");
		System.out.println(arregloADT.toString());
		
		System.out.println("El tamaño de tu arreglo es:");
		System.out.println(arregloADT.gettamanio());
		
		System.out.println("-----------------------------------------");
		arregloADT.setElemento(0, "Esto");
		arregloADT.setElemento(1, "es");
		arregloADT.setElemento(2, "una");
		arregloADT.setElemento(3, "prueba");
		arregloADT.setElemento(4, "de función");
		System.out.println(arregloADT.toString());
		System.out.println("limpiar arreglo");
		arregloADT.limpiar();
	}

}
