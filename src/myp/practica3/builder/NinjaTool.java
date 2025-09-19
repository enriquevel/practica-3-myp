package myp.practica3.builder;

public enum NinjaTool {

	KUNAI("Kunai", 200.0),
	SHURIKEN("Shuriken", 150.0),
	PAPER_BOMB("Papel Bomba", 300.0),
	SMOKE_BOMB("Bomba de humo", 350.0),
	AID_KIT("Botiquín", 500.0);

	private final String name;

	private final double weight;

	NinjaTool(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public double getWeight() {
		return this.weight;
	}

}
