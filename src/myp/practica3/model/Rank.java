package myp.practica3.model;

/**
 * Enumeración que representa los diferentes rangos ninja disponibles.
 * Cada rango tiene una capacidad máxima diferente que determina cuántos
 * ninjas aspirantes puede supervisar un ninja voluntario de ese rango.
 */
public enum Rank {

	/**
	 * Genin - Rango ninja básico de nivel más bajo.
	 * Capacidad máxima: 1 aspirante
	 */
	GENIN,

	/**
	 * Chunin - Rango ninja intermedio.
	 * Capacidad máxima: 2 aspirantes
	 */
	CHUNIN,

	/**
	 * Jonin - Rango ninja avanzado de nivel más alto.
	 * Capacidad máxima: 3 aspirantes
	 */
	JONIN;

	/**
	 * Obtiene la capacidad máxima de aspirantes que puede supervisar
	 * un ninja voluntario con este rango.
	 *
	 * @return la cantidad máxima de aspirantes que puede supervisar
	 */
	public int getMaxCapacity() {
		return switch (this) {
			case GENIN -> 1;
			case CHUNIN -> 2;
			case JONIN -> 3;
		};
	}

}