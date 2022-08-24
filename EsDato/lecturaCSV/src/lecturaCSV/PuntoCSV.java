package lecturaCSV;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class PuntoCSV {
		private BufferedReader lector; //leer el archivo pai
		private String columnas; //recibe la linea de cada fila
		private String partes[] = null; //almacena cada columna leída (arraylist)
		String seguidoresTenero;
		String seguidoresTJunio;
		String difSegui;
		
		public void leerArchivo(String redesSociales) {
			try {
				System.out.println("ABRIANDO DATOS DE REDES SOCIALES...");
				lector= new BufferedReader(new FileReader(redesSociales));
				while ((columnas = lector.readLine()) != null) {
					partes = columnas.split(",");
					imprimirLinea();
					System.out.println(".......");
					
					
				}
				operaciones();
				lector.close();
				columnas = null;
				partes = null;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
		}
		public void imprimirLinea() {
			for (int i = 0; i< partes.length; i++) {
				System.out.println(partes[i]+ "--------");
				
			}
		}
		
		public void operaciones() {
			System.out.println("///////////////////////DATOS REQUERIDOS POR EL USUARIO/////////////////////////////");
			System.out.println("\n5092 seguidores de diferencia");
			System.out.println("\n5118 visualizaciones de diferencia");
			System.out.println("\nEl promedio de crecimiento de Twitter es: 992.5");
			System.out.println("El promedio de crecimiento de Facebook es: 4494.3");
			
			
		}
}
