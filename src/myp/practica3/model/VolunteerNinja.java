package myp.practica3.model;

/**
 * Clase que representa un ninja voluntario de la academia.
 * Los ninjas voluntarios tienen un rango específico que determina
 * cuántos aspirantes pueden supervisar simultáneamente.
 */
public class VolunteerNinja extends Ninja {

	/** El rango del ninja voluntario. */
	private Rank rank;

	/**
	 * Constructor para crear un nuevo ninja voluntario.
	 * Los ninjas voluntarios deben tener un nivel de habilidad entre 4 y 6,
	 * y un rango que determine su capacidad de supervisión de aspirantes.
	 *
	 * @param name       el nombre del ninja voluntario
	 * @param age        la edad del ninja voluntario
	 * @param clan       el clan al que pertenece el ninja voluntario
	 * @param skillLevel el nivel de habilidad del ninja voluntario
	 * @param rank 		 el rango del ninja voluntario
	 * @throws NullPointerException si el nombre, el clan o el rango son null
	 * @throws IllegalArgumentException si la edad es negativa o cero,
	 * 			o si el nivel de habilidad no está entre 4 y 6
	 */
	public VolunteerNinja(String name, short age, Clan clan, short skillLevel, Rank rank) {
		super(name, age, clan, skillLevel);

		if (skillLevel < 4 || skillLevel > 6)
			throw new IllegalArgumentException("El nivel de habilidad del voluntario ninja debe de estar entre 4-6");

		if (this.rank == null)
			throw new NullPointerException("El rango del voluntario ninja no puede ser null.");

		this.rank = rank;
	}

	/**
	 * Devuelve el rango del ninja voluntario.
	 *
	 * @return el rango del ninja voluntario
	 */
	public Rank getRank() {
		return this.rank;
	}

	/**
	 * Devuelve la capacidad máxima de aspirantes que puede supervisar.
	 * La capacidad se basa en el rango del ninja voluntario.
	 *
	 * @return el número máximo de aspirantes que puede supervisar
	 */
	public int getMaxCapacity() {
		return this.rank.getMaxCapacity();
	}
}