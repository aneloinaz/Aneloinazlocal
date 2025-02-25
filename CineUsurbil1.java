import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Reto 1 de Programacion "Cine Usurbil" (2023-2024)
 * 
 * El codigo esta escrito para que sea facilmente comprensible, no
 * para ser 100% eficiente y correcto. Por tanto, que todos los
 * metodos y atributos sean publicos y estaticos (entre otras decisiones) es
 * deliberado.
 */

public class CineUsurbil {

	public static Scanner teclado = new Scanner(System.in);

	// Horas del sabado y domingo en las que hay que proyectar
	public static final int NUMERO_MINUTOS_SABADO = 480;
	public static final int NUMERO_MINUTOS_DOMINGO = 360;
	public static int tiempoRestanteSabado = NUMERO_MINUTOS_SABADO;
	public static int tiempoRestanteDomingo = NUMERO_MINUTOS_DOMINGO;

	// Claves del usuario
	public static String usuarioDelPrograma = "admin";
	public static String claveDelPrograma = "admin";

	// Peliculas disponibles con sus generos y su duracion
	public static String peliculasString = "Drama, Handia, 116 - Drama, La lista de Schindler, 197 - "
			+ "Drama, Cadena Perpetua, 144 - Drama, Million Dollar Baby, 133 - "
			+ "Comedia, Scary movie, 90 - Comedia, El gran Lebowsky, 119 - Comedia, La vida de Brian, 94 - "
			+ "Comedia, Aterriza como puedas, 88 - "
			+ "Terror, Psicosis, 109 - Terror, El resplandor, 146 - Terror, Drácula, 155 - Terror, Cisne negro, 110 - "
			+ "Ciencia, 2001: Odisea en el espacio, 144 - Ciencia, La novia de Frankenstein, 75 - "
			+ "Ciencia, El planeta de los simios, 115 - Ciencia, Alien el octavo pasajero, 117";

	// Peliculas seleccionadas por el usuario
	public static String peliculasSeleccionadasSabado = new String("");
	public static String peliculasSeleccionadasDomingo = new String("");

	// Pinta el cartel de bienvenida
	// TODO retardo de tres segundos
	public static void mostrarBienvenida() {
			System.out.println("--------------------------------");
			System.out.println("- Bienvenido a Cine Usurbil -");
			System.out.println("--------------------------------");
			System.out.println(" ");
	}

	// TODO Pedimos el login hasta que lo acierte
	public static void pedirElLogin() {
		// Cuando es correcto pinta
		System.out.println("Usuario y Clave correctos");
		// Cuando es incorrecto pinta
		System.out.println("Error!!! Usuario o Clave incorrectos");

	}

	// TODO Muestra las peliculas seleccionadas para el sabado y para el domingo
	public static void mostrarPeliculasSeleccionadas() {

	}

	// TODO Muestra el tiempo restante
	public static void mostrarTiempoRestante() {
		System.out.println(" ");
		System.out.println("Tiempo Restante del Sabado: " + );
		System.out.println("Tiempo Restante del Domingo: " + );
		System.out.println(" ");
	}

	// Pinta el menu inicial y permite escoger una opcion
	// TODO corregir función
	public static int mostrarMenuInicial() {
		int ret = -1;
		do {
			try {
				System.out.println("- Menu Inicial -");
				System.out.println("----------------");
				System.out.println("1. Drama");
				System.out.println("2. Comedia");
				System.out.println("3. Terror");
				System.out.println("4. Ciencia Ficcion");
				System.out.println("5. Ver Resumen");
				System.out.println("0. Salir");
				System.out.println(" ");
				System.out.print("Escoge una opcion: ");
				ret = teclado.nextInt();
				teclado.nextLine();
			} catch (Exception e) {
				System.out.println("Error!!! Opcion incorrecta");
				teclado.nextLine();
				ret = -1;
			}
		} while ((ret < 0) || (ret > 5));
		return ret;
	}

