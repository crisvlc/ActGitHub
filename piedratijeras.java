package examenes;

import java.util.Scanner;

public class piedratijeras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);

	        System.out.println("Elije una opción: 1 (Piedra), 2 (Papel), 3 (Tijera)");
	        int eleccionUsuario = sc.nextInt();

	        // Generar la elección aleatoria de la computadora (1 - Piedra, 2 - Papel, 3 - Tijera)
	        int eleccionComputadora = (int) (Math.random() * 3) + 1;

	        System.out.println("La computadora eligió: " + obtenerTexto(eleccionComputadora));

	        System.out.println("Tú elegiste: " + obtenerTexto(eleccionUsuario));

	        // Determinar el ganador
	        determinarGanador(eleccionUsuario, eleccionComputadora);
	    }

	    private static void determinarGanador(int usuario, int computadora) {
	        if (usuario == computadora) {
	            System.out.println("¡Empate!");
	        } else if ((usuario == 1 && computadora == 3) || (usuario == 2 && computadora == 1) || (usuario == 3 && computadora == 2)) {
	            System.out.println("¡Ganaste!");
	        } else {
	            System.out.println("¡La computadora ganó!");
	        }
	    }

	    private static String obtenerTexto(int opcion) {
	        switch (opcion) {
	            case 1:
	                return "Piedra";
	            case 2:
	                return "Papel";
	            case 3:
	                return "Tijera";
	            default:
	                return "Opción inválida";
	        }
	}

}
