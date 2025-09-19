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
