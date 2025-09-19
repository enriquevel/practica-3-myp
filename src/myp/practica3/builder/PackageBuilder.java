package myp.practica3.builder;

public interface PackageBuilder {

	PackageBuilder addKunai(int amount);
	PackageBuilder addShuriken(int amount);
	PackageBuilder addPaperBomb(int amount);
	PackageBuilder addSmokeBomb(int amount);
	PackageBuilder addAidKit(int amount);
	Package build();

}
