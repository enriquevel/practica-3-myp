package myp.practica3.builder;

public class PackageDirector {

	public Package getBasicPackage() {
		return new DefaultPackageBuilder().addKunai(1)
				.addShuriken(1)
				.addAidKit(1)
				.build();
	}

	public Package getAdvancedPackage() {
		return new DefaultPackageBuilder().addShuriken(2)
				.addPaperBomb(3)
				.addSmokeBomb(2)
				.addAidKit(2)
				.build();
	}

	public Package getTacticalPackage() {
		return new DefaultPackageBuilder().addKunai(3)
				.addShuriken(2)
				.addPaperBomb(4)
				.addSmokeBomb(2)
				.build();
	}

}
