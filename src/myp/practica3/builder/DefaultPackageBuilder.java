package myp.practica3.builder;

/**
 * Implementación concreta del patrón Builder para construir paquetes de herramientas ninja.
 * Esta clase proporciona una implementación por defecto de la interfaz PackageBuilder,
 * permitiendo la construcción fluida de objetos Package mediante el encadenamiento
 * de métodos.
 */
public class DefaultPackageBuilder implements PackageBuilder {

	/** El paquete ninja que se está construyendo. */
	private final Package pack;

	/**
	 * Constructor que inicializa un nuevo builder con un paquete vacío.
	 */
	public DefaultPackageBuilder() {
		this.pack = new Package();
	}

	/**
	 * Agrega una cantidad específica de kunais al paquete en construcción.
	 *
	 * @param amount la cantidad de kunais a agregar
	 * @return esta instancia del builder para permitir encadenar métodos
	 * @throws IllegalArgumentException si la cantidad es negativa
	 */
	@Override
	public PackageBuilder addKunai(int amount) {
		if (amount < 0)
			throw new IllegalArgumentException("La cantidad de kunais no puede ser negativa.");

		this.pack.addTool(NinjaTool.KUNAI, amount);
		return this;
	}

	/**
	 * Agrega una cantidad específica de shurikens al paquete en construcción.
	 *
	 * @param amount la cantidad de shurikens a agregar
	 * @return esta instancia del builder para permitir encadenar métodos
	 * @throws IllegalArgumentException si la cantidad es negativa
	 */
	@Override
	public PackageBuilder addShuriken(int amount) {
		if (amount < 0)
			throw new IllegalArgumentException("La cantidad de shurikens no puede ser negativa.");

		this.pack.addTool(NinjaTool.SHURIKEN, amount);
		return this;
	}

	/**
	 * Agrega una cantidad específica de papeles bomba al paquete en construcción.
	 *
	 * @param amount la cantidad de papeles bomba a agregar
	 * @return esta instancia del builder para permitir encadenar métodos
	 * @throws IllegalArgumentException si la cantidad es negativa
	 */
	@Override
	public PackageBuilder addPaperBomb(int amount) {
		if (amount < 0)
			throw new IllegalArgumentException("La cantidad de papeles bomba no puede ser negativa.");

		this.pack.addTool(NinjaTool.PAPER_BOMB, amount);
		return this;
	}

	/**
	 * Agrega una cantidad específica de bombas de humo al paquete en construcción.
	 *
	 * @param amount la cantidad de bombas de humo a agregar
	 * @return esta instancia del builder para permitir encadenar métodos
	 * @throws IllegalArgumentException si la cantidad es negativa
	 */
	@Override
	public PackageBuilder addSmokeBomb(int amount) {
		if (amount < 0)
			throw new IllegalArgumentException("La cantidad de bombas de humo no puede ser negativa.");

		this.pack.addTool(NinjaTool.SMOKE_BOMB,  amount);
		return this;
	}

	/**
	 * Agrega una cantidad específica de botiquines al paquete en construcción.
	 *
	 * @param amount la cantidad de botiquines a agregar
	 * @return esta instancia del builder para permitir encadenar métodos
	 * @throws IllegalArgumentException si la cantidad es negativa
	 */
	@Override
	public PackageBuilder addAidKit(int amount) {
		if (amount < 0)
			throw new IllegalArgumentException("La cantidad de botiquines no puede ser negativa.");

		this.pack.addTool(NinjaTool.AID_KIT, amount);
		return this;
	}

	/**
	 * Construye y devuelve el paquete final con todas las herramientas agregadas.
	 *
	 * @return un nuevo objeto Package con todas las herramientas configuradas
	 * @throws IllegalStateException si el paquete está vacío
	 */
	@Override
	public Package build() {
		if (this.pack.isEmpty())
			throw new IllegalStateException("El paquete está vacío.");

		return this.pack;
	}
}
