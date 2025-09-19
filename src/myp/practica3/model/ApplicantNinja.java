package myp.practica3.model;

/**
 * Clase que representa un aspirante interesado en convertirse en ninja.
 */
public class ApplicantNinja extends Ninja {

	/**
	 * Constructor para crear un nuevo ninja aspirante.
	 * Los ninjas aspirantes deben tener un nivel de habilidad entre 1 y 3.
	 *
	 * @param name       el nombre del ninja aspirante
	 * @param age        la edad del ninja aspirante
	 * @param clan       el clan al que pertenece el ninja aspirante
	 * @param skillLevel el nivel de habilidad del ninja aspirante
	 * @throws NullPointerException si el nombre o el clan son null
	 * @throws IllegalArgumentException si la edad es negativa o cero,
	 * 			o si el nivel de habilidad no está entre 1 y 3
	 */
	public ApplicantNinja(String name, short age, Clan clan, short skillLevel) {
		super(name, age, clan, skillLevel);

		if (skillLevel < 1 || skillLevel > 3)
			throw new IllegalArgumentException("El nivel de habilidad del aspirante ninja debe de estar entre 1-3");
	}

}