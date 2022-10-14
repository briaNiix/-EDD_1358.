package laberinto;

public class EjecutarLaberinto {
	public static void main(String[] args) {
		
		Tablero laberinto = new Tablero("C:\\Users\\braya\\OneDrive\\Escritorio\\EsDato\\laberinto\\src\\laberinto\\CaminoLaberinto.csv");
		
				laberinto.seguirCamino();
		laberinto.solucion();
	}
}
