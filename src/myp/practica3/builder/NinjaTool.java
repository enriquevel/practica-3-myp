package myp.practica3.builder;

/**
 * Enumeración que representa las diferentes herramientas ninja disponibles
 * para ser incluidas en un paquete.
 * Cada herramienta tiene un nombre descriptivo y un peso específico
 * que contribuye al peso total del paquete.
 */
public enum NinjaTool {

	/**
	 * Kunai - Herramienta ninja básica de combate y utilidad.
	 * Peso: 200.0 gramos
	 */
	KUNAI("Kunai", 200.0),

	/**
	 * Shuriken - Estrella ninja arrojadiza tradicional.
	 * Peso: 150.0 gramos
	 */
	SHURIKEN("Shuriken", 150.0),

	/**
	 * Papel bomba - Explosivo ninja activado por chakra.
	 * Peso: 300.0 gramos
	 */
	PAPER_BOMB("Papel Bomba", 300.0),

	/**
	 * Bomba de humo - Herramienta para crear cortinas de humo.
	 * Peso: 350.0 gramos
	 */
	SMOKE_BOMB("Bomba de humo", 350.0),

	/**
	 * Botiquín médico - Kit de primeros auxilios para misiones.
	 * Peso: 500.0 gramos
	 */
	AID_KIT("Botiquín", 500.0);

	/** El nombre de la herramienta ninja. */
	private final String name;

	/** El peso en gramos de la herramienta ninja. */
	private final double weight;

	/**
	 * Constructor privado para inicializar una herramienta ninja.
	 *
	 * @param name   el nombre de la herramienta
	 * @param weight el peso en gramos de la herramienta
	 */
	NinjaTool(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	/**
	 * Devuelve el nombre de la herramienta ninja.
	 *
	 * @return el nombre de la herramienta ninja.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Devuelve el peso en gramos de la herramienta ninja.
	 *
	 * @return el peso en gramos de la herramienta ninja.
	 */
	public double getWeight() {
		return this.weight;
	}
}
