package myp.practica3.model;

/**
 * Enumeración que representa los diferentes clanes ninja disponibles.
 */
public enum Clan {

	/** El clan Fuchiha. */
	FUCHIHA,

	/** El clan Osomaki. */
	OSOMAKI,

	/** El clan Naca. */
	NACA,

	/** El clan Mortalika. */
	MORTALIKA,

	/** El clan Akipichi. */
	AKIPICHI;

	/**
	 * Devuelve una representación en cadena del clan.
	 *
	 * @return una representación en cadena del clan.
	 */
	@Override
	public String toString() {
		return switch (this) {
			case FUCHIHA -> "Fuchiha";
			case OSOMAKI -> "Osomaki";
			case NACA -> "Naca";
			case MORTALIKA -> "Mortalika";
			case AKIPICHI -> "Akipichi";
		};
	}
}