	// Pinta el menu inicial y permite escoger una opcion
	// TODO corregir función
	public static boolean estaDeAcuerdo() {
		boolean ret = false;
		System.out.println("Se perderan los datos guardados... ");
		System.out.print("Estas de acuerdo? [s, n]: ");
		return ret;
	}

	// Pinta el cartel de fin
	public static void mostrarFin() {
			System.out.println(" ");
			System.out.println("- Cambios confirmados -");
			System.out.println(" ");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// Control de interrupciones
			}
	}

	// TODO inicializar a valores iniciales
	public static void resetear() {
		System.out.println("- Cambios eliminados -");
	}

	// TODO Muestra las peliculas de un genero y seleccionar uno
	// Si el usuario elige "0. Atras" devolverá null si no un string "genero,titulo,duracion"
	public static String mostrarPeliculas(String[] peliculas, String genero) {
		String ret = null;
		int opcionMenuPeliculas;
		int contadorMenu;
		do {
			contadorMenu = 1;
			System.out.println(" ");
			System.out.println("- Peliculas de " + genero + " - ");
			System.out.println("----------------------------");

			// TODO imprimir peliculas 
			// EJ. 1. Handia - 116h
			//     2. La lista de Schindler - 197h
			//     ...
			//     ...
			//     0. Atras

			System.out.print("Escoge una opcion: ");
			opcionMenuPeliculas = teclado.nextInt();
			teclado.nextLine();
			// TODO comprobar si la opción esta dentro del rango de las películas
		} while ();

		return ret;
	}

	// ---------------------------------------------------------------------------------------------------------------//

	// TODO devuelve lista de peliculas
	// "genero,titulo,duración - genero,titulo,duracion" -> ["genero,titulo,duración", "genero,titulo,duración"]
	public static String[] obtenerPeliculas(String peliculasString) {
	}

	// TODO Busca las peliculas de un genero y su duracion es inferior al tiempo
	// restante, las devuelve.
	public static String[] buscarPeliculas(String genero, int tiempoRestante) {

	}

	// TODO Dice si una pelicula es de un genero o no
	public static boolean esDelGenero(String pelicula, String genero) {
	}

	// TODO Dice si ya hay una pelicula del genero el sabado
	public static boolean yaHayPeliculasDelGeneroElSabado(String genero) {

	}

	// TODO Dice si ya hay una pelicula del genero el domingo
	public static boolean yaHayPeliculasDelGeneroElDomingo(String genero) {

	}

	// TODO Dice si hay suficiente tiempo para añadir una película el sabado
	public static boolean hayHuecoParaPeliculasElSabado() {

	}

	// TODO Dice si hay suficiente tiempo para añadir una película el domingo
	public static boolean hayHuecoParaPeliculasElDomingo() {
	}

	// TODO funciones para obtener genero título y duración
	// Por ejemplo tenemos "Genero, titulo, duracion". Si se pasa a un array,
	// haciendo la separación por "," tendremos que genero en la primera posición
	// título en el segundo y duración en el tercero

	public static String obtenerGeneroPelicula(String pelicula) {

	}

	public static String obtenerTituloPelicula(String pelicula) {

	}

	public static String obtenerDuracionPelicula(String pelicula) {

	}

	// ---------------------------------------------------------------------------------------------------------------//
	// El Main de la clase

	// Main de la clase
	public static void main(String[] args) {

		int seleccionMenuInicial = 0;
		mostrarBienvenida();
		pedirElLogin();
		System.out.println(" ");

		// Bucle principal - Se sale con seleccionMenuInicial == 0
		do {

			mostrarPeliculasSeleccionadas();
			mostrarTiempoRestante();

			seleccionMenuInicial = mostrarMenuInicial();

			String peliculaSeleccionada = null;
			String[] peliculas;
			switch (seleccionMenuInicial) {
			case 1:
				if ((tiempoRestanteSabado >= 0) && (hayHuecoParaPeliculasElSabado())) {
					System.out.println("Espacio libre para peliculas el sabado");
					peliculas = buscarPeliculas("Drama", tiempoRestanteSabado);
					peliculaSeleccionada = mostrarPeliculas(peliculas, "Drama");

					// Pueden haber seleccionado 0 -> Volver...
					if (null != peliculaSeleccionada) {

						// Tenemos que añadir la pelicula al Sabado
						int duracionPelicula = Integer.parseInt(obtenerDuracionPelicula(peliculaSeleccionada));

						// ¿Hay ya peliculas del mismo genero?
						if (yaHayPeliculasDelGeneroElSabado("Drama")) {
							// No podemos añadirla...
							System.out.println("Ya hay peliculas de Drama asignadas al Sabado");
						} else {
							// Si podemos añadirla...
							System.out.println("La pelicula se asigna al sabado");
							tiempoRestanteSabado = tiempoRestanteSabado - duracionPelicula;
							if (peliculasSeleccionadasSabado.length() == 0)
								peliculasSeleccionadasSabado = peliculasSeleccionadasSabado + peliculaSeleccionada;
							else
								peliculasSeleccionadasSabado = peliculasSeleccionadasSabado + " - "
										+ peliculaSeleccionada;
						}
					}
				} else if ((tiempoRestanteDomingo >= 0) && (hayHuecoParaPeliculasElDomingo())) {
					System.out.println("No hay espacio para peliculas el sabado");
					peliculas = buscarPeliculas("Drama", tiempoRestanteDomingo);
					peliculaSeleccionada = mostrarPeliculas(peliculas, "Drama");

					// Pueden haber seleccionado 0 -> Volver...
					if (null != peliculaSeleccionada) {

						// Tenemos que añadir la pelicula al Domingo
						int duracionPelicula = Integer.parseInt(obtenerDuracionPelicula(peliculaSeleccionada));

						// ¿Hay ya peliculas del mismo genero?
						if (yaHayPeliculasDelGeneroElDomingo("Drama")) {
							// No podemos añadirla...
							System.out.println("Ya hay peliculas de Drama asignadas al Domingo");
						} else {
							// Si podemos añadirla...
							System.out.println("La pelicula se asigna al domingo");
							tiempoRestanteDomingo = tiempoRestanteDomingo - duracionPelicula;
							if (peliculasSeleccionadasDomingo.length() == 0)
								peliculasSeleccionadasDomingo = peliculasSeleccionadasDomingo
										+ peliculaSeleccionada;
							else
								peliculasSeleccionadasDomingo = peliculasSeleccionadasDomingo + " - "
										+ peliculaSeleccionada;
						}
					}
				} else {
					System.out.println("No hay espacio para peliculas ni el sabado ni el domingo");
				}

				break;
			case 2:
				if ((tiempoRestanteSabado >= 0) && (hayHuecoParaPeliculasElSabado())) {
					System.out.println("Espacio libre para peliculas el sabado");
					peliculas = buscarPeliculas("Comedia", tiempoRestanteSabado);
					peliculaSeleccionada = mostrarPeliculas(peliculas, "Comedia");

					// Pueden haber seleccionado 0 -> Volver...
					if (null != peliculaSeleccionada) {

						// Tenemos que añadir la pelicula al Sabado
						int duracionPelicula = Integer.parseInt(obtenerDuracionPelicula(peliculaSeleccionada));

						// ¿Hay ya peliculas del mismo genero?
						if (yaHayPeliculasDelGeneroElSabado("Comedia")) {
							// No podemos añadirla...
							System.out.println("Ya hay peliculas de Comedia asignadas al Sabado");
						} else {
							// Si podemos añadirla...
							System.out.println("La pelicula se asigna al sabado");
							tiempoRestanteSabado = tiempoRestanteSabado - duracionPelicula;
							if (peliculasSeleccionadasSabado.length() == 0)
								peliculasSeleccionadasSabado = peliculasSeleccionadasSabado + peliculaSeleccionada;
							else
								peliculasSeleccionadasSabado = peliculasSeleccionadasSabado + " - "
										+ peliculaSeleccionada;
						}
					}
				} else if ((tiempoRestanteDomingo >= 0) && (hayHuecoParaPeliculasElDomingo())) {
					System.out.println("No hay espacio para peliculas el sabado");
					peliculas = buscarPeliculas("Comedia", tiempoRestanteDomingo);
					peliculaSeleccionada = mostrarPeliculas(peliculas, "Comedia");

					// Pueden haber seleccionado 0 -> Volver...
					if (null != peliculaSeleccionada) {

						// Tenemos que añadir la pelicula al Domingo
						int duracionPelicula = Integer.parseInt(obtenerDuracionPelicula(peliculaSeleccionada));

						// ¿Hay ya peliculas del mismo genero?
						if (yaHayPeliculasDelGeneroElDomingo("Comedia")) {
							// No podemos añadirla...
							System.out.println("Ya hay peliculas de Comedia asignadas al Domingo");
						} else {
							// Si podemos añadirla...
							System.out.println("La pelicula se asigna al domingo");
							tiempoRestanteDomingo = tiempoRestanteDomingo - duracionPelicula;
							if (peliculasSeleccionadasDomingo.length() == 0)
								peliculasSeleccionadasDomingo = peliculasSeleccionadasDomingo
										+ peliculaSeleccionada;
							else
								peliculasSeleccionadasDomingo = peliculasSeleccionadasDomingo + " - "
										+ peliculaSeleccionada;
						}
					}
				} else {
					System.out.println("No hay espacio para peliculas ni el sabado ni el domingo");
				}

				break;
			case 3:
				if ((tiempoRestanteSabado >= 0) && (hayHuecoParaPeliculasElSabado())) {
					System.out.println("Espacio libre para peliculas el sabado");
					peliculas = buscarPeliculas("Terror", tiempoRestanteSabado);
					peliculaSeleccionada = mostrarPeliculas(peliculas, "Terror");

					// Pueden haber seleccionado 0 -> Volver...
					if (null != peliculaSeleccionada) {

						// Tenemos que añadir la pelicula al Sabado
						int duracionPelicula = Integer.parseInt(obtenerDuracionPelicula(peliculaSeleccionada));

						// ¿Hay ya peliculas del mismo genero?
						if (yaHayPeliculasDelGeneroElSabado("Terror")) {
							// No podemos añadirla...
							System.out.println("Ya hay peliculas de Terror asignadas al Sabado");
						} else {
							// Si podemos añadirla...
							System.out.println("La pelicula se asigna al sabado");
							tiempoRestanteSabado = tiempoRestanteSabado - duracionPelicula;
							if (peliculasSeleccionadasSabado.length() == 0)
								peliculasSeleccionadasSabado = peliculasSeleccionadasSabado + peliculaSeleccionada;
							else
								peliculasSeleccionadasSabado = peliculasSeleccionadasSabado + " - "
										+ peliculaSeleccionada;
						}
					}
				} else if ((tiempoRestanteDomingo >= 0) && (hayHuecoParaPeliculasElDomingo())) {
					System.out.println("No hay espacio para peliculas el sabado");
					peliculas = buscarPeliculas("Terror", tiempoRestanteDomingo);
					peliculaSeleccionada = mostrarPeliculas(peliculas, "Terror");

					// Pueden haber seleccionado 0 -> Volver...
					if (null != peliculaSeleccionada) {

						// Tenemos que añadir la pelicula al Domingo
						int duracionPelicula = Integer.parseInt(obtenerDuracionPelicula(peliculaSeleccionada));

						// ¿Hay ya peliculas del mismo genero?
						if (yaHayPeliculasDelGeneroElDomingo("Terror")) {
							// No podemos añadirla...
							System.out.println("Ya hay peliculas de Terror asignadas al Domingo");
						} else {
							// Si podemos añadirla...
							System.out.println("La pelicula se asigna al domingo");
							tiempoRestanteDomingo = tiempoRestanteDomingo - duracionPelicula;
							if (peliculasSeleccionadasDomingo.length() == 0)
								peliculasSeleccionadasDomingo = peliculasSeleccionadasDomingo
										+ peliculaSeleccionada;
							else
								peliculasSeleccionadasDomingo = peliculasSeleccionadasDomingo + " - "
										+ peliculaSeleccionada;
						}
					}
				} else {
					System.out.println("No hay espacio para peliculas ni el sabado ni el domingo");
				}

				break;
			case 4:
				if ((tiempoRestanteSabado >= 0) && (hayHuecoParaPeliculasElSabado())) {
					System.out.println("Espacio libre para peliculas el sabado");
					peliculas = buscarPeliculas("Ciencia", tiempoRestanteSabado);
					peliculaSeleccionada = mostrarPeliculas(peliculas, "Ciencia");

					// Pueden haber seleccionado 0 -> Volver...
					if (null != peliculaSeleccionada) {

						// Tenemos que añadir la pelicula al Sabado
						int duracionPelicula = Integer.parseInt(obtenerDuracionPelicula(peliculaSeleccionada));

						// ¿Hay ya peliculas del mismo genero?
						if (yaHayPeliculasDelGeneroElSabado("Ciencia")) {
							// No podemos añadirla...
							System.out.println("Ya hay peliculas de Ciencia asignadas al Sabado");
						} else {
							// Si podemos añadirla...
							System.out.println("La pelicula se asigna al sabado");
							tiempoRestanteSabado = tiempoRestanteSabado - duracionPelicula;
							if (peliculasSeleccionadasSabado.length() == 0)
								peliculasSeleccionadasSabado = peliculasSeleccionadasSabado + peliculaSeleccionada;
							else
								peliculasSeleccionadasSabado = peliculasSeleccionadasSabado + " - "
										+ peliculaSeleccionada;
						}
					}
				} else if ((tiempoRestanteDomingo >= 0) && (hayHuecoParaPeliculasElDomingo())) {
					System.out.println("No hay espacio para peliculas el sabado");
					peliculas = buscarPeliculas("Ciencia", tiempoRestanteDomingo);
					peliculaSeleccionada = mostrarPeliculas(peliculas, "Ciencia");

					// Pueden haber seleccionado 0 -> Volver...
					if (null != peliculaSeleccionada) {

						// Tenemos que añadir la pelicula al Domingo
						int duracionPelicula = Integer.parseInt(obtenerDuracionPelicula(peliculaSeleccionada));

						// ¿Hay ya peliculas del mismo genero?
						if (yaHayPeliculasDelGeneroElDomingo("Ciencia")) {
							// No podemos añadirla...
							System.out.println("Ya hay peliculas de Ciencia asignadas al Domingo");
						} else {
							// Si podemos añadirla...
							System.out.println("La pelicula se asigna al domingo");
							tiempoRestanteDomingo = tiempoRestanteDomingo - duracionPelicula;
							if (peliculasSeleccionadasDomingo.length() == 0)
								peliculasSeleccionadasDomingo = peliculasSeleccionadasDomingo
										+ peliculaSeleccionada;
							else
								peliculasSeleccionadasDomingo = peliculasSeleccionadasDomingo + " - "
										+ peliculaSeleccionada;
						}
					}
				} else {
					System.out.println("No hay espacio para peliculas ni el sabado ni el domingo");
				}

				break;
			case 5:
				/**
				 * TODO Ver Resumen
				 */
				if (estaDeAcuerdo()) {
					mostrarFin();
				} else {
					resetear();
				}
				break;
			case 0:
				System.out.println("Adios!!");
				break;
			default:
				System.out.println("Este mensaje no deberia mostrarse");
			}

		} while (seleccionMenuInicial != 0);

		teclado.close();
	}
}