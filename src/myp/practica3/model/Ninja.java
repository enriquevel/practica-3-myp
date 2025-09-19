package myp.practica3.model;

/**
 * Clase abstracta base que representa un ninja genérico.
 * Define las propiedades y comportamientos fundamentales que comparten
 * todos los tipos de ninja.
 */
public abstract class Ninja {

	/** El nombre del ninja. */
	protected String name;

	/** La edad del ninja. */
	protected short age;

	/** El clan al que pertenece el ninja. */
	protected Clan clan;

	/** El nivel de habilidad del ninja */
	protected short skillLevel;

	/**
	 * Constructor protegido para inicializar un ninja con sus atributos básicos.
	 *
	 * @param name       el nombre del ninja
	 * @param age        la edad del ninja
	 * @param clan       el clan al que pertenece el ninja
	 * @param skillLevel el nivel de habilidad del ninja
	 * @throws NullPointerException si el nombre o el clan son null
	 * @throws IllegalArgumentException si la edad es negativa o cero
	 */
	protected Ninja(String name, short age, Clan clan, short skillLevel) {
		if (name == null || clan == null)
			throw new NullPointerException("El nombre y clan del ninja no pueden ser null.");

		if (age <= 0)
			throw new IllegalArgumentException("La edad del ninja debe ser positiva.");

		this.name = name;
		this.age = age;
		this.clan = clan;
		this.skillLevel = skillLevel;
	}

	/**
	 * Devuelve el nivel de habilidad del ninja.
	 *
	 * @return el nivel de habilidad del ninja
	 */
	public short getSkillLevel() {
		return this.skillLevel;
	}

	/**
	 * Devuelve el nombre del ninja.
	 *
	 * @return el nombre del ninja
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Devuelve la edad del ninja.
	 *
	 * @return la edad del ninja en años
	 */
	public short getAge() {
		return this.age;
	}

	/**
	 * Devuelve el clan al que pertenece el ninja.
	 *
	 * @return el nombre del clan del ninja
	 */
	public Clan getClan() {
		return this.clan;
	}
}