package myp.practica3.builder;

/**
 * Clase Director que proporciona métodos de conveniencia para crear
 * configuraciones predefinidas de paquetes de herramientas ninja.
 */
public class PackageDirector {

	/**
	 * Constructor por defecto del director de paquetes.
	 */
	public PackageDirector() {}

	/**
	 * Crea un paquete de herramientas ninja prefabricado básico.
	 *
	 * @return un paquete básico que contiene 1 Kunai, 1 Shuriken y 1 Botiquín
	 */
	public Package getBasicPackage() {
		return new DefaultPackageBuilder().addKunai(1)
				.addShuriken(1)
				.addAidKit(1)
				.build();
	}

	/**
	 * Crea un paquete de herramientas ninja prefabricado avanzado.
	 *
	 * @return un paquete avanzado que contiene 2 Shuriken, 3 Papeles Bomba,
	 * 			2 Bombas de Humo y 2 Botiquines
	 */
	public Package getAdvancedPackage() {
		return new DefaultPackageBuilder().addShuriken(2)
				.addPaperBomb(3)
				.addSmokeBomb(2)
				.addAidKit(2)
				.build();
	}

	/**
	 * Crea un paquete de herramientas ninja prefabricado táctico.
	 *
	 * @return un paquete táctico que contiene 3 Kunai, 2 Shuriken,
	 * 			4 Papeles Bomba y 2 Bomba de Humo
	 */
	public Package getTacticalPackage() {
		return new DefaultPackageBuilder().addKunai(3)
				.addShuriken(2)
				.addPaperBomb(4)
				.addSmokeBomb(2)
				.build();
	}

}
