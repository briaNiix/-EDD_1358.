
public class main {
	public static void main(String[] args) {
		
		
		ListaDoblementeLigada<Integer> head = new ListaDoblementeLigada<Integer>();
		//Agrega tus valores a guardar
		System.out.println("---------- Valores iniciales ----------");
		head.agregar_al_inicio(18);
		head.agregar_al_final(06);
		head.agregar_al_final(2003);
		head.transversal();
			System.out.println("\nEl tamaño de la lista es: "+ head.get_tamanio());
			System.out.println("..................................................\n");
			System.out.println("\nAgregar al inicio: \n");
		head.agregar_al_inicio(12);
		head.transversal();
			System.out.println("\nEl tamaño de la lista es:: "+ head.get_tamanio());
			System.out.println("..................................................\n");
			System.out.println("\nAgregar despues de:");
		head.agregar_despues_de(2004, 3);
		head.transversal();
			System.out.println("\nEl tamaño de la lista es:: "+ head.get_tamanio());
			System.out.println("..................................................\n");
			System.out.println("\nAgregar al final:\n");
		head.agregar_al_final(25);
		head.transversal();
			System.out.println("\nEl tamaño de la lista es:: "+ head.get_tamanio());
			System.out.println("..................................................\n");
			System.out.println("\nEliminar el primero\n");
		head.Eliminar_el_primero();
		head.transversal();
			System.out.println("\nEl tamaño de la lista es:: "+ head.get_tamanio());
			System.out.println("..................................................\n");
			System.out.println("\nEliminar posición 2\n");
		head.Eliminar(3);
		head.transversal();
			System.out.println("\nEl tamaño de la lista es:: "+ head.get_tamanio());
			System.out.println("..................................................\n");
			System.out.println("\nEliminar al final\n");
		head.Eliminar_al_final();
		head.transversal();
			System.out.println("\nEl tamaño de la lista es:: "+ head.get_tamanio());
			System.out.println("..................................................\n");
			System.out.println("\nBuscar; buscar 44\n");
			System.out.println("Posición en la que esta: " + head.buscar(44));
			System.out.println("..................................................\n");
			System.out.println("\nActualizar el 44 a 3102\n");
		head.actualizar(2003, 2010);
		head.transversal();
			System.out.println("\nEl tamaño de la lista es:: "+ head.get_tamanio());
			System.out.println("..................................................\n");
	}
}
