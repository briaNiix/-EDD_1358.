
public class barquito {
	 public static void main(String[] args) {
		 ColaPrioridad barquito = new ColaPrioridad<>(6);
		 		
		 barquito.queue(4, "Maestre");
		 barquito.queue(2, "Niños");
		 barquito.queue(4, "Mecanico");
		 barquito.queue(3, "Hombres");
		 barquito.queue(4, "Vigia");
		 barquito.queue(5, "Capitan");
		 barquito.queue(4, "Timonel");
		 barquito.queue(3, "Mujeres");
		 barquito.queue(2, "3ra Edad");
		 barquito.queue(1, "Niñas");
		 		
		 		System.out.println(barquito);
		     }

		 }

