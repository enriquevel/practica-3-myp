package myp.practica3.builder;

/**
 * Interfaz que define el patrón Builder para construir paquetes de herramientas ninja.
 * Permite agregar diferentes tipos de herramientas ninja de manera fluida
 * y construir un paquete completo al final del proceso.
 */
public interface PackageBuilder {

	/**
	 * Agrega una cantidad específica de kunais al paquete en construcción.
	 *
	 * @param amount la cantidad de kunais a agregar
	 * @return esta instancia del builder para permitir encadenar métodos
	 * @throws IllegalArgumentException si la cantidad es negativa
	 */
	PackageBuilder addKunai(int amount);

	/**
	 * Agrega una cantidad específica de shurikens al paquete en construcción.
	 *
	 * @param amount la cantidad de shurikens a agregar
	 * @return esta instancia del builder para permitir encadenar métodos
	 * @throws IllegalArgumentException si la cantidad es negativa
	 */
	PackageBuilder addShuriken(int amount);

	/**
	 * Agrega una cantidad específica de papeles bomba al paquete en construcción.
	 *
	 * @param amount la cantidad de papeles bomba a agregar
	 * @return esta instancia del builder para permitir encadenar métodos
	 * @throws IllegalArgumentException si la cantidad es negativa
	 */
	PackageBuilder addPaperBomb(int amount);

	/**
	 * Agrega una cantidad específica de bombas de humo al paquete en construcción.
	 *
	 * @param amount la cantidad de bombas de humo a agregar
	 * @return esta instancia del builder para permitir encadenar métodos
	 * @throws IllegalArgumentException si la cantidad es negativa
	 */
	PackageBuilder addSmokeBomb(int amount);

	/**
	 * Agrega una cantidad específica de botiquines al paquete en construcción.
	 *
	 * @param amount la cantidad de botiquines a agregar
	 * @return esta instancia del builder para permitir encadenar métodos
	 * @throws IllegalArgumentException si la cantidad es negativa
	 */
	PackageBuilder addAidKit(int amount);

	/**
	 * Construye y devuelve el paquete final con todas las herramientas agregadas.
	 *
	 * @return un nuevo objeto Package con todas las herramientas configuradas
	 * @throws IllegalStateException si el paquete está vacío
	 */
	Package build();
}
